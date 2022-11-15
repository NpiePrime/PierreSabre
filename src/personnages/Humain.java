package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	private int nbConnaissance = 0;
	private Humain[] memoire = new Humain[30];
	
	
	
	public Humain(String nom, String boissonFavorite, int argent) {
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
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}

	protected int gagnerArgent(int gain) {
		return argent += gain;

	}

	protected int perdreArgent(int perte) {
		return argent -= perte;
	}
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	private void memoriser(Humain humain) {
		if (nbConnaissance <30) {
		memoire[nbConnaissance] = humain;
		nbConnaissance ++;
		} else {
			for (int i = 0; i < nbConnaissance; i++) {
				memoire[i]=memoire[i + 1];
				memoire[nbConnaissance] = humain;
			}
		}
	}
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	public void listerConnaissance() {
		
		String connaissances = " ";
		
		for (int i = 0; i < nbConnaissance -1; i++) {
			connaissances += memoire[i].getNom() + ", ";
		}
		connaissances += memoire[nbConnaissance - 1].getNom();
		parler("Je connais beaucoup de monde dont :" + connaissances);
	}
	

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);

	}
}
