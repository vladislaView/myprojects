<!DOCTYPE HTML>
<html lang="en-US">
<head>
<title>�����</title>
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
              <li><a href="index.html">�������</a></li>

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
      <h3>�����</h3>
      
      <br />
      <!-- Begin Form -->
      <div class="contact-left">
        <div id="contact-form">
          <!--begin:notice message block-->
          <div id="note"></div>
          <!--begin:notice message block-->
<?php
session_start();// ��� ��������� �������� �� �������. ������ � ��� �������� ������ ������������, ���� �� ��������� �� �����. ����� ����� ��������� �� � ����� ������ ���������!!!

if (isset($_POST['login'])) { $login = $_POST['login']; if ($login == '') { unset($login);} } //������� ��������� ������������� ����� � ���������� $login, ���� �� ������, �� ���������� ����������
if (isset($_POST['password'])) { $password=$_POST['password']; if ($password =='') { unset($password);} }
//������� ��������� ������������� ������ � ���������� $password, ���� �� ������, �� ���������� ����������

if (empty($login) or empty($password)) //���� ������������ �� ���� ����� ��� ������, �� ������ ������ � ������������� ������
{
exit ("<p>�� ����� �� ��� ����������, �������� ����� � ��������� ��� ����!</p>");
}
//���� ����� � ������ �������,�� ������������ ��, ����� ���� � ������� �� ��������, ���� �� ��� ���� ����� ������
$login = stripslashes($login);
$login = htmlspecialchars($login);

$password = stripslashes($password);
$password = htmlspecialchars($password);

//������� ������ �������
$login = trim($login);
$password = trim($password);


// ������������ � ����
include ("bd.php");// ���� bd.php ������ ���� � ��� �� �����, ��� � ��� ���������, ���� ��� �� ���, �� ������ �������� ���� 



$result = mysqli_query($dbconnect,"SELECT * FROM users WHERE login='$login'"); //��������� �� ���� ��� ������ � ������������ � ��������� �������
$myrow = mysqli_fetch_array($result);
if (empty($myrow['password']))
{
//���� ������������ � ��������� ������� �� ����������
exit ("<p>��������, �������� ���� ����� ��� ������ ��������.</p>");
}
else {
//���� ����������, �� ������� ������
          if ($myrow['password']==$password) {
          //���� ������ ���������, �� ��������� ������������ ������! ������ ��� ����������, �� �����!
          $_SESSION['login']=$myrow['login']; 
          $_SESSION['id']=$myrow['id'];//��� ������ ����� ����� ������������, ��� �� � ����� "������ � �����" �������� ������������
          echo "<p>�� ������� ����� �� ����! <a href='loginistrue/indexl.html'>������� ��������</a></p>";
          }

       else {
       //���� ������ �� �������
       exit ("<p>��������, �������� ���� ����� ��� ������ ��������.</p>");
	   }
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