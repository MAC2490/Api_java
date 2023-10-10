<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");

    include 'Conexion.php';

    if (!empty($_POST['document'])) {
        $document = $_POST['document'];

        try {
            $list = $data_bases->prepare("DELETE FROM people WHERE document = :doc ");

            $list->bindParam(':doc', $document);
            $process = $list->execute();

            if ( $process ) {
                $answer = [ // respuesta
                            'status' => true,
                            'message' => "OK##DELETE",
                          ];
                echo json_encode($answer);
            }else {
                $answer = [
                            'status' => false,
                            'message' => "ERROR##DELETE",
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
    }else {
        $answer = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST",
                        '$_GET' => $_GET,
                        '$_POST' => $_POST
                  ];
        echo json_encode($answer);
    }
?>