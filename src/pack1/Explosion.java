package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Explosion {
	Timer explosion;
	private int temp = 0;

	public Explosion() {
		explosion = new Timer();
		explosion.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.inGame) {//kann nur explodieren wenn man im SPiel ist und nciht im Men� oder �hnliches
					if (Var.collision) {//falls der collsion zustand true ist
						if (temp < 11) {//f�r das Array dass die alle Bilder der Explosionsanimation der Reihe anch asugef�hret werden k�nnen
							Var.exanimation = temp;
							temp++;
						} else if (temp == 11) {//explosionsanimation ist dann zu ende 
							Var.exanimation = 11;
							temp = 0;
							Var.collision = false;//collision status wird false gesetzt
						}
					}

				}
			}
		}, 0, 15);
	}

}