<?php
// вся процедура работает на сесиях. Именно в ней хранятся данные пользователя, пока он находится на сайте. Очень важно запустить их в самом начале странички!!!
session_start();
?>
<!DOCTYPE HTML>
<html lang="en-US">
<head>
<title>Войти</title>
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
      <h3>Войти</h3>
      
      <br />
      <!-- Begin Form -->
      <div class="contact-left">
        <div id="contact-form">
          <!--begin:notice message block-->
          <div id="note"></div>
          <!--begin:notice message block-->
          <form action="testreg.php" method="post">
<!--**** testreg.php - это адрес обработчика. То есть, после нажатия на кнопку "Войти", данные из полей отправятся на страничку testreg.php методом "post" ***** --><label>Ваш логин:<br></label>
  <p>
    
    <input name="login" type="text" size="15" maxlength="15">
  </p>
<!--**** В текстовое поле (name="login" type="text") пользователь вводит свой логин ***** -->  <label>Ваш пароль:<br></label>
  <p>
    
    <input name="password" type="password" size="15" maxlength="15">
  </p>
<!--**** В поле для паролей (name="password" type="password") пользователь вводит свой пароль ***** -->  
<p>
<input type="submit" name="submit" value="Войти">
<!--**** Кнопочка (type="submit") отправляет данные на страничку testreg.php ***** --> 
<br>
<!--**** ссылка на регистрацию, ведь как-то же должны гости туда попадать ***** --> 
<a href="reg.php">Зарегистрироваться</a> 
</p></form>
    <br>
		<br>
<?php
// Проверяем, пусты ли пересменные логина и id пользователя
if (empty($_SESSION['login']) or empty($_SESSION['id']))
{
// Если пусты, то мы не выводим ссылку
echo "Вы вошли на сайт, как гость<br><a href='loginistrue/indexl.html'>Эта ссылка доступна только зарегистрированным пользователям</a>";
}
else
   {
   // Если не пусты, то мы выводим ссылку
    echo "Вы вошли на сайт, как ".$_SESSION['login']."<br><a href='loginistrue/indexl.html'>Эта ссылка доступна только зарегистрированным пользователям</a>";
   }
?></div>
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