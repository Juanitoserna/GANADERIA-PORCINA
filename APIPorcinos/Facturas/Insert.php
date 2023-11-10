<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include '../Conexion.php';

    if (!empty($_POST['id_factura']) and !empty($_POST['id_venta']) and !empty($_POST['fecha']) and !empty($_POST['total']) and !empty($_POST['id_administrador']) ) {

        $id_factura = $_POST['id_factura'];
        $id_venta = $_POST['id_venta'];
        $fecha = $_POST['fecha'];
        $total = $_POST['total'];
        $id_administrador = $_POST['id_administrador'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO factura (id_factura,id_venta,fecha,total,id_administrador) VALUES(:id, :venta, :fec, :tot, :admi ) ");

            $consulta->bindParam(':id', $id_factura);
            $consulta->bindParam(':venta', $id_venta);
            $consulta->bindParam(':fec', $fecha);
            $consulta->bindParam(':tot', $total);
            $consulta->bindParam(':admi', $id_administrador);
            
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
