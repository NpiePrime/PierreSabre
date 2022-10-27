package personnages;

public class Commercant extends Humain{

	
	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);
	}
	

	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return perdreArgent(getArgent());
		
	}
	public void recevoir(int argent) {
		parler(argent + " sous! Je te remercie g�n�reux donateur!");
		gagnerArgent(argent);
	}

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco",  15);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}
}
