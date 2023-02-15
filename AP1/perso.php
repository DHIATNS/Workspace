<?php
session_start();
?>

<html>
<head> <link href="style.css" media="all" rel="stylesheet" type="text/css"/> </head>
<body> 
<?php
include 'conf.php';
echo "Vous êtes connecté en tant que ".$_SESSION["id"]. $_SESSION["prenom"]."<br> <br>";
if ($_SESSION["type"] ==1) //si connexion en prof
  {
    ?>
    <html>
    <ul class="nav">
    <li><a href="accueil.php">Accueil</a></li>
    <li><a href="perso.php">Profil</a></li>
    <li><a href="cr.php">Compte rendus</a></li>
    </ul> </html> <?php

//Afficher le profil du prof
       
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



  
?>

<?php



//Afficher le profil de l'eleve, Rajouter une date de naissance dans utilisateur et afficher l'age de l'utilisateur sur sa page profil
if($connexion = mysqli_connect($serveurBDD,$userBDD,$mdpBDD,$nomBDD))
      {
        $id=$_SESSION["id"];     
        $requete="SELECT * FROM utilisateur WHERE utilisateur.num=$_SESSION[id]"; 
        $resultat = mysqli_query($connexion, $requete);
        while($donnees = mysqli_fetch_assoc($resultat))
        {
          $nom=$donnees['nom'];
          $prenom=$donnees['prenom'];
          $email=$donnees['email'];
          $tel=$donnees['tel'];
          $date_naissance=$donnees['date_naissance'];

            echo " Votre nom: $nom <br>";
            echo " Votre prenom: $prenom <br>";
            echo " Votre email: $email <br>";
            echo " Votre numéro de telephone: $tel <br>";
            $dateNaissance = $date_naissance;
            $aujourdhui = date("Y-m-d");
            $diff = date_diff(date_create($dateNaissance), date_create($aujourdhui));
            echo 'Votre age est de '.$diff->format('%y').' ans';
          }
            
           
            
           
          }




          //Afficher le profil de l'eleve
if($connexion = mysqli_connect($serveurBDD,$userBDD,$mdpBDD,$nomBDD))
{
  $id=$_SESSION["id"];     
  $requete="SELECT tuteur.* FROM tuteur, utilisateur, stage WHERE utilisateur.num_stage=stage.num AND stage.num_tuteur=tuteur.num AND utilisateur.num=$_SESSION[id]"; 
  $resultat = mysqli_query($connexion, $requete);
  while($donnees = mysqli_fetch_assoc($resultat))
  {
    $num=$donnees['num'];
    $nom=$donnees['nom'];
    $prenom=$donnees['prenom'];
    $email=$donnees['email'];
    $tel=$donnees['tel'];
    

      echo " Votre num: $num <br>";  
      echo " Votre nom: $nom <br>";
      echo " Votre prenom: $prenom <br>";
      echo " Votre email: $email <br>";
      echo " Votre numéro de telephone: $tel <br>";
      
    }
      
  
      
     
    }


    //Dans la page profil de l'élève afficher l'ensemble des informations de son tuteur.
    if($connexion = mysqli_connect($serveurBDD,$userBDD,$mdpBDD,$nomBDD))
    {
      $id=$_SESSION["id"]; 
      $requete="SELECT tuteur.* , utilisateur.nom as nomutilisateur FROM utilisateur,stage,tuteur WHERE utilisateur.num_stage=stage.num AND stage.num_tuteur=tuteur.num AND utilisateur.num=$_SESSION[id]"; 
      $resultat = mysqli_query($connexion, $requete);
  while($donnees = mysqli_fetch_assoc($resultat))
  {
    $num=$donnees['num'];
    $nom=$donnees['nom'];
    $prenom=$donnees['prenom'];
    $email=$donnees['email'];
    $tel=$donnees['tel'];
   
      echo "<br><br> <br><br><br><br>"; 
      echo " Le numero du tuteur: $num <br>";  
      echo " Le nom du tuteur nom: $nom <br>";
      echo " Votre prenom: $prenom <br>";
      echo " Le email du tuteur: $email <br>";
      echo " Le numéro de telephone du tuteur : $tel <br>";
    
    }   
    }
    
    

        
    

?>