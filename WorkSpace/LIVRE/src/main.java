import java.util.Date;
import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				LIVRE l1,l2;
				ADHERENT ad1,ad2;
				AUTEUR a1,a2;
				a1 = new AUTEUR ("fahem", "sliti","25/08/1999", "trop fort");
				a2 = new AUTEUR ("salem", "bhiji", "03/01/2000", "trop nul");
				
				l1 = new LIVRE ("super", "mario", a1, 20);
				l2 = new LIVRE ("super", "man", a2, 30);
				
				ad1 = new ADHERENT ("samet", "mamet", "25", "24/12/1998");
				ad2 = new ADHERENT ("fahmet", "salim", "7", "30/03/1930");
				
				l1.AFFICHER();
				l2.AFFICHER();
				
				l1.setEmprunteur(ad1);
				l1.AFFICHER();
				ad1.getmeslivres().add(l1);
				System.out.println("Liste des livres de l'adhérent 1 : ");
				ad1.AFFICHERMESLIVRES();

				
			

		
	}

}
