<?php 
	header("Access-Control-Allow-Origin: * "); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost
	header("Access-Control-Allow-Methods: GET, POST");
	header("Access-Control-Allow-Headers: Content-Type");

    include '../Conexion.php';

    if (!empty($_GET['correo_usuario'])) {
	    $consultaAdmin = $base_de_datos->query("SELECT * FROM administrador WHERE correo = ".$_GET['correo_usuario']);
	    $datosAdmin = $consultaAdmin->fetchAll();

        $consultaPorci = $base_de_datos->query("SELECT * FROM porcicultor WHERE correo = ".$_GET['correo_usuario']);
	    $datosPorci = $consultaPorci->fetchAll();

        if (sizeof($datosAdmin)>0) {
            echo json_encode((sizeof($datosAdmin)>0)? $datosAdmin[0] : $datosAdmin);
            
        }else if (sizeof($datosPorci)>0) {
            echo json_encode((sizeof($datosPorci)>0)? $datosPorci[0] : $datosPorci);
        }
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

