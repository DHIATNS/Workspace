<?php
session_start();
?>
<html>
    <head> <link href="style.css" media="all" rel="stylesheet" type="text/css"/> </head>
    <body>

<?php


      if (isset($_POST['deco']))
            {
              session_destroy();
              //détruit la session après clique sur bouton deconnexion
              //echo "deconnectée";
            } 
?>
<form method="POST" action="accueil.php">
    login:<input type="text" name="login"><br>
    mot de passe:<input type="password" name="mdp"><br>
    <input type="submit" name="envoi" value="OK">
</form>

</html>