<?php
session_start();
$login = $_POST['login'];
$password = $_POST['mdp'];
echo "login = $login"; 
echo "mdp = $password";

   include '_conf.php';



$connexion = mysqli_connect('localhost', 'root', '', 'REBAA_TD4');
$requete = "Select * from ADHERENT WHERE login= '$login' and password= '$password'";
$resultat = mysqli_query($connexion, $requete);
    
    	// Si la connexion a réussi 
    	echo 'Félicitation, vous êtes connecté à la BDD';
    
    	//on oublie pas de fermer la connexion
     	mysqli_close($connexion);
     
     
   
   
?>
