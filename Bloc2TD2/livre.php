<?php


class LIVRE
{
   private $ISBN;
   private $Titre ;
   private $Prix ;
   private $Dispo ;
   public function __construct($unISBN, $unTitre, $unPrix, $unDispo)
{
    $this-> ISBN = $unISBN;
    $this-> Titre = $unTitre;
    $this-> Prix = $unPrix;
    $this-> Dispo = $unDispo;
}
   public function get_ISBN()
{
      return $this->ISBN ;
}
   public function set_ISBN($unISBN) 
{  
   $this->ISBN=$unISBN;
}

  
public function get_Titre()
{
      return $this->Titre ;
}
   public function set_Titre($unTitre) 
{  
   $this->Titre=$unTitre;
}

public function get_Prix()
{
      return $this->Prix ;
}
   public function set_Prix($unPrix) 
{  
   $this->Prix=$unPrix;
}

public function get_Dispo()
{
      return $this->Dispo ;
}
   public function set_Dispo($unDispo) 
{  
   $this->Dispo=$unDispo;
}
}

$l1 = new LIVRE ("EEE032","programmer en C",10,0);


$l2 = new LIVRE ("JAV44","programmer en java",50,0);


$MonDico = array();
$MonDico["EEE032"] = $l1;
$MonDico["JAV44"] = $l2;
$MonDico["EEE032"]-> set_Dispo(1);
echo"<br>";

foreach($MonDico as $lacle =>$unObjet)
{
echo $lacle;

echo $unObjet->get_Dispo();


if ($unObjet->get_Dispo()== 1)
{
echo "Le livre est emprunté";
}
}

$nombre=0;
$test=0;
foreach($MonDico as $cle=>$Objet)
{
$nombre=$nombre+$Objet->get_Prix();
$test=$test+1;
}
$total=0;
echo"<br>";
$total=$nombre/$test;
echo"<br>";
echo"Le prix moyen des livres est de : $total";






















