package personnages;

public class humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	public humain(String nom, String boissonFavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	protected void parler(String texte) {
		System.out.println( "(" + nom  + ") - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");

	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent>=prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " � " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir " + bien + " � " + prix + " sous.");
		}
	}

	public int gagnerArgent(int gain) {
		return argent += gain;

	}

	public int perdreArgent(int perte) {
		return argent -= perte;
	}
public static void main(String[] args) {
	humain prof = new humain("prof", "kombucha", 54);
	prof.direBonjour();
	prof.acheter("une boisson", 12);
	prof.boire();
	prof.acheter("un jeu", 2);
	prof.acheter("un kimono", 50);
	
	
}
}
