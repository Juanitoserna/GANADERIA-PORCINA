<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['id_finca']) and !empty($_POST['nombre']) and !empty($_POST['ubicacion']) and !empty($_POST['id_administrador']) ) {

        $id_finca = $_POST['id_finca'];
        $nombre = $_POST['nombre'];
        $ubicacion = $_POST['ubicacion'];
        $id_administrador = $_POST['id_administrador'];

        try {
            $consulta = $base_de_datos->prepare("UPDATE personas SET nombre=:nom, ubicacion=:ubi, id_administrador=:admi WHERE id_finca = :id ");

            $consulta->bindParam(':id', $id_finca);
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':ubi', $ubicacion);
            $consulta->bindParam(':admi', $id_administrador);
            
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##CERDO##UPDATE"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##CERDO##UPDATE"
                              ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST",
                        '$_GET' => $_GET,
                        '$_POST' => $_POST
                      ];
        echo json_encode($respuesta);
    }
?>
