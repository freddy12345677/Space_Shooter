package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Aktualisierung {//damit nachdem die Buttons betätigt wurden das Programm weiter funktioniert
	Timer timer;
	static int tempAktualisierung = 0;

	public Aktualisierung() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.inMenu) {//wird nur asugeführt wenn man nicht im Spiel ist 
					if (tempAktualisierung == 0) {
						Var.btnresume.requestFocus();//Button wird in den Vordergrund gerückt
						
						Var.btnshop.requestFocus();//Button wird in den Vordergrund gerückt
						Var.btnexit.requestFocus();//Button wird in den Vordergrund gerückt
						tempAktualisierung++;

					} else if (tempAktualisierung == 1) {
						Var.jf1.requestFocus();//jf1 wird in den Vordergrund gerückt
					}
				}
			}
		}, 0, 50);
	}

}
