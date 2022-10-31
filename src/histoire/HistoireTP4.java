package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		//Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Commercant marco = new Commercant("Marco",  15);
		//yaku.direBonjour();
		//yaku.extorquer(marco);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.donner(marco);



	}

}
