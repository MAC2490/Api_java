<?php

$server = 'localhost';
$user = 'root';
$password = '';
$data_base_name = 'app_java';

try{
   $data_base = new PDO("mysql:host=$server;dbname=$data_base_name", $user, $password);
}catch(Exception $e){
   echo 'Ha surgido un error y no se puede conectar a la base de datos. Detalle: ' . $e->getMessage();
   exit;
}