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
	public void provoquer(Yakuza yakuza) {
		final int force = honneur * 2;
		parler("Je t'ai trouvé vermine, tu va payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= yakuza.getReputation()) {
			parler("Je t'ai eu petit yakusa!");
			gagnerArgent(yakuza.getArgent());
			yakuza.perdre();
			honneur ++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			yakuza.gagner(getArgent());
			perdreArgent(getArgent());
			honneur --;
			
		}
		
	}

}
