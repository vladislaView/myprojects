<html lang="ru">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8" />
<title>�����</title>
</head>
<body>

<?php
include ('bd.php');
$isbn = $_POST['isbn']; 
$author = $_POST['author']; 
$title = $_POST['title'];
$price = $_POST['price'];
$quantity = $_POST['quantity'];

$query = 'INSERT INTO books (isbn, author, title, price, quantity )
 VALUES("'.$isbn.'", "'.$author.'", "'.$title.'", "'.$price.'", "'.$quantity.'")';

 if(!mysqli_query($dbconnect,$query))
 {echo '<center><p><b>������ ��� ���������� ������!</b></p></center>';}
 else
 {echo '<center><p><b>������ ���������!</b></p></center>';}

?>

</body>
</html>