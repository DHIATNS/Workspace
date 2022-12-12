
public class COMPTE {

	private int Numero;
	private CLIENT Titulaire;
	private Float Solde;
	private String Devise;
	
	
	
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public CLIENT getTitulaire() {
		return Titulaire;
	}
	public void setTitulaire(CLIENT titulaire) {
		Titulaire = titulaire;
	}
	public Float getSolde() {
		return Solde;
	}
	public void setSolde(Float solde) {
		Solde = solde;
	}
	public String getDevise() {
		return Devise;
	}
	public void setDevise(String devise) {
		Devise = devise;
	}
	public COMPTE(int numero, CLIENT titulaire, Float solde, String devise) {
		super();
		Numero = numero;
		Titulaire = titulaire;
		Solde = solde;
		Devise = devise;
	}
	
public void Crediter(float Somme) {
	Solde=Solde+Somme;
	System.out.println("Le client numero : " + Numero);
	System.out.println("Titulaire du compte : " + Titulaire);
	System.out.println("Va etre crediter de : " + Somme);
		
	}

public void Debiter (float Somme){
	Solde=Solde-Somme;
	System.out.println("Le client numero : " + Numero);
	System.out.println("Titulaire du compte : " + Titulaire);
	System.out.println("Va etre debiter de : " + Somme);
		
	}
	
public void Decrire() {
	System.out.println("n°"+Numero+" -solde : "+Solde);
	}

	
}
