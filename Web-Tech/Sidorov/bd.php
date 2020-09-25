<?php

$dbhost='localhost';
$dbusername='root';
$dbpass='';
$dbname='books';

$dbconnect = @mysqli_connect ($dbhost, $dbusername, $dbpass); 

$query='CREATE DATABASE IF NOT EXISTS users';
mysqli_query ($dbconnect, $query);

if(@mysqli_select_db($dbconnect,$dbname)) { echo "Подключение к базе $dbname установлено!"; } else { 
die ("Невозможно подключение к $dbname!");
}
mysqli_query($dbconnect,"SET NAMES 'windows-1251'");
$query='CREATE TABLE IF NOT EXISTS users (
id INT NOT NULL AUTO_INCREMENT ,
login VARCHAR( 20 ) NOT NULL ,
password VARCHAR( 35 ) NOT NULL ,
PRIMARY KEY (id)
)';
mysqli_query ($dbconnect,$query);
echo mysqli_error($dbconnect);
?>
