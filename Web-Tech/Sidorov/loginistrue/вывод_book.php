
<!DOCTYPE HTML>
<html lang="en-US">
<head>
<title>Войти</title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style2.css" media="all" />

</head>
<body>
<div id="container">
  <!-- Begin Header Wrapper -->
  <div id="page-top">
    <div id="header-wrapper">
      <!-- Begin Header -->
      <div id="header">
        <div id="logo"><a href="index.html"><img src="style/images/logo.png" alt="" /></a></div>
        <!-- Logo -->
        <!-- Begin Menu -->
        <div id="menu-wrapper">
          <div id="smoothmenu1" class="ddsmoothmenu">
            <ul>
              <li><a href="index.html">Главная</a></li>
              <li><a href="portfolio.html">Товары</a></li>
              <li><a href="contact.html">О нас</a></li>
            </ul>
          </div>
        </div>
        <!-- End Menu -->
      </div>
      <!-- End Header -->
    </div>
  </div>
  <!-- End Header Wrapper -->
  <!-- Begin Wrapper -->

  <div id="wrapper">
    <!-- Begin Content -->
    <div class="content">
      <h3>Просмотр товара</h3>
      
      <!-- Begin Form -->
      <div class="contact-left">
        <div id="contact-form">
          <!--begin:notice message block-->
          <div id="note"></div>
          <!--begin:notice message block-->


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
    echo '<table border="2" width=25%>';
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
	echo '</tr><br>';
	}
	echo '</tbody>';
	// Закрыть соединение с БД
	mysqli_close($dbconnect);

?></div></div></div><br></div></div>
</body>
</html>