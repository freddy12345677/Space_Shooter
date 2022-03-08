package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Shooting {
	Timer timer;
	private int temp = 0;

	public Shooting() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.inGame) {//kann nur geschossem werden falls man im Spiel ist
					if(Var.shot) { //abfrage ob geschossen wird
						Var.shotY -=6;//Geschw. des Schusses
					}
					for(int i=0;i<=4;i++) {//durh for-Schleife wird auf Kollision mit Gegner geprüft
						
						if(Var.shotX>=Var.enemyX[i] -25 &&Var.shotX<= Var.enemyX[i] +200
								&& Var.shotY >= Var.enemyY[i]-200&& Var.shotY<=Var.enemyY[i]+200) {
							Var.shotcollision = true;  // bei kollision wird die Variable shotcollision true gesetzt
							Var.shot = false;   //shot wird false gesetzt
							
							Var.shotX =2000;   //Koordinaten des SChusse damit er ncht mehr zu sehen ist
							Var.shotY = 2000;
							
							Var.enemyY[i] = Var.screenHeight; //Y-Koordinate des Gegners[i]  nach oben versetzt, damit er nicht mehr zu sehen ist
							
							
							
							
							
							

						
						}else if(Var.shotX>=Var.enemyX2 -25 &&Var.shotX<= Var.enemyX2 +900  //Prüfen auf Schusskollision mit Mond
								&& Var.shotY >= Var.enemyY2-900&& Var.shotY<=Var.enemyY2+900) {
							Var.shotcollision = true; //shotcollision wird true gesetzt
							Var.shot = false;    //shot wird false gesetzt
							Var.moonhp -=1;    //dem Mond wird ein Leben abgezogen
							
							Var.shotX =2000;  //Schusskoordinaten werde verändert dass er nichtmehr zu sehen ist
							Var.shotY = 2000;
							if(Var.moonhp==0) { //Falls der Mond durch einen Treffer 0 Leben hat, wird er wieder nach oben versetzt
							Var.enemyY2 = -3000;
							}
							
						}
						
							
							
							if(Var.shotY<=0) {
							Var.shot = false;
							Var.shotX =2000;
							Var.shotY = 2000;
							
						}
						
					}
				}
			}
		}, 0, 8);
	}

}