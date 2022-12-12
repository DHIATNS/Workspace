<?php

//récupération variable
$email=$_POST["email"];
$mdp=$_POST["mdp"];

 
//on se connecte à la BDD
$pdo = new pdo ('mysql:host=localhost;dbname=td8_bloc3','root','');

//on prépare la requête
$stmt = $pdo->query("SELECT * FROM acheteur WHERE email= ? and motdepasse= ?");

//on l'éxecute avec les 2 paramètres ?
$stmt->execute([$email, $mdp]);

//on met la ligne de résultat dans $ligne
$ligne=$stmt->fetch();


