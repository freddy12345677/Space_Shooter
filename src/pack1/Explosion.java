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
				if (Var.inGame) {
					if (Var.collision) {
						if (temp < 11) {
							Var.exanimation = temp;
							temp++;
						} else if (temp == 11) {
							Var.exanimation = 11;
							temp = 0;
							Var.collision = false;
						}
					}

				}
			}
		}, 0, 15);
	}

}