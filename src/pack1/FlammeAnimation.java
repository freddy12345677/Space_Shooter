package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class FlammeAnimation {
	Timer flammetimer;
	private int temp = 0;

	public FlammeAnimation() {
		flammetimer = new Timer();
		flammetimer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (temp == 0) {//durch Timer wird eine Variable abwechselnd von 1 auf 0 auf 1... gesetzt -> 2 Bilder für Feueranimation
					Var.flammeanimation = 0;
					temp++;
				} else if (temp == 1) {
					Var.flammeanimation = 1;
					temp--;
				}
			}
		}, 0, 100);
	}
}
