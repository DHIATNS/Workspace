import java.util.ArrayList;

public class PRINCIAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VOITURE v1,v2;
		int nbV,i; 
		ArrayList<VOITURE> Listev;
		Listev = new ArrayList<VOITURE>();
		
		Listev.add(v2);
		Listev.add(v1);
		
		 nbV = Listev.size();
		v1 = new VOITURE ("BMW","serie3","bleu",2020,10000,40000);
		v2 = new VOITURE ("Renault","clio","",2015,95000,9000);
		v2.setCouleur("Blanc");
		System.out.println("la couleur de la voiture 2 : "+v2.getCouleur());
		v1.AFFICHEV();
		v2.AFFICHEV();
	}
	}
		
	           










	}

}
