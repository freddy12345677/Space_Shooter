package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Var.btnresume) {//wenn der Button resume gedrückt wird verändern sich folgende Zustände
			Var.inGame = true;  
			Var.inShop = false;
			Var.inMenu = false;
			Var.inOptions = false;
			Var.btnresume.setVisible(false);//durch setVisible werden die Gewollten Buttons angezeigt 
		    Var.btnshop.setVisible(false);
			Var.btnexit.setVisible(false);

			Var.btnupgrade1.setVisible(false);
			Var.btnupgrade2.setVisible(false);

			KeyHandler.tempKeyHandler = 0;  //tempKeyhandler wird 0 gesetzt
			Aktualisierung.tempAktualisierung = 0; //tempAktualisierung wird 0 gesetzt
			Var.jf1.requestFocus();     //damit die Buttons angezeigt werden

		} else if (e.getSource() == Var.btnshop) {//wenn der Button shop gedrückt wird verändern sich folgende Zustände
			Var.inGame = false;
			Var.inShop = true;
			Var.inMenu = false;
			Var.inOptions = false;
			Var.btnresume.setVisible(true);
			
			Var.btnshop.setVisible(false);
			Var.btnexit.setVisible(false);

			Var.btnupgrade1.setVisible(true);
			Var.btnupgrade2.setVisible(true);

			KeyHandler.tempKeyHandler = 1; // tempKeyHandler wird 1 gesetzt

			Var.jf1.requestFocus();  // die Buttons werden in den Vordergrund gestellt

		}  else if (e.getSource() == Var.btnexit) {//wenn diese Button gedrückt wird

			System.exit(0); //  Programm wird geschlossen

		} else if (e.getSource() == Var.btnupgrade1) {//Abfrage ob dieser Button gedrückt wird
			if (Var.shieldactive == 0) {//Afrage ob ein Schild schon aktiv ist oder nicht
				
				if (Var.shieldprice <= Var.coins) {//Abfrage ob man genug Geld hat um ein SCheld zu kaufen
					Var.coins -= Var.shieldprice;//falls ja dann wird das Geld abgezogen und 
				
					Var.shieldactive = 1; //der Status shielactive auf 1 gesetzt
				}
			}

			Var.jf1.requestFocus(); // Buttons werden angezeigt

		} else if (e.getSource() == Var.btnupgrade2) {//Abfrae ob dieser Butten gedrückt wueder
			if(Var.shotprice<=Var.coins) {//Abfrage ob man genug Geld für SChüsse hat
				Var.coins -= Var.shotprice; // Geld wird nach kauf abgzogen
				Var.ammo +=1; //man bekommt ein Schuss
			}

			Var.jf1.requestFocus();   // Buttons werden angezeigt

		}

	}

}
