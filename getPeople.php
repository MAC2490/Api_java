<?php 
	header("Access-Control-Allow-Origin: * "); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
	header("Access-Control-Allow-Methods: GET, POST");
	header("Access-Control-Allow-Headers: Content-Type");

    include 'Conexion.php';

    if (!empty($_GET['document'])) {
	    $list = $data_base->query("SELECT * FROM people WHERE document = ".$_GET['document']);
	    $data = $list->fetchAll();
		echo json_encode((sizeof($data)>0)? $data[0] : $data);
	}else{
        $answer = [
                        'status' => false,
                        'mesagge' => "ERROR##DATA##GET",
                        '$_GET' => $_GET,
                        '$_POST' => $_POST
                      ];
        echo json_encode($answer);
    }
    
?>

