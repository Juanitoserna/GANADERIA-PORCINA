<?php 
	header("Access-Control-Allow-Origin: * "); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost
	header("Access-Control-Allow-Methods: GET, POST");
	header("Access-Control-Allow-Headers: Content-Type");

    include '../Conexion.php';

    if (!empty($_POST['correo_usuario']) && !empty($_POST['password_usuario'])) {
	    $consultaAdmin = $base_de_datos->query("SELECT * FROM administrador WHERE correo = '".$_POST['correo_usuario']."' AND passw = '".md5($_POST['password_usuario'])."'");
	    $datosAdmin = $consultaAdmin->fetchAll();

        $consultaPorci = $base_de_datos->query("SELECT * FROM porcicultor WHERE correo = '".$_POST['correo_usuario']."' AND passw = '".md5($_POST['password_usuario'])."'");

	    $datosPorci = $consultaPorci->fetchAll();

        if (sizeof($datosAdmin)>0) {
            $respuesta = [
                'status' => true,
                'mesagge' => "OK##PROCESS",
                'tipo_user' => 'administrador',
                'data_user' => $datosAdmin[0]
            ];
            echo json_encode($respuesta);
        }else if (sizeof($datosPorci)>0) {
            $respuesta = [
                'status' => true,
                'mesagge' => "OK##PROCESS",
                'tipo_user' => 'porcicultor',
                'data_user' => $datosPorci[0]
            ];
            echo json_encode($respuesta);
        }else{
            $respuesta = [
                'status' => false,
                'mesagge' => "USER##NOT##FOUND"
            ];
            echo json_encode($respuesta);
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

