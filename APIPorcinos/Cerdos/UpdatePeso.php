<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['id_cerdo']) and !empty($_POST['peso'])) {

        $id_cerdo = $_POST['id_cerdo'];
        $peso = $_POST['peso'];

        try {
            $consulta = $base_de_datos->prepare("UPDATE cerdos SET  peso=:pes WHERE id_cerdo = :id ");

            $consulta->bindParam(':id', $id_cerdo);
            $consulta->bindParam(':pes', $peso);
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
