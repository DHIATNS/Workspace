 <?php    // Connexion à la base de données
 function getPosts(){
      try
      {
          $bdd = new PDO('mysql:host=localhost;dbname=TD10_bloc2;charset=utf8', 'root', '');
      }
      catch(Exception $e){
            die( 'Erreur : '.$e->getMessage()   );
      }

      // On récupère les 5 derniers billets
      $req = $bdd->query('SELECT id, title, content, DATE_FORMAT(creation_date, \'%d/%m/%Y à %Hh%imin%ss\') AS creation_date FROM posts ORDER BY creation_date DESC LIMIT 0, 5');

		$posts = [];
		while (($row = $req->fetch())) {
			$post = [
				'title' => $row['title'],
				'french_creation_date' => $row['creation_date'],
				'content' => $row['content'],
			];

			$posts[] = $post;
		}
		return $posts;
 }	

 function dbConnect(){
                try
      {
          $bdd = new PDO('mysql:host=localhost;dbname=TD10_bloc2;charset=utf8', 'root', '');
          return $bdd;
      }
      catch(Exception $e){
            die( 'Erreur : '.$e->getMessage()   );
      }
}
 $bdd=dbConnect();


function getPost($id){
      $bdd=dbConnect();
      $statement = $bdd->prepare(
"SELECT id, title, content, DATE_FORMAT(creation_date, \'%d/%m/%Y à %Hh%imin%ss\') AS french_creation_date FROM posts WHERE id = ?"
);
}

function getComments($id){
      $bdd=dbConnect();
      $statement = $bdd->prepare(
"SELECT id, author, content, comment, DATE_FORMAT(creation_date, \'%d/%m/%Y à %Hh%imin%ss\') AS french_creation_date FROM comments WHERE id = ? ORDER BY comment_date DESC"
);

                                $comments = [];
                                $statement->execute([$id]);
                                $row = $statement->fetch();

                                $comment = [
				'author' => $row['author'],
				'french_creation_date' => $row['french_creation_date'],
				'comment' => $row['comment'],
			];                
}




?>
