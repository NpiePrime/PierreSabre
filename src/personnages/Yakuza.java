package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant commercant) {
		final int argentVol = commercant.getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l�?");
		parler(commercant.getNom() + ", si tu tiens � la vie, donne moi ta bourse !");
		commercant.seFaireExtorquer();
		gagnerArgent(argentVol);
		parler("J'ai piqu� les " + argentVol + " sous de " + commercant.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi! Hi!");
		reputation++;
	}

	public void perdre() {

		parler("J'ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai d�shonor� le clan de " + clan + ".");
		perdreArgent(getArgent());
		reputation--;
	}

	public void gagner(int gain) {
		System.out.println("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan
				+ " ? Je l'ai d�pouill� de ses " + gain + " sous.");
		gagnerArgent(gain);
		reputation++;

	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan + ".");
	}

	public static void main(String[] args) {
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();

	}

}
