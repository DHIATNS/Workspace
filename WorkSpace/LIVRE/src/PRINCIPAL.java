
public class PRINCIPAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EMPLOYE e1,e2;
		ENTREPRISE ent1,ent2;
		int annuel;
		e1 = new EMPLOYE ("Pierre","5 bd Descartes 77454 champs sur marne","0148484040","pierre@gmail.com",3000);
		e2 = new EMPLOYE ("Marie","4 rue de Meaux à 75001 Paris","0140404040","marie@hotmail.fr",2000);
		
		System.out.println("Le salaire annuel = "+e1.getSalaire()*12);
		System.out.println("Le salaire annuel = "+e2.getSalaire()*12);
		
		e1.afficheo();
		e2.afficheo();
		annuel = e1.getSalaire()*12 + e2.getSalaire()*12;
		System.out.println("Les salaire annuels des employés sont :"+annuel);
		
		
		
		
		
		
		
		
		
		ent1 = new ENTREPRISE ("ABC","99 impasse de java 75020 Paris");
		
		
		
		
		
	 
		
		
		
		
		



	}

}
