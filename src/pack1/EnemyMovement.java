package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class EnemyMovement {
	Timer movement;
	private int temp = 0;
	//Timer

	public EnemyMovement() {
		for (int i = 0; i <= 4; i++) {
			Var.enemyX[i] = 20 + temp; // Allen Gegnern wird durch for-Schleife ein X- und Y-Position zugeteilt
			Var.enemyY[i] = -300 - temp;
			temp += 600;
		}
		Var.enemyX2 = (int)(Math.random()*1600); // Dem Mond wird eine zufällige X_Koordinate zugeteilt
		Var.enemyY2 = -3000; //Starthöhe (damit er erst später kommt
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.inGame) {//wenn man also nicht Pause gedrückt hat
					System.out.println(temp);
					for (int i = 0; i <= 4; i++) {
						Var.enemyY[i] += Var.enemySpeed[i];//durch for-Schleife werden alle Gegner um ihre Geschwindigkeit bewegt
						if (Var.enemyY[i] >= Var.screenHeight) {//wenn Gegner nicht ehr zu sehen sind werden sie wieder nach Oben versetzt dass sie sich wieder nach unten bewegen
							Var.enemyY[i] = -200;
						} 
					}
					Var.enemyY2 +=1; // MOndgeschwindigkeit
					if(Var.enemyY2>=Var.screenHeight) {//Was passiert wenn er Mond nichtmehr zu sehen ist
						Var.enemyY2 = -3000;//wird nach oben versetzt
						Var.moonhp=4;//wieder volle Leben falls er angeschossen wurde
						Var.enemyX2=(int)(Math.random()*1600);//neue Zufällige X-Koordinate damit er nicht immer an der selben stelle runter kommt
					}
				}
			}
		}, 4, 9);
	}

}
