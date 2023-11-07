CREATE DATABASE porcinos CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE administrador(
    id_administrador CHAR(10) PRIMARY KEY,
    nombre CHAR(30),
    correo  CHAR(100),
    passw CHAR(100),
    contacto CHAR(30)
)ENGINE=InnoDB;
INSERT INTO administrador (id_administrador, nombre, correo, passw, contacto)
VALUES ('1', 'administrador', 'administrador@email.com', '12345', 'Contacto del Administrador');


CREATE TABLE fincas(
    id_finca CHAR(6) PRIMARY KEY,
    nombre CHAR(30),
    ubicacion CHAR(30),
    id_administrador CHAR(10),

    FOREIGN KEY (id_administrador) REFERENCES administrador (id_administrador)
)ENGINE=InnoDB;
INSERT INTO fincas (id_finca, nombre, ubicacion, id_administrador)
VALUES ('F001', 'Finca 1', 'Ubicación 1', '1');

-- Insertar el segundo dato en la tabla fincas
INSERT INTO fincas (id_finca, nombre, ubicacion, id_administrador)
VALUES ('F002', 'Finca 2', 'Ubicación 2', '1');

CREATE TABLE porcicultor(
    id_porcicultor CHAR(6) PRIMARY KEY,
    nombre CHAR(30),
    apellido CHAR(30),
    contacto CHAR(12),
    correo CHAR(60),
    experiencia VARCHAR(250),
    passw CHAR(20),
    id_finca CHAR(6),

    FOREIGN KEY (id_finca) REFERENCES fincas (id_finca)
)ENGINE=InnoDB;

-- Insertar el primer dato en la tabla porcicultor
INSERT INTO porcicultor (id_porcicultor, nombre, apellido, contacto, correo, experiencia, passw, id_finca)
VALUES ('P001', 'Juan', 'Esteban', '123456789', 'juan@email.com', 'Experiencia 1', '12345', 'F001');

-- Insertar el segundo dato en la tabla porcicultor
INSERT INTO porcicultor (id_porcicultor, nombre, apellido, contacto, correo, experiencia, passw, id_finca)
VALUES ('P002', 'Andres', 'Cuervo', '987654321', 'cuervo@email.com', 'Experiencia 2', '12345', 'F002');


CREATE TABLE cerdos(
    id_cerdo CHAR(6) PRIMARY KEY,
    raza CHAR(30),
    sexo ENUM('HEMBRA','MACHO'),
    peso FLOAT(9,2),
    fecha DATE,
    estado ENUM('ENFERMO','ALIBIADO','MUERTO'),
    id_finca CHAR(6),

    FOREIGN KEY (id_finca) REFERENCES fincas (id_finca)
)ENGINE=InnoDB;

-- Insertar datos en la tabla cerdos
INSERT INTO cerdos (id_cerdo, raza, sexo, peso, fecha, estado, id_finca)
VALUES
    ('C001', 'Raza1', 'MACHO', 150.00, '2023-01-01', 'ENFERMO', 'F001'),
    ('C002', 'Raza2', 'HEMBRA', 120.50, '2023-01-02', 'ALIBIADO', 'F002'),
    ('C003', 'Raza3', 'MACHO', 180.75, '2023-01-03', 'MUERTO', 'F001'),
    ('C004', 'Raza1', 'HEMBRA', 100.25, '2023-01-04', 'ALIBIADO', 'F002'),
    ('C005', 'Raza2', 'MACHO', 140.75, '2023-01-05', 'ALIBIADO', 'F001'),
    ('C006', 'Raza3', 'HEMBRA', 110.00, '2023-01-06', 'ALIBIADO', 'F002'),
    ('C007', 'Raza1', 'MACHO', 160.50, '2023-01-07', 'ALIBIADO', 'F001'),
    ('C008', 'Raza2', 'HEMBRA', 130.25, '2023-01-08', 'ALIBIADO', 'F002'),
    ('C009', 'Raza3', 'MACHO', 170.00, '2023-01-09', 'ALIBIADO', 'F001'),
    ('C010', 'Raza1', 'HEMBRA', 110.75, '2023-01-10', 'ALIBIADO', 'F002');


CREATE TABLE venta(
    id_venta CHAR(6) PRIMARY KEY,
    precio_peso INT,
    subtotal INT,
    id_cerdo CHAR(6),

    FOREIGN KEY (id_cerdo) REFERENCES cerdos (id_cerdo)
)ENGINE=InnoDB;

CREATE TABLE factura(
    id_factura CHAR(6) PRIMARY KEY,
    id_venta CHAR(6),
    fecha DATE,
    total INT,
    id_administrador CHAR(10),

    FOREIGN KEY (id_venta) REFERENCES venta (id_venta),
    FOREIGN KEY (id_administrador) REFERENCES administrador (id_administrador)
)ENGINE=InnoDB;