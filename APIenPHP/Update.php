<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include 'Conexion.php';

    if (!empty($_POST['document']) and !empty($_POST['name']) and !empty($_POST['last_name']) ) {

        $document = $_POST['document'];
        $name = $_POST['name'];
        $last_name = $_POST['last_name'];
        $phone = $_POST['phone'];
        $address = $_POST['address'];
        $email = $_POST['email'];

        try {
            $list = $data_base->prepare("UPDATE people SET name=:nom, last_name=:ape, phone=:tel, address=:dir, email=:ema WHERE document = :doc ");

            $list->bindParam(':doc', $document);
            $list->bindParam(':nom', $name);
            $list->bindParam(':ape', $last_name);
            $list->bindParam(':tel', $phone);
            $list->bindParam(':dir', $address);
            $list->bindParam(':ema', $email);
            
            $process = $list->execute();

            if( $process ){
                $response = [
                                'status' => true,
                                'mesagge' => "OK##CLIENT##UPDATE"
                              ];
                echo json_encode($response);
            }else{
                $response = [
                                'status' => false,
                                'mesagge' => "ERROR##CLIENT##UPDATE"
                              ];
                echo json_encode($response);
            }
        } catch (Exception $e) {
            $response = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($response);
        }
    }else{
        $response = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST",
                        '$_GET' => $_GET,
                        '$_POST' => $_POST
                      ];
        echo json_encode($response);
    }
?>
