package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Background {
	Timer background;

	public Background() {
		background = new Timer();
		background.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.inGame) {//HIntergrund soll sich nur bewegen wenn man im Spiel ist
					if (Var.backgroundY1 < 1076) {//solange der erste Hintergrund noch zu sehen ist soll er
						Var.backgroundY1 += 2;// nach unten bewegt werden

					} else {
						Var.backgroundY1 = -1080;//falls der erste Hintergrund schon nichtmehr zu sehen ist wird er wieder anch oben versetzt um erneut anch unten zu laufen

					}
					if (Var.backgroundY2 < 1076) {//das selbe mit dem zweiten... sodass 2 Bilder "im Kreis" laufen und es aussihet wenn wenn sich das Raumschiff bewegen würde
						Var.backgroundY2 += 2;
					} else {
						Var.backgroundY2 = -1080;
					}
				}
			}

		}, 0, Var.backgroundspeed);
	}

}
