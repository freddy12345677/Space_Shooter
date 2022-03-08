package pack1;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyHandler implements KeyListener {
	static int tempKeyHandler = 0;

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) { // wird auf dr�cken einer Taste gepr�ft
		if (e.getKeyCode() == KeyEvent.VK_W) {//wenn man W dr�ckt
			Var.moveup = true;   // wird der Zstand moveup true gesetzt
			Var.movementdetected = 1; //  movement detected wird 1 gesetzt

		}
		if (e.getKeyCode() == KeyEvent.VK_D) {//gep�rft ob D ged�ckt wied
			Var.moveright = true;  //Zustand moveright wird true gesetzt
			Var.movementdetected = 1;//  movement detected wird 1 gesetzt

		}
		if (e.getKeyCode() == KeyEvent.VK_A) {//wird gepr�ft ob A gedr�ckt wird
			Var.moveleft = true;//moveleft wird true gesetzt
			Var.movementdetected = 1;//  movement detected wird 1 gesetzt

		}
		if (e.getKeyCode() == KeyEvent.VK_S) {//wird gepr�ft ob S gedr�ckt wird
			Var.movedown = true;//movedown wird true gesetzt
			Var.movementdetected = 1;//  movement detected wird 1 gesetzt

		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {//wird gepr�ft ob Leertaste gedr�ckt wurde
			if (Var.ammo > 0 && Var.shot == false) {//es wird gepr�ft ob man mehr als 0 Sch�sse hat
				Var.shot = true;//Zustand shot wird true gesetzt
				
				Var.shotX = Var.x+64; // schuss kommt aus dem raumschiff...
				Var.shotY = Var.y;
				Var.ammo--;   //man hat einen Schuss verbraucht
			}
			
		}
		if (tempKeyHandler == 0) {
			// Men� �ffnen
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {//Men� wird ge�ffnet wenn man Esc dr�ckt und die bestimmten Buttons werden angezeigt
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
			//wieder zur�ck im Spiel... alle Buttons werden unsichtbar gemacht
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
