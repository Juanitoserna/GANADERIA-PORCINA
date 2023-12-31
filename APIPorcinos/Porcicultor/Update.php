<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['id_porcicultor']) and !empty($_POST['nombre']) and !empty($_POST['apellido']) and !empty($_POST['contacto']) and !empty($_POST['correo']) and !empty($_POST['experiencia']) and !empty($_POST['passw']) and !empty($_POST['id_finca'])) {

        $id_porcicultor = $_POST['id_porcicultor'];
        $nombre = $_POST['nombre'];
        $apellido = $_POST['apellido'];
        $contacto = $_POST['contacto'];
        $correo = $_POST['correo'];
        $experiencia = $_POST['experiencia'];
        $passw = $_POST['passw'];
        $id_finca = $_POST['id_finca'];

        try {:id, 
            $consulta = $base_de_datos->prepare("UPDATE porcicultor SET nombre=:nom, apellido=:ape, contacto=:con, correo=:cor, experiencia=:exp, passw=:pas, id_finca=:finca WHERE id_porcicultor = :id ");

            $consulta->bindParam(':id', $id_porcicultor);
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':ape', $apellido);
            $consulta->bindParam(':con', $contacto);
            $consulta->bindParam(':cor', $correo);
            $consulta->bindParam(':exp', $experiencia);
            $consulta->bindParam(':pas', $passw);
            $consulta->bindParam(':finca', $id_finca);
            
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
