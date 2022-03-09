package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class CoinMovement {
	Timer movement;
	private int temp = 0;

	public CoinMovement() {
		for (int i = 0; i <= 4; i++) {//durch for-Schleife wird allen Münzen der ArrayListe eine zufällige X-Koordinate und eine Y-Koordinate zugewiesen
			Var.coinX1[i] = (int)(Math.random()*1900);
			Var.coinY1[i] = -300 - temp;

			temp += 600;
		}
		Var.coinX2[0] = (int)(Math.random()*1900);  //  allen Münzen der Wertigkeit 5 wird eine Position zugewiesen
		Var.coinX2[1] = (int)(Math.random()*1900);
		Var.coinY2[0] = -2000;
		Var.coinY2[1] = -3000;

	Var.coinX3 = (int)(Math.random()*1900);// Der Münze der Wertigkeit 10 wird eine Position zugewiesen
		Var.coinY3 = -4000;

		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.inGame) {   //passiert nur wenn man icht im Spiel ist
					for (int i = 0; i <= 4; i++) {
						Var.coinY1[i] += Var.coinspeed1[i]; //durch for-Schleife werden alle Münzen um ihre Geshw. bewegt

						if (Var.coinY1[i] >= Var.screenHeight) {//falls sie nichtmehr zu sehen sind werden sie nach oben versetzt und bekommen einen neune zufälligen X-wert zugeschrieben
							Var.coinY1[i] = -1500;
							Var.coinX1[i] = (int)(Math.random()*1900);
						}
					}
					for (int i = 0; i <= 1; i++) {
						Var.coinY2[i] += Var.coinspeed2[i];//Das selbe wie für die Münzen oben

						if (Var.coinY2[i] >= Var.screenHeight) {
							Var.coinY2[i] = -2000;
							Var.coinX2[i] = (int)(Math.random()*1900);
						}
					}

					Var.coinY3 += Var.coinspeed3;//Das selbe wie für die Münzen obens

					if (Var.coinY3 >= Var.screenHeight) {
						Var.coinY3 = -4000;
						Var.coinX3 = (int)(Math.random()*1900);
					}

				}
			}

		}, 0, 9);
	}

}
