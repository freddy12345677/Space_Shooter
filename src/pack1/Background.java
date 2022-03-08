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
				if (Var.inGame) {
					if (Var.backgroundY1 < 1076) {
						Var.backgroundY1 += 2;

					} else {
						Var.backgroundY1 = -1080;

					}
					if (Var.backgroundY2 < 1076) {
						Var.backgroundY2 += 2;
					} else {
						Var.backgroundY2 = -1080;
					}
				}
			}

		}, 0, Var.backgroundspeed);
	}

}
