package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Aktualisierung {//damit nachdem die Buttons bet�tigt wurden das Programm weiter funktioniert
	Timer timer;
	static int tempAktualisierung = 0;

	public Aktualisierung() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.inMenu) {//wird nur asugef�hrt wenn man nicht im Spiel ist 
					if (tempAktualisierung == 0) {
						Var.btnresume.requestFocus();//Button wird in den Vordergrund ger�ckt
						
						Var.btnshop.requestFocus();//Button wird in den Vordergrund ger�ckt
						Var.btnexit.requestFocus();//Button wird in den Vordergrund ger�ckt
						tempAktualisierung++;

					} else if (tempAktualisierung == 1) {
						Var.jf1.requestFocus();//jf1 wird in den Vordergrund ger�ckt
					}
				}
			}
		}, 0, 50);
	}

}
