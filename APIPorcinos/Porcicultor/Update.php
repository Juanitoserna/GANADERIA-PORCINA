<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['id_cerdos']) and !empty($_POST['raza']) and !empty($_POST['sexo']) and !empty($_POST['peso']) and !empty($_POST['fecha']) and !empty($_POST['id_finca'])) {

        $id_cerdos = $_POST['id_cerdos'];
        $raza = $_POST['raza'];
        $sexo = $_POST['sexo'];
        $peso = $_POST['peso'];
        $fecha = $_POST['fecha'];
        $id_finca = $_POST['id_finca'];

        try {
            $consulta = $base_de_datos->prepare("UPDATE personas SET raza=:raz, sexo=:sex, peso=:pes, fecha=:fec, id_finca=:finca WHERE id_cerdos = :id ");

            $consulta->bindParam(':raz', $id_cerdos);
            $consulta->bindParam(':sex', $raza);
            $consulta->bindParam(':pes', $sexo);
            $consulta->bindParam(':fec', $peso);
            $consulta->bindParam(':finca', $fecha);
            $consulta->bindParam(':id', $id_finca);
            
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
