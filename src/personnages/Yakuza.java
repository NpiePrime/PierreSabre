package personnages;

public class Yakuza extends Humain {

		private String clan;
		private int reputation = 0;
		
		
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant commercant) {
		final int argentVol = commercant.getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?");
		parler(commercant.getNom() + ", si tu tiens à la vie, donne moi ta bourse !");
		commercant.seFaireExtorquer();
		gagnerArgent(commercant.getArgent());
		parler("J'ai piqué les " + argentVol + " sous de " + commercant.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi! Hi!");
		reputation ++;
	}
	public static void main(String[] args) {
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Commercant marco = new Commercant("Marco",  15);
		yaku.extorquer(marco);
	}
}
