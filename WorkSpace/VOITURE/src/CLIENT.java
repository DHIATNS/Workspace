import java.util.ArrayList;
public class CLIENT {
	
	private ArrayList<CLIENT> mescomptes;
	
	private String Nom;
	private String Prenom;
	private Boolean Genre;
	private String DataN;
	private String CategorieSp;
	private String Adresse;
	private int Telephone;
	private String Email;
	public CLIENT(String nom, String prenom, Boolean genre, String dataN,
			String categorieSp, String adresse, int telephone, String email) {
		super();
		Nom = nom;
		Prenom = prenom;
		Genre = genre;
		DataN = dataN;
		CategorieSp = categorieSp;
		Adresse = adresse;
		Telephone = telephone;
		Email = email;

	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public Boolean getGenre() {
		return Genre;
	}
	public void setGenre(Boolean genre) {
		Genre = genre;
	}
	public String getDataN() {
		return DataN;
	}
	public void setDataN(String dataN) {
		DataN = dataN;
	}
	public String getCategorieSp() {
		return CategorieSp;
	}
	public void setCategorieSp(String categorieSp) {
		CategorieSp = categorieSp;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public int getTelephone() {
		return Telephone;
	}
	public void setTelephone(int telephone) {
		Telephone = telephone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	private ArrayList<COMPTE> lesComptes;

	public void ajouter_compte(COMPTE lecompte)
	{
		lesComptes.add(lecompte);
	}
	
	public void info_comptes()
	{
		String g;
		if(Genre==true)
		{
			g="Mme";
		}
		else
		{
			g="M.";
		}
		System.out.println
		("Liste des comptes de "+g+" "+Nom+" "
		+Prenom);
				
		for (int i=0;i<lesComptes.size();i=i+1)
		{
			lesComptes.get(i).Decrire();
		}
	
	
	}
}