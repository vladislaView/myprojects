<?php include_once("bd.php"); ?>
<!DOCTYPE HTML>
<html lang="ru">
<head>
<meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
<link rel="stylesheet" type="text/css" href="style.css" media="all" />
<title>форма</title>
</head>
<body>
	<html lang="ru">
<head>
<meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
<title>форма</title>
</head>
<body>
<div id="container">
  <!-- Begin Header Wrapper -->
  <div id="page-top">
    <div id="header-wrapper">
      <!-- Begin Header -->
      <div id="header">
        <div id="logo"><a href="indexl.html"><img src="style/images/logo.png" alt="" /></a></div>
        <!-- Logo -->
        <!-- Begin Menu -->
        <div id="menu-wrapper">
          <div id="smoothmenu1" class="ddsmoothmenu">
            <ul>
              <li><a href="indexl.html" class="selected">Главная</a></li>
              <li><a href="portfolio.html">Товары</a></li>
              <li><a href="contact.html">О нас</a></li>
              <li><a href="addTovar.html">Добавить товар</a></li>
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
      <h3>Выход</h3>
      <p></p>
      <br />
      <!-- Begin Form -->
      <div class="contact-left">
        <div id="contact-form">
<?php
if (empty($_SESSION['login']) or empty($_SESSION['password'])) {
	exit ("<p>Доступ на эту страницу разрешен только зарегистрированным пользователям.</p><p>Если вы зарегистрированы, то войдите на сайт под своим логином и паролем</p><br><a href='../index.html'>Главная страница</a>");
}

unset($_SESSION['password']);
unset($_SESSION['login']); 
unset($_SESSION['id']);// уничтожаем переменные в сессиях

exit("<meta http-equiv='Refresh' content='0; URL=../index.html'>");
?>
       <!-- End Form -->
        <br>
      </div>
      <br>
     </div>
     </div><br>
      
    </div>
    <!-- End Content -->
  </div>
  <!-- End Wrapper -->
  <div class="clearfix"></div>
  <div class="push"></div>
  <!-- Begin Footer -->
  <div id="footer-wrapper">
    <div id="footer">
      <div id="footer-content">
        <!-- Begin Copyright -->
        <div id="copyright">
          <p>Copyright &copy; </p>
        </div>
        <!-- End Copyright -->
        <!-- Begin Social Icons -->
        <div id="socials">
          <ul>
            <li><a href="#"><img src="style/images/icon-rss.png" alt="" /></a></li>
            <li><a href="#"><img src="style/images/icon-twitter.png" alt="" /></a></li>
            <li><a href="#"><img src="style/images/icon-dribble.png" alt="" /></a></li>
            <li><a href="#"><img src="style/images/icon-tumblr.png" alt="" /></a></li>
            <li><a href="#"><img src="style/images/icon-flickr.png" alt="" /></a></li>
            <li><a href="#"><img src="style/images/icon-facebook.png" alt="" /></a></li>
          </ul>
        </div>
        <!-- End Social Icons -->
      </div>
    </div>
  </div>
  <!-- End Footer -->
</div>

</body>
</html>
</body>
</html>
