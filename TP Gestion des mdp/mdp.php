<?php

if (CRYPT_MD5 == 1) {
	echo 'MD5 :		  ' . crypt('Vive#Les#S1aux', '$1$duSel$') . "\n";
echo "<br>";
}




if (CRYPT_SHA256 == 1) {
	echo 'SHA-256 :	  ' . crypt('Vive#Les#S1aux', '$5$rounds=5000$duSel$') . "\n";
echo "<br>";
}


if (CRYPT_SHA512 == 1) {
	echo 'SHA-512 :	  ' . crypt('Vive#Les#S1aux', '$6$rounds=5000$duSel$') . "\n";
echo "<br>";
}


if (CRYPT_SHA256 == 1) {
	echo 'SHA-256 :	  ' . crypt('Vive#Les#S1aux', '$5$rounds=5000$duSelFin$') . "\n";
echo "<br>";
}

if (CRYPT_SHA256 == 1) {
	echo 'SHA-256 :	  ' . crypt('Vive#Les#S1aux', '$5$rounds=5000$duGrosSel$') . "\n";
}

$t1 = microtime();
$temps = (float) microtime() - (float) $t1;
echo password_hash("Vive#Les#S1aux", PASSWORD_BCRYPT);
echo "<br>";
echo "duree exécution = $temps \n";





?>
