<?php 
	header("Access-Control-Allow-Origin: * "); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
	header("Access-Control-Allow-Methods: GET, POST");
	header("Access-Control-Allow-Headers: Content-Type");

    include '../Conexion.php';

    if (!empty($_GET['id_cerdo'])) {
	    $consulta = $base_de_datos->query("SELECT * FROM cerdos WHERE id_cerdo = ".$_GET['id_cerdo']);
	    $datos = $consulta->fetchAll();
		echo json_encode((sizeof($datos)>0)? $datos[0] : $datos);
	}else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##GET",
                        '$_GET' => $_GET,
                        '$_POST' => $_POST
                      ];
        echo json_encode($respuesta);
    }
    
?>

