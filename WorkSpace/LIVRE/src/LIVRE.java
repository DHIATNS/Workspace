import java.util.ArrayList;
public class LIVRE {
	
	public static void main(String[] args) {
	}
    
	private String ISBN;
	private String Titre;
	private AUTEUR Auteur;
	private int Prix;
	private ADHERENT Emprunteur;
	
	
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public AUTEUR getAuteur() {
		return Auteur;
	}
	public void setAuteur(AUTEUR auteur) {
		Auteur = auteur;
	}
	public int getPrix() {
		return Prix;
	}
	public void setPrix(int prix) {
		Prix = prix;
	}
	
	

	public ADHERENT getEmprunteur() {
		return Emprunteur;
	}
	public void setEmprunteur(ADHERENT emprunteur) {
		Emprunteur = emprunteur;
	}
	public LIVRE(String iSBN, String titre, AUTEUR auteur, int prix) {
		super();
		ISBN = iSBN;
		Titre = titre;
		Auteur = auteur;
		Prix = prix;
		
	}
	
	
	public LIVRE(String iSBN, String titre, AUTEUR auteur, int prix,  ADHERENT emprunteur) {
		super();
		ISBN = iSBN;
		Titre = titre;
		Auteur = auteur;
		Prix = prix;
		Emprunteur = emprunteur;
	}

	public void AFFICHER() {
		System.out.println("Voici les infos du livre n° "+ISBN);
		System.out.println("Titre : "+Titre);
		System.out.println("Prix : "+Prix);
		System.out.println("Auteur : "+Auteur.getNom());
		if (Emprunteur==null)
			System.out.println("Livre Dispo");
		else
		{
			System.out.println("Livre emprunter par : "+Emprunteur.getNom());
		}
		
	}
	
	
	
	
	
	
	
	}


