 <?php    

 function getPosts(){
		$posts = [[1, "Martin","05/05/2020", "description 1"],
[2, "Jibril","06/05/2020", "description 2"],
[3, "Nessim","07/05/2020", "description de Nessim"],
[4, "Alexander","06/05/2020", "description d'Alexander"],
[5, "Sirine","06/05/2020", "description de Sirine"],];	
		return $posts;
 }	
$post=getPost();
list($num, $prenom, $datenaissance, $description)=$post;

$array = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
];

foreach ($post as list($num, $prenom, $datenaissance, $description)) {
    echo "";
}

		?>
