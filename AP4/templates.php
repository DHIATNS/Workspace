<!DOCTYPE html>
<html>
   <head>
      <meta charset="utf-8" />
      <title>Le blog de l'AVBN</title>
      <link href="style.css" rel="stylesheet" />
   </head>

   <body>
      <h1>Le super blog de l'AVBN !</h1>
      <p>Derniers billets du blog :</p>
<div class="news">
                <h3>
                    <?php echo htmlspecialchars($post['title']); ?>
                    <em>le <? echo $post ['french_creation_date']; ?></em>
                </h3>
                <p>
                    <?php

                    echo nl2br(htmlspecialchars($post['content']));  
                    ?>
                    <br />
                    <em><a href="#">Commentaires</a></em>
                </p>
            </div>
          </html>
