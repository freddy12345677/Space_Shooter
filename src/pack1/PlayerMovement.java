package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
	Timer movement;


	public PlayerMovement() {
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.inGame) {//mann kann sich nur bewegen wenn man im Spiel ist
					if (Var.moveup == true) {
						if (Var.y > 0) {//damit man nicht nach oben aus dem Bildschirmrand fliegen kann
							Var.y -= Var.movespeed;  // Spieler wird um die definierte Geschw. versetzt
							Var.movementdetected = 1;//um zu Pfrüfen ob es funktioniert(findet keine Anwendung)

						}

					} else if (Var.movedown == true) {
						if (Var.y < 1000) {//damit man nicht nach unten aus dem Bilschirm fliegen kann
							Var.y += Var.movespeed;
							Var.movementdetected = 1;
						}
					}
					if (Var.moveleft == true) {
						if (Var.x > 0) {//damit man nicht nach rechts aus dem Bildschirm fliegen kann
							Var.x -= Var.movespeed;
							Var.movementdetected = 1;

						}

					} else if (Var.moveright == true) {
						if (Var.x < Var.screenWidth-150) {//damit man nicht nach rechts aus dem Bildschirm fliegen kann
							Var.x += Var.movespeed;
							Var.movementdetected = 1;
						}
					} else {//wenn keine Taste gedrückt wird passiert auch nichts
						Var.movementdetected = 0;
					}

				}
			}

		}, 0, 10);
	}

}
