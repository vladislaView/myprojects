<html lang="en-US">
<head>
<title>Отзыв</title>
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
      
      
      <br />
      <!-- Begin Form -->
      <div class="contact-left">
        <div id="contact-form">
          <!--begin:notice message block-->
          <div id="note"></div>

<?php
include ('bdobr.php');
$name = $_POST['name']; 
$email = $_POST['email'];
$comment= $_POST['comment'];

$query = 'INSERT INTO obr ( name, email, comment )
 VALUES("'.$name.'", "'.$email.'", "'.$comment.'")';

 if(!mysqli_query($dbconnect,$query))
 {echo '<center><p><b>Ошибка при добавлении данных!</b></p></center>';}
 else
 {echo '<center><h1>Спасибо за отзыв!</h1></center><br><br><br><br>';}

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