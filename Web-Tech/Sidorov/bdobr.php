<?php

$dbhost='localhost';
$dbusername='root';
$dbpass='';
$dbname='books';

$dbconnect = @mysqli_connect ($dbhost, $dbusername, $dbpass); 

$query='CREATE DATABASE IF NOT EXISTS books';
mysqli_query ($dbconnect, $query);

if(@mysqli_select_db($dbconnect,$dbname)) { echo "<h1><br></h1>"; } else { 
die ("Невозможно подключение к $dbname!<br>");
}
mysqli_query($dbconnect,"SET NAMES 'windows-1251'");
$query='CREATE TABLE IF NOT EXISTS obr (
id INT NOT NULL AUTO_INCREMENT ,
name VARCHAR( 20 ) NOT NULL ,
email VARCHAR( 35 ) NOT NULL ,
comment VARCHAR( 253 ) NOT NULL,
PRIMARY KEY (id)
)';
mysqli_query ($dbconnect,$query);
echo mysqli_error($dbconnect);
?>
