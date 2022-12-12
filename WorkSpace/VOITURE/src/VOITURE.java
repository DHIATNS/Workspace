
public class VOITURE {

	String marque ;
	String model ;
	String couleur ;
	int annee ;
	int km ;
	int prix ;
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public VOITURE(String marque, String model, String couleur, int annee, int km, int prix) {
		super();
		this.marque = marque;
		this.model = model;
		this.couleur = couleur;
		this.annee = annee;
		this.km = km;
		this.prix = prix;
	}
	
	public void AFFICHEV() {
		System.out.println("marque : " + marque);
		System.out.println("model : " + model);
		System.out.println("couleur : " + couleur);
		System.out.println("annee : " + annee);
		System.out.println("km : " + km);
		System.out.println("prix : " + prix);
		
		
	}
	
	
	
	
}
