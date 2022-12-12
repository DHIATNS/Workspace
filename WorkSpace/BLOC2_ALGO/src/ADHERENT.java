import java.util.ArrayList;

public class ADHERENT {

	private String nom;
	private String prenom;
	private String email;
	private ArrayList<LIVRE>ListLivre;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<LIVRE> getListLivre() {
		return ListLivre;
	}
	public void setListLivre(ArrayList<LIVRE> listLivre) {
		ListLivre = listLivre;
	}
	public ADHERENT(String nom, String prenom, String email, ArrayList<LIVRE> listLivre) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		ListLivre = listLivre;
	}
	public ADHERENT(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	
	public void AddLivre (LIVRE unLivre)
	{
		if (ListLivre.size()<5)
		{
			ListLivre.add(unLivre);
		
		
		}
	}
	
	public void RemoveLivre (LIVRE unLivre)
	{
		{
			ListLivre.remove(unLivre);
		}
	}
	


}


