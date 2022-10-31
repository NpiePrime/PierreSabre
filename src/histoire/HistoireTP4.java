package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Commercant marco = new Commercant("Marco",  15);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		roro.donner(marco);
		
		roro.provoquer(yaku);



	}

}
