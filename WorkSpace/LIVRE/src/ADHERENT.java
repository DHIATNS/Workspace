import java.util.ArrayList;
public class ADHERENT {
	
	private ArrayList<LIVRE> meslivres;
	
	private String nom;
	private String prenom;
	private String numCarte;
	private String dateadhesion;

	private int i;
	public ArrayList<LIVRE> getMeslivres() {
		return meslivres;
	}
	public void setMeslivres(ArrayList<LIVRE> meslivres) {
		this.meslivres = meslivres;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumCarte() {
		return numCarte;
	}
	public void setNumCarte(String numCarte) {
		this.numCarte = numCarte;
	}
	public String getDateadhesion() {
		return dateadhesion;
	}
	public void setDateadhesion(String dateadhesion) {
		this.dateadhesion = dateadhesion;
	}
	
	public void affichev() {
		System.out.println("nom : " + nom);
		System.out.println("prenom : " + prenom);
		System.out.println("numCarte : " + numCarte);
		System.out.println("dateadhesion : " + dateadhesion);
	}
	
	
	public ArrayList <LIVRE> getmeslivres() {
		return meslivres;
	}
	
	public void setmeslivres(ArrayList <LIVRE> meslivres) {
		this.meslivres = meslivres;
	}
	public ADHERENT( String nom, String prenom, String numCarte, String dateadhesion) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numCarte = numCarte;
		this.dateadhesion = dateadhesion;
	}
	
	public void AFFICHERMESLIVRES() {
		for(int i=0;i!=meslivres.size();i++);
		{
			meslivres.get(i).AFFICHER();
		}
	}
	
	

}
