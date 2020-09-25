<?php
// вся процедура работает на сесиях. Именно в ней хранятся данные пользователя, пока он находится на сайте. Очень важно запустить их в самом начале странички!!!
session_start();
?>
<!DOCTYPE HTML>
<html lang="en-US">
<head>
<title>Регистрация</title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css" media="all" />

<link rel="stylesheet" type="text/css" href="stylesheet/960.css" media="all" />
<link rel="stylesheet" type="text/css" href="stylesheet/color.css" media="screen" />

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
      <h3>Регистрация</h3>
      
      <br />
      <!-- Begin Form -->
      <div class="contact-left">
        <div id="contact-form">
          <!--begin:notice message block-->
          <div id="note"></div>
          <!--begin:notice message block-->
<form action="save_user.php" method="post">
<!--**** save_user.php - это адрес обработчика. То есть, после нажатия на кнопку "Зарегистрироваться", данные из полей отправятся на страничку save_user.php методом "post" ***** --><label>Ваш логин:*<br></label>
  <p>
    
    <input name="login" type="text" size="15" maxlength="15">
  </p>
<!--**** В текстовое поле (name="login" type="text") пользователь вводит свой логин ***** -->  <label>Ваш пароль:<br></label>
  <p>
    
    <input name="password" type="password" size="15" maxlength="15">
  </p>
<!--**** В поле для паролей (name="password" type="password") пользователь вводит свой пароль ***** -->  
<p>
<input type="submit" name="submit" value="Зарегистрироваться">
<!--**** Кнопочка (type="submit") отправляет данные на страничку save_user.php ***** -->  
</p></form>

        </div>
		<br>
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