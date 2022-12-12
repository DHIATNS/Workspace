<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Le blog de l'AVBN</title>
<link href="style.css" rel="stylesheet"/>
</head>
<body>
<h1>Le super blog de l'AVBN !</h1>
<p><a href="index.php">Retour à la liste des billets</a></p>
<div class="news">
<h3>
</h3>
<?= htmlspecialchars(Spost['title'])?>
<em>le <?= $post['french creation date'] ?></em>
<p>
</p>
</div>
<?=n|2br(htmlspecialchars($post['content']))?>
<h2>Commentaires</h2>

        	<div class="news">
            	<h3>
                	<?php echo htmlspecialchars($post['title']); ?>
                	<em>le <?php echo $post['french_creation_date']; ?></em>
            	</h3>
            	<p>
                	<?php
                	// We display the post content.
                	echo nl2br(htmlspecialchars($post['content']));
                	?>
                	<br />
                	<em><a href="#">Commentaires</a></em>

<?php
foreach ($comments as $comment) {
    



    	?>





            	</p>
        	</div>
    	<?php
    	} // The end of the posts loop.
</body>
</html>
