import java.util.ArrayList;
import java.util.Set;
public class EMPLOYE {
	
	
	private ArrayList<EMPLOYE> lesobjets;
	
	private String nom;
	private String adresse;
	private String telephone;
	private String email;
	private int salaire;

	private ArrayList<LIVRE> mesobjets;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	public EMPLOYE(String nom, String adresse, String telephone, String email, int salaire) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.salaire = salaire;
	}

	public ArrayList <EMPLOYE> getobjet() {
		return lesobjets;
	}
	
	public void setmesobjets(ArrayList <LIVRE> mesobjets) {
		this.mesobjets = mesobjets;
	}

	public void afficheo() {
		System.out.println("nom : " + nom);
		System.out.println("salaires annuels: "+ salaire*12);
	}
	
	
}
