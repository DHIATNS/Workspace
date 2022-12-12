<?php
session_start();
?>

<html>
<head> <link href="style.css" media="all" rel="stylesheet" type="text/css"/> </head>
<body> </html>
<?php
include '_conf.php';
if ($_SESSION["type"] ==1) //si connexion en prof
  {
    ?>
    <html>
    <ul class="nav">
    <li><a href="accueil.php">Accueil</a></li>
    <li><a href="perso.php">Profil</a></li>
    <li><a href="cr.php">Compte rendus</a></li>
    </ul> </html> <?php
  }
else
  {
    ?>
    <html>
    <ul class="nav">
    <li><a href="accueil.php">Accueil</a></li>
    <li><a href="perso.php">Profil</a></li>
    <li><a href="cr.php">Compte rendus</a></li>
    <li><a href="ccr.php">Nouveau compte-rendu</a></li>
    </ul> </html> <?php
  }


if($connexion = mysqli_connect($serveurBDD,$userBDD,$mdpBDD,$nomBDD))
     { 
$id=$_SESSION["id"];
$requete="SELECT * FROM UTILISATEUR WHERE UTILISATEUR.num=$_SESSION[id]";



$resultat = mysqli_query($connexion, $requete);
while($donnees = mysqli_fetch_assoc($resultat))
          {

        $num=$donnees['num'];
        $nom=$donnees['nom'];
        $prenom=$donnees['prenom'];
        $tel=$donnees['tel'];
        $login=$donnees['login'];
        $motdepasse=$donnees['motdepasse'];
        $type=$donnees['type'];
        $email=$donnees['email'];
        $option=$donnees['option'];
        $num_stage=$donnees['num_stage'];

if ($donnees['option']==1) {
$option="slam";
}
else {
$option="sisr";
}
if ($donnees['type']==0) {
$type="prof";
}
else {
$type="eleve";
}
}

echo "Num : $num";
echo"<br>";
echo "Nom : $nom";
echo"<br>";
echo "Prenom : $prenom";
echo"<br>";
echo "Tel : $tel";
echo"<br>";
echo "Login : $login";
echo"<br>";
echo "Type : $type";
echo"<br>";
echo "Email : $email";
echo"<br>";
echo "Option : $option";
echo"<br>";






}
