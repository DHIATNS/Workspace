<html>
<head><title> AP </title>

</head>
<body>

<?php 
if (isset($_POST['send_con']))
{
    $Login = $_POST['ident'];
    $pass = $_POST['pass'];
    echo "Login = $Login"; 
    echo"<br>";
    echo "pass = $pass";
    $passmd5=md5($pass);
}


$requete="Select * from UTILISATEUR where Login = '$Login' and motdepasse = '$passmd5'";
echo "<hr>$requete<hr>";
$resultat = mysqli_query($bdd, $requete);
$trouve=1;
while ($donnees = mysqli_fetch_assoc($resultat))
{
   $trouve=1;
   $id=$donnees['id'];
   $type=$donnees['type'];
   $login =$donnees['login'];
}
if($trouve==1)
{

echo"tres bien";

}
else
{

echo"ERREUUUUUR";

}

?>



















