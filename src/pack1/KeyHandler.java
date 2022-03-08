package pack1;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyHandler implements KeyListener {
	static int tempKeyHandler = 0;

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) { // wird auf drücken einer Taste geprüft
		if (e.getKeyCode() == KeyEvent.VK_W) {//wenn man W drückt
			Var.moveup = true;   // wird der Zstand moveup true gesetzt
			Var.movementdetected = 1; //  movement detected wird 1 gesetzt

		}
		if (e.getKeyCode() == KeyEvent.VK_D) {//gepürft ob D gedückt wied
			Var.moveright = true;  //Zustand moveright wird true gesetzt
			Var.movementdetected = 1;//  movement detected wird 1 gesetzt

		}
		if (e.getKeyCode() == KeyEvent.VK_A) {//wird geprüft ob A gedrückt wird
			Var.moveleft = true;//moveleft wird true gesetzt
			Var.movementdetected = 1;//  movement detected wird 1 gesetzt

		}
		if (e.getKeyCode() == KeyEvent.VK_S) {//wird geprüft ob S gedrückt wird
			Var.movedown = true;//movedown wird true gesetzt
			Var.movementdetected = 1;//  movement detected wird 1 gesetzt

		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {//wird geprüft ob Leertaste gedrückt wurde
			if (Var.ammo > 0 && Var.shot == false) {//es wird geprüft ob man mehr als 0 Schüsse hat
				Var.shot = true;//Zustand shot wird true gesetzt
				
				Var.shotX = Var.x+64; // schuss kommt aus dem raumschiff...
				Var.shotY = Var.y;
				Var.ammo--;   //man hat einen Schuss verbraucht
			}
			
		}
		if (tempKeyHandler == 0) {
			// Menü öffnen
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {//Menü wird geöffnet wenn man Esc drückt und die bestimmten Buttons werden angezeigt
				Var.inGame = false;
				Var.inMenu = true;
				Var.inShop = false;
				Var.inOptions = false;
				Var.btnresume.setVisible(true);  // Button um das spiel fort zu setzen wird angezeigt
				Var.btnshop.setVisible(true);   // Button um in den Shop zu gelangen wird angezeigt
				
				Var.btnexit.setVisible(true);  //Button um das Spiel zu schliesen wird angezeigt

				tempKeyHandler++;

			}
		} else if (tempKeyHandler == 1) {
			//wieder zurück im Spiel... alle Buttons werden unsichtbar gemacht
			Var.inGame = true;
			Var.inMenu = false;
			Var.inShop = false;
			Var.inOptions = false;
			Var.btnresume.setVisible(false);
			Var.btnshop.setVisible(false);
			
			Var.btnexit.setVisible(false);
			Var.btnupgrade1.setVisible(false);
			Var.btnupgrade2.setVisible(false);

			tempKeyHandler--;
			Aktualisierung.tempAktualisierung = 0;
		}

	}

	public void keyReleased(KeyEvent e) {
		//Tastenabfrage wenn Tasten losgelassen werden(damit man sich zB nicht dauerhaft in eine Richtung bewegt)
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			Var.moveup = false;
			Var.movementdetected = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			Var.moveright = false;
			Var.movementdetected = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			Var.moveleft = false;
			Var.movementdetected = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.movedown = false;
			Var.movementdetected = 0;
		}

	}

}
