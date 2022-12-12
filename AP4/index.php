<?php
      // Connexion à la base de données
      try
      {
          $bdd = new PDO('mysql:host=localhost;dbname=AP4;charset=utf8', 'root', '');
      }
      catch(Exception $e){
            die( 'Erreur : '.$e->getMessage()   );
      }

      // On récupère les 5 derniers billets
      $statement = $bdd->query('SELECT id, titre, contenu, DATE_FORMAT(date_creation, \'%d/%m/%Y à %Hh%imin%ss\') AS date_creation_fr FROM billets ORDER BY date_creation DESC LIMIT 0, 5');


      while (($row = $statement->fetch()))
        {
          $post = [
          'title' => $row['titre'],
          'french_creation_date' => $row['date_creation_fr'],
          'content' => $row['contenu'],
            ];
        $posts[] = $post;
        }



      $statement->closeCursor();

      ?>

      <?php
      foreach ($posts as $post) {
      ?>
           






        <?php
require('templates.php');
    }
    ?>                  


