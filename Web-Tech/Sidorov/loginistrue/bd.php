<?php
$dbhost='localhost';
$dbusername='root';
$dbpass='';
$dbname='books';

$dbconnect = @mysqli_connect ($dbhost, $dbusername, $dbpass); 

$query='CREATE DATABASE IF NOT EXISTS books';
mysqli_query ($dbconnect, $query);

if(@mysqli_select_db($dbconnect,$dbname)) { echo "Подключение к базе $dbname установлено!"; } else { 
die ("Невозможно подключение к $dbname!");
}
mysqli_query($dbconnect,"SET NAMES 'windows-1251'");
$query='CREATE TABLE IF NOT EXISTS books (
    ISBN CHAR(30),
    author VARCHAR(30),
    title VARCHAR(60),
    price FLOAT(4),
    quantity INT(60)
)';
mysqli_query ($dbconnect,$query);
echo mysqli_error($dbconnect);

/*$query='INSERT INTO books (ISBN, author, title, price, quantity)
           VALUES ("5-8459-0184-7", "Зандстра Мэт",
                   "Освой самостоятельно PHP4 за 24 часа", "150", "6")';*/
//mysqli_query ($dbconnect,$query);

?>
