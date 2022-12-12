<?php
$login = $_POST['login'];
$nom = $_POST['nom'];
$prenom = $_POST['prenom'];
$password = $_POST['mdp'];
$email = $_POST['email'];
$repeter = $_POST['repeter'];
$Sexe = $_POST['Sexe'];
$Annee_BAC = $_POST['Annee_BAC'];
$date = $_POST['jj/mm/aaaa'];

echo "Bonjour ".$prenom." ".$nom;

if (empty($login) || empty($password) || empty($repeter) || empty($nom) || empty($prenom) || empty($email))
{ 
echo " Veuillez remplir tous les champs";
}
else
{
    if ($password !=$repeter)
    {
     echo " Les mots de passes doivent etre identique";
    }

     else
    {

        include '_conf.php';

    if($connexion = mysqli_connect($serveur, $user, $mdp, $BDD))
    {
    	
    	echo ' Félicitation, vous êtes connecté à la BDD';

$requete = "Insert into ADHERENT (login,nom,prenom,password,email,dateNaissance,Sexe,Annee_BAC) VALUE ('$login','$nom','$prenom','$password','$email','$date','$Sexe','$Annee_BAC') ";
echo "<hr>$requete<hr>";
if (!mysqli_query($connexion,$requete))
{
echo "<br>ERREUR : ".mysqli_error($connexion)."<br>";
}    	



     	mysqli_close($connexion);
     
     }
     else 
     {
     	echo 'Erreur'; // On affiche un message d'erreur
   }


    //4

    //5




  echo " Votre inscription a bien été pris en compte";
    }

}











?>
