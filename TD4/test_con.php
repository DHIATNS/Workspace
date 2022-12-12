<?php
// on se connecte à MySQL 
if($connexion = mysqli_connect('localhost', 'root', '', 'REBAA_TD4'))
    {
    	// Si la connexion a réussi 
    	echo 'Félicitation, vous êtes connecté à la BDD';
    
    	//on oublie pas de fermer la connexion
     	mysqli_close($connexion);
     
     }
     else // Mais si elle rate
     {
     	echo 'Erreur'; // On affiche un message d'erreur
   }

?> 
