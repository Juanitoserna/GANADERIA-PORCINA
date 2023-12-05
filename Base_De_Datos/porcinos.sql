-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-12-2023 a las 05:31:33
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `porcinos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `id_administrador` char(10) NOT NULL,
  `nombre` char(30) DEFAULT NULL,
  `correo` char(100) DEFAULT NULL,
  `passw` char(100) DEFAULT NULL,
  `contacto` char(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`id_administrador`, `nombre`, `correo`, `passw`, `contacto`) VALUES
('1', 'administrador', 'administrador@email.com', '12345', 'Contacto del Administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cerdos`
--

CREATE TABLE `cerdos` (
  `id_cerdo` char(6) NOT NULL,
  `raza` char(30) DEFAULT NULL,
  `sexo` enum('HEMBRA','MACHO') DEFAULT NULL,
  `peso` float(9,2) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `estado` enum('ENFERMO','ALIBIADO','MUERTO') DEFAULT NULL,
  `id_finca` char(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `cerdos`
--

INSERT INTO `cerdos` (`id_cerdo`, `raza`, `sexo`, `peso`, `fecha`, `estado`, `id_finca`) VALUES
('C001', 'Raza1', 'MACHO', 150.00, '2023-01-01', 'ENFERMO', 'F001'),
('C002', 'Raza2', 'HEMBRA', 120.50, '2023-01-02', 'ALIBIADO', 'F002'),
('C003', 'Raza3', 'MACHO', 180.75, '2023-01-03', 'MUERTO', 'F001'),
('C004', 'Raza1', 'HEMBRA', 100.25, '2023-01-04', 'ALIBIADO', 'F002'),
('C005', 'Raza2', 'MACHO', 140.75, '2023-01-05', 'ALIBIADO', 'F001'),
('C006', 'Raza3', 'HEMBRA', 110.00, '2023-01-06', 'ALIBIADO', 'F002'),
('C007', 'Raza1', 'MACHO', 160.50, '2023-01-07', 'ALIBIADO', 'F001'),
('C008', 'Raza2', 'HEMBRA', 130.25, '2023-01-08', 'ALIBIADO', 'F002'),
('C009', 'Raza3', 'MACHO', 170.00, '2023-01-09', 'ALIBIADO', 'F001');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `id_factura` char(6) NOT NULL,
  `id_venta` char(6) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `id_administrador` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fincas`
--

CREATE TABLE `fincas` (
  `id_finca` char(6) NOT NULL,
  `nombre` char(30) DEFAULT NULL,
  `ubicacion` char(30) DEFAULT NULL,
  `id_administrador` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `fincas`
--

INSERT INTO `fincas` (`id_finca`, `nombre`, `ubicacion`, `id_administrador`) VALUES
('F001', 'Finca 1', 'Ubicaci?n 1', '1'),
('F002', 'Finca 2', 'Ubicaci?n 2', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peso_cerdos`
--

CREATE TABLE `peso_cerdos` (
  `id` int(10) NOT NULL,
  `id_cerdo` char(6) DEFAULT NULL,
  `nuevo_peso` float(9,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `peso_cerdos`
--

INSERT INTO `peso_cerdos` (`id`, `id_cerdo`, `nuevo_peso`) VALUES
(1, 'C001', 12.00),
(2, 'C001', 12.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `porcicultor`
--

CREATE TABLE `porcicultor` (
  `id_porcicultor` char(6) NOT NULL,
  `nombre` char(30) DEFAULT NULL,
  `apellido` char(30) DEFAULT NULL,
  `contacto` char(12) DEFAULT NULL,
  `correo` char(60) DEFAULT NULL,
  `experiencia` varchar(250) DEFAULT NULL,
  `passw` char(20) DEFAULT NULL,
  `id_finca` char(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `porcicultor`
--

INSERT INTO `porcicultor` (`id_porcicultor`, `nombre`, `apellido`, `contacto`, `correo`, `experiencia`, `passw`, `id_finca`) VALUES
('P001', 'Juan', 'Esteban', '123456789', 'juan@email.com', 'Experiencia 1', '12345', 'F001'),
('P002', 'Andres', 'Cuervo', '987654321', 'cuervo@email.com', 'Experiencia 2', '12345', 'F002');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `id_venta` char(6) NOT NULL,
  `precio_peso` int(11) DEFAULT NULL,
  `subtotal` int(11) DEFAULT NULL,
  `id_cerdo` char(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id_administrador`);

--
-- Indices de la tabla `cerdos`
--
ALTER TABLE `cerdos`
  ADD PRIMARY KEY (`id_cerdo`),
  ADD KEY `id_finca` (`id_finca`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`id_factura`),
  ADD KEY `id_venta` (`id_venta`),
  ADD KEY `id_administrador` (`id_administrador`);

--
-- Indices de la tabla `fincas`
--
ALTER TABLE `fincas`
  ADD PRIMARY KEY (`id_finca`),
  ADD KEY `id_administrador` (`id_administrador`);

--
-- Indices de la tabla `peso_cerdos`
--
ALTER TABLE `peso_cerdos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_cerdo` (`id_cerdo`);

--
-- Indices de la tabla `porcicultor`
--
ALTER TABLE `porcicultor`
  ADD PRIMARY KEY (`id_porcicultor`),
  ADD KEY `id_finca` (`id_finca`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`id_venta`),
  ADD KEY `id_cerdo` (`id_cerdo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `peso_cerdos`
--
ALTER TABLE `peso_cerdos`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cerdos`
--
ALTER TABLE `cerdos`
  ADD CONSTRAINT `cerdos_ibfk_1` FOREIGN KEY (`id_finca`) REFERENCES `fincas` (`id_finca`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`id_venta`) REFERENCES `venta` (`id_venta`),
  ADD CONSTRAINT `factura_ibfk_2` FOREIGN KEY (`id_administrador`) REFERENCES `administrador` (`id_administrador`);

--
-- Filtros para la tabla `fincas`
--
ALTER TABLE `fincas`
  ADD CONSTRAINT `fincas_ibfk_1` FOREIGN KEY (`id_administrador`) REFERENCES `administrador` (`id_administrador`);

--
-- Filtros para la tabla `peso_cerdos`
--
ALTER TABLE `peso_cerdos`
  ADD CONSTRAINT `peso_cerdos_ibfk_1` FOREIGN KEY (`id_cerdo`) REFERENCES `cerdos` (`id_cerdo`);

--
-- Filtros para la tabla `porcicultor`
--
ALTER TABLE `porcicultor`
  ADD CONSTRAINT `porcicultor_ibfk_1` FOREIGN KEY (`id_finca`) REFERENCES `fincas` (`id_finca`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`id_cerdo`) REFERENCES `cerdos` (`id_cerdo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
