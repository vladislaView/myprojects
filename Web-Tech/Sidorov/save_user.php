<!DOCTYPE HTML>
<html lang="en-US">
<head>
<title>Регистрация</title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css" media="all" />

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
      <h3>Регистрация</h3>
      
      <br />
      <!-- Begin Form -->
      <div class="contact-left">
        <div id="contact-form">
          <!--begin:notice message block-->
          <div id="note"></div>
          <!--begin:notice message block-->
<?php
if (isset($_POST['login'])) { $login = $_POST['login']; if ($login == '') { unset($login);} } //заносим введенный пользователем логин в переменную $login, если он пустой, то уничтожаем переменную
if (isset($_POST['password'])) { $password=$_POST['password']; if ($password =='') { unset($password);} }
//заносим введенный пользователем пароль в переменную $password, если он пустой, то уничтожаем переменную

if (empty($login) or empty($password)) //если пользователь не ввел логин или пароль, то выдаем ошибку и останавливаем скрипт
{
exit ("Вы не ввели логин и пароль!");
}
//если логин и пароль введены,то обрабатываем их, чтобы теги и скрипты не работали, мало ли что люди могут ввести
$login = stripslashes($login);
$login = htmlspecialchars($login);

$password = stripslashes($password);
$password = htmlspecialchars($password);

//удаляем лишние пробелы
$login = trim($login);
$password = trim($password);


// подключаемся к базе
include ("bd.php");// файл bd.php должен быть в той же папке, что и все остальные, если это не так, то просто измените путь 

// проверка на существование пользователя с таким же логином
$result = mysqli_query($dbconnect,"SELECT id FROM users WHERE login='$login'");
$myrow = mysqli_fetch_array($result);
if (!empty($myrow['id'])) {
exit ("Извините, введённый вами логин уже зарегистрирован. Введите другой логин.");
}

// если такого нет, то сохраняем данные
$result2 = mysqli_query ($dbconnect,"INSERT INTO users (login,password) VALUES('$login','$password')");
// Проверяем, есть ли ошибки
if ($result2=='TRUE')
{
echo "<p>Вы успешно зарегистрированы! Теперь вы можете зайти на сайт. <a href='login.php'>Главная страница</a></p>";
}

else {
echo "Ошибка! Вы не зарегистрированы.";
     }
?>
          </div>
           
    </div></div></div>
  <!-- End Wrapper -->
 
  <div class="clearfix"></div>
  <div class="push"></div>


  <!-- Begin Footer -->
  <div id="footer-wrapper">
    <div id="footer">
      <div id="footer-content">
        <!-- Begin Copyright -->
        <div id="copyright">
          <p>Copyright &copy;</p>
        </div>
        <!-- End Copyright -->
        <!-- Begin Social Icons -->

        <!-- End Social Icons -->
      </div>
    </div>
  </div>
  <!-- End Footer -->
</div>
</body>
</html>