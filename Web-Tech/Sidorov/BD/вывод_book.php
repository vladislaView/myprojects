<html lang="ru">
<head>
<meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
<title>�����</title>
</head>
<body>

<?php
$dbhost='localhost';
$dbusername='root';
$dbpass='';
$dbname='books';

	// ����������� � �������� ��
	$dbconnect =@mysqli_connect ($dbhost, $dbusername, $dbpass);

	// ������� ��
	@mysqli_select_db($dbconnect,$dbname) or die(mysqli_error($dbconnect));

	// SQL-������
	$strSQL = "SELECT * FROM books";

	// ��������� ������ (����� ������ $rs �������� ���������)
	$rs = mysqli_query($dbconnect,$strSQL);
	
	 // ������� �� �������� ����� ��������� HTML-�������
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
	
	// ���� �� recordset $rs
	// ������ ��� ���������� �������� ($row) � ������� ������� mysql_fetch_array
	while($row = mysqli_fetch_array($rs)) {

	   // �������� �������� ������� FirstName (������� �������� ������ �������� $row)
	echo '<tr>';
		echo '<td>' . $row['ISBN'] . '</td>';
		echo '<td>' . $row['author'] . '</td>';
		echo '<td>' .$row['title'] . '</td>';
		echo '<td>' .$row['price'] . '</td>';
		echo '<td>' .$row['quantity'] . '</td>';
	echo '</tr>';
	}
	echo '</tbody>';
	// ������� ���������� � ��
	mysqli_close($dbconnect);

?>
</body>
</html>