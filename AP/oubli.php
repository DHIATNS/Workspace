
<?php

if (isset($_POST['email']))
{
     $lemail=$_POST['email'];
     echo "le formulaire a été envoyé avec comme email la valeur : ".$lemail."<br>";

 include '_conf.php';

    if($bdd=mysqli_connect($serveur,$user,$mdp,$BDD))
    {
          echo" Connexion BDD reussi !"; 
}

            $requete="Select * from UTILISATEUR WHERE email='$lemail'";
            //echo "<hr>$requete<hr><hr>";
            $resultat = mysqli_query($bdd, $requete);
            $etat=0;
    
	            while($donnees = mysqli_fetch_assoc($resultat))
	            {
                
   

		            $login =$donnees['login']; //mettre le nom du champ dans la table
		            $mdp =$donnees['motdepasse'];	
              //      echo "youhouuuu";
                    $etat=1;
	            }

            if ($etat==0)
            {
                echo "ERREUR l'email n'existe pas dans la BDD";

            }

            else
            {

                echo "L'email existe bien nous allons vous envoyer un email avec votre mot de passe";
            }


                
               $comb = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890';
               $pass = array(); 
               $combLen = strlen($comb) - 1; 
               for ($i = 0; $i < 8; $i++) {
                      $n = rand(0, $combLen);
                      $pass[] = $comb[$n];
                }
              $mdp=(implode($pass)); 

                
                $texte="Bonjour, voici votre mot de passe = $mdp";
                //echo $texte;
                mail($lemail, 'sioreport : mot de passe oublié', $texte);


                $mdp=md5($mdp); 
                //A faire après la sélection BDD
                    $requete="UPDATE UTILISATEUR SET `motdepasse` ='$mdp' WHERE `UTILISATEUR`.`login` = '$login'";
                //echo "<hr>$requete<hr>";
                    if (!mysqli_query($bdd,$requete)) 
                    {
                           echo "<br>Erreur : ".mysqli_error($bdd)."<br>";
                    }
}
else
{
?>

<form method ="POST" action=oubli.php>
<center>
<input type="input" name="email" value="Saisir @ mail">
<br><br>
<input type="submit" value="Confirmer">
</form>
<?php 
}
?>
