<? session_start();?>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="utf-8" />
      <title><?= $title ?></title>
      <link href="style.css" rel="stylesheet" /> 
   </head>
<form method="POST">
<label><b>login</b></label>
 <input type="text" placeholder="Entrer le login" name="login" required>
 <label><b>Mot de passe</b></label>
 <input type="password" placeholder="Entrer le mot de passe" name="mdp" required>
<input class="favorite styled"
       type="button"
       value="Connexion">

   <?php $user=Test_connexion("NATHANBRO","password");  ?>

   <body>
      <?= $content ?>
   </body>
</html>
