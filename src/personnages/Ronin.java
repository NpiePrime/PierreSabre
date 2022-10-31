package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		
	}
	public void donner(Commercant commercant) {
		final int argentDonne = getArgent() / 10;
		parler(commercant.getNom() + " prend ces " + argentDonne + " sous.");
		perdreArgent(argentDonne);
		commercant.recevoir(argentDonne);
	}
public static void main(String[] args) {
	
}

}
