
public class LIVRE {

	private String ISBN;
	private String titre;
	private int prix;
	private boolean dispo;
	private ADHERENT Emprunteur;
	private AUTEUR Auteur;
	String D;
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public boolean isDispo() {
		return dispo;
	}
	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}
	public ADHERENT getEmprunteur() {
		return Emprunteur;
	}
	public void setEmprunteur(ADHERENT emprunteur) {
		Emprunteur = emprunteur;
	}
	public AUTEUR getAuteur() {
		return Auteur;
	}
	public void setAuteur(AUTEUR auteur) {
		Auteur = auteur;
	}
	public LIVRE(String iSBN, String titre, int prix, boolean dispo, ADHERENT emprunteur, AUTEUR auteur) {
		super();
		ISBN = iSBN;
		this.titre = titre;
		this.prix = prix;
		this.dispo = dispo;
		Auteur = auteur;
	}
	public LIVRE(String iSBN, String titre, int prix, boolean dispo) {
		super();
		ISBN = iSBN;
		this.titre = titre;
		this.prix = prix;
		this.dispo = dispo;
	}
	
	public void AFFICHER()
	{
		
		if (dispo)
		{
			D="Disponible";
		}
		else
		{
			D="Emprunté";
		}
		
		System.out.println("Livre °"+ISBN+" : '"+titre+"' de '"+Auteur.getNom()+"'");
	}
	
	
	
	
	
	
	
}
