<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['id_venta']) and !empty($_POST['precio_peso']) and !empty($_POST['subtotal']) and !empty($_POST['id_cerdo']) ) {

        $id_venta = $_POST['id_venta'];
        $precio_peso = $_POST['precio_peso'];
        $subtotal = $_POST['subtotal'];
        $id_cerdo = $_POST['id_cerdo'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO venta (id_venta,precio_peso,subtotal,id_cerdo) VALUES(:id, :pp, :sub, :cerdo ) ");

            $consulta->bindParam(':id', $id_venta);
            $consulta->bindParam(':pp', $precio_peso);
            $consulta->bindParam(':sub', $subtotal);
            $consulta->bindParam(':cerdo', $id_cerdo);
            
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##CLIENT##INSERT"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##CLIENT##INSERT"
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
