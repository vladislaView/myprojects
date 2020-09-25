<html lang="ru">
<head>
<meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
<title>форма</title>
</head>
<body>

<?php
$dbhost='localhost';
$dbusername='root';
$dbpass='';
$dbname='books';

	// Соединиться с сервером БД
	$dbconnect =@mysqli_connect ($dbhost, $dbusername, $dbpass);

	// Выбрать БД
	@mysqli_select_db($dbconnect,$dbname) or die(mysqli_error($dbconnect));

	// SQL-запрос
	$strSQL = "SELECT * FROM books";

	// Выполнить запрос (набор данных $rs содержит результат)
	$rs = mysqli_query($dbconnect,$strSQL);
	
	 // выводим на страницу сайта заголовки HTML-таблицы
    echo '<table border="1" width=50%>';
	echo '<thead>';
		echo '<tr>';
			echo '<th>ISBN</th>';
			echo '<th>Author</th>';
			echo '<th>Title</th>';
			echo '<th>Price</th>';
			echo '<th>Quantity</th>';
		echo '</tr>';
	echo '</thead>';
	
	echo '<tbody>';
	
	// Цикл по recordset $rs
	// Каждый ряд становится массивом ($row) с помощью функции mysql_fetch_array
	while($row = mysqli_fetch_array($rs)) {

	   // Записать значение столбца FirstName (который является теперь массивом $row)
	echo '<tr>';
		echo '<td>' . $row['ISBN'] . '</td>';
		echo '<td>' . $row['author'] . '</td>';
		echo '<td>' .$row['title'] . '</td>';
		echo '<td>' .$row['price'] . '</td>';
		echo '<td>' .$row['quantity'] . '</td>';
	echo '</tr>';
	}
	echo '</tbody>';
	// Закрыть соединение с БД
	mysqli_close($dbconnect);

?>
</body>
</html>