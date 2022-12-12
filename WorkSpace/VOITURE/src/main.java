
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CLIENT c1;
		COMPTE compte1,compte2,compte3;
		c1=new CLIENT("jhgg","dfgfghs",true,"25/09/1985","jhwdfgg","dfgfghs",2,"dfgfzghs");
		
		compte1=new COMPTE(1324541132,c1,(float)548200,"€");
		compte2=new COMPTE(1324541132,c1,(float)1000,"€");
		compte3=new COMPTE(1324541132,c1,(float)-214,"€");
		
		c1.ajouter_compte(compte1);
		c1.ajouter_compte(compte2);
		c1.ajouter_compte(compte3);
		compte3.Crediter(50);
	
	}

}
