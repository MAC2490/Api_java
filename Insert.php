<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include 'Conexion.php';

    if (!empty($_POST['document']) and !empty($_POST['name']) and !empty($_POST['last_name']) ) {

        $documento = $_POST['document'];
        $name = $_POST['name'];
        $last_name = $_POST['last_name'];
        $phone = $_POST['phone'];
        $address = $_POST['address'];
        $email = $_POST['email'];

        try {
            $list = $data_base->prepare("INSERT INTO people (document, name, last_name, phone, address, email) VALUES(:doc, :nam, :las, :pho, :add, :ema) ");

            $list->bindParam(':doc', $documento);
            $list->bindParam(':nam', $name);
            $list->bindParam(':las', $last_name);
            $list->bindParam(':pho', $phone);
            $list->bindParam(':add', $address);
            $list->bindParam(':ema', $email);
            
            $process = $list->execute();

            if( $process ){
                $answer = [
                                'status' => true,
                                'mesagge' => "OK##CLIENT##INSERT"
                              ];
                echo json_encode($answer);
            }else{
                $answer = [
                                'status' => false,
                                'mesagge' => "ERROR##CLIENT##INSERT"
                              ];
                echo json_encode($answer);
            }
        } catch (Exception $e) {
            $answer = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($answer);
        }
    }else{
        $answer = [
                        'status' => false,
                        'mesagge' => "ERROR##DATA##POST",
                        '$_GET' => $_GET,
                        '$_POST' => $_POST
                      ];
        echo json_encode($answer);
    }
?>
