<html>
<head><title> TD4 </title>

<link href="projet.css" media="all" rel="stylesheet" type="text/css" />
</head>
<body>
<form method ="POST" action=inscription2.php

<div class="container">
  <div class="left">
    <div class="header">

     <center> <h2 class="animation a1">Inscription</h2>
    </div>
    <div class="form">
      <input type="Login" class="form-field animation a3" placeholder="Login" name="login">
      <input type="Mot de passe" class="form-field animation a4" placeholder="Mot de passe" name="mdp">
      <input type="Répeter le mot de passe" class="form-field animation a4" placeholder="Répeter le mot de passe" name="repeter">
      <input type="Nom" class="form-field animation a4" placeholder="Nom" name="nom">
      <input type="Prenom" class="form-field animation a4" name="prenom" placeholder="prenom">
      <input type="email" class="form-field animation a4" placeholder="email" name="email">
      <input type="date" class="form-field animation a4" placeholder="date" name="jj/mm/aaaa">
      
 <div align="light">  <br>
<br>Sexe</div>
<div>
  <input type="radio" id="Homme" name="Sexe" value="2"
         checked>
  <label for="2">Homme</label>
</div>

<div>
  <input type="radio" id="Femme" name="Sexe" value="1">
  <label for="1">Femme</label>
</div>

<div align="light">  <br>
<br>Année du bac</div>
<select name="Annee_BAC">
          <option selected>Annee</option>
            <?php
$Year = date("Y");
                for($i=2000; $i <= $Year-10; $i++)
                {
                    echo "<option>".$i."</option>";
                }          
            ?>
          </select>




<br><button Hhhjghg class="animation a6">S'inscrire</button>
    </div>
  </div>
  <div class="right"></div>
</div>



</body>
</html>
