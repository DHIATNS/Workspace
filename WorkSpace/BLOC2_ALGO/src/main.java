import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AUTEUR a1,a2;
		LIVRE l1,l2,l3;
		ADHERENT ad1,ad2;
		ArrayList<LIVRE> liste1,liste2;
		int i;
		a1=new AUTEUR("Gravouil", null,"26/09/1984", "Professeur SLAM");
		a2=new AUTEUR("Tarif", null,null, "Professeur SISR");
		
		a2.setPrenom("Mohamed");
		
		l1=new LIVRE("001", "Programmer en Java", 60, true, null, a1);
		l2=new LIVRE("002", "Le reseau", 50, true, null, a2);
		l3=new LIVRE("003", "Le petit cheval blanc", 10, true);
		
		ad1=new ADHERENT("CHEN", "Michel", "chen@gmail.com");
		ad2=new ADHERENT("ASSEMAT", "Alexander", "assemat@gmail.com");
		
		liste1=new ArrayList<LIVRE>();
		liste2=new ArrayList<LIVRE>();
		
		ad1.setListLivre(liste1);
		ad1.setListLivre(liste2);
		
		if(ad1.getListLivre().size()<5)
		{
			l1.setDispo(false);
			ad1.AddLivre(l1);
		}
		
		else
		{
			System.out.println("Quota atteint");
		}
		
		for (i=0; i<ad1.getListLivre().size();i++)
		{
			ad1.getListLivre().get(i).AFFICHER();
		}
		
		
		
	}

}
