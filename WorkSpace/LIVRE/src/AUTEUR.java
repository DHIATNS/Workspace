import java.util.ArrayList;
public class AUTEUR {
	
	private ArrayList<LIVRE> lauteur;
	
	private String nom;
	private String prenom;
	private String dateN;
	private String description;
	public ArrayList<LIVRE> getLauteur() {
		return lauteur;
	}
	public void setLauteur(ArrayList<LIVRE> lauteur) {
		this.lauteur = lauteur;
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
	public String getDateN() {
		return dateN;
	}
	public void setDateN(String dateN) {
		this.dateN = dateN;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void affichev() {
		System.out.println("nom : " + nom);
		System.out.println("prenom : " + prenom);
		System.out.println("dateN : " + dateN);
		System.out.println("description : " + description);
	}


	public ArrayList <LIVRE> getlauteur() {
		return lauteur;
	}
	
	public void setlquteur(ArrayList <LIVRE> lauteur) {
		this.lauteur = lauteur;
	}
	public AUTEUR( String nom, String prenom, String dateN, String description) {
		super();
	
		this.nom = nom;
		this.prenom = prenom;
		this.dateN = dateN;
		this.description = description;
	}
	
	
	
	
	
	
	
	
}
