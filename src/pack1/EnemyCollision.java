package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class EnemyCollision {
	Timer collision;  //Timer
	private int temp = 0;

	public EnemyCollision() {
		collision = new Timer();
		collision.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.inGame) {//prüft dass man im Spiel ist
					for (int i = 0; i <= 4; i++) {
						if (temp == 0) {   //durch for-Schleife wird jeder Gegner geprüft ob er mit dem Spieler kollidiert
							if (Var.x >= Var.enemyX[i] - 130 && Var.x <= Var.enemyX[i] + 180
									&& Var.y >= Var.enemyY[i] - 170 && Var.y <= Var.enemyY[i] + 170) {
								Var.collision = true; //collision wird auf true gesetzt
								Var.enemyY[i] = -100;// der Gegner mit dem der Spieler koliidiert ist wird nach oben veretzt

								if (Var.hp >= 1) { //wird geprüft ob man noch mindestens ein Leben hat
									if (Var.shieldactive == 1) {//falls ein Schild aktiv war

										Var.shieldactive = 0; //  wird dem Spieler das Schild genommen bzw kaputt gemacht und somit auch kein Leben abgezogen
									} else if (Var.shieldactive == 0) {//falls er aber kein Schild hat wird dem Spieler ein Leben abgezogen
										Var.hp -= 1;// ein Lenben wird abgezogen
									}
								}
								if (Var.hp == 0) {//wird geprüft ob man 0 Leben hat
									Var.lost = true; //Zustand lost wird true gesetzt
									Var.ammo=0;  //Munition wird zurückgesetzt
									   
									

								}
								if (Var.hp > 0) {
									Var.lost = false;//falls man mehr als 0 Leben hat wird der zustand lost auf false gesetzt

								}
								
								temp++;
							}
							
							
							if (Var.x >= Var.enemyX2 - 130 && Var.x <= Var.enemyX2 + 860
									&& Var.y >= Var.enemyY2 - 150 && Var.y <= Var.enemyY2 + 860) {//wird geprüft ob der Spieler mit dem Mond kollidiert
								Var.hp = 0; //falls er kollidiert werden die Leben des Spieler sofort 0 gesetzt(man stirbt also immer)
								Var.lost =true;//Zustand lost wird true gesetzt
								
								Var.enemyY2 = -3000;//Mond wird nach oben versetzt
								Var.moonhp=4;    // bekommt wieder volle Leben falls er angeschossen wurde dass er diese Lebensanzahl nicht behält
								Var.collision = true; // zustand collision wird true gesetzt
								temp++;
								
								
							}
						}
						
						
						
						

					
					}
					
					
					
					if (temp >= 1 && temp <= 65) {
						temp++;
					}
					if (temp == 66) {
						temp = 0;
					}
				}
			}
		}, 0, 15);
	}

}
