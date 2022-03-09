
package pack1;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.RenderingHints;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.geom.AffineTransform;
import java.util.Timer;
import java.util.TimerTask;

public class Label extends JLabel {
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		

		

		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		
		for(int i=250;i>=0;i--) {
		g.setColor(new Color(100, 100, 100, i));
		g.fillRect(0, 0, Var.screenWidth, Var.screenHeight);
		}
		if (Var.inGame) { // Damit sichn alles nur bewegt wenn keine Pause gedrückt wird

			g.drawImage(Var.ib1, 0, Var.backgroundY1, 1920, 1080, null); //Bilder der Hintergründe werden angezeigt
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 1920, 1080, null);

			if (Var.flammeanimation == 1) {
				g.drawImage(Var.iflamme1, Var.x + 25, Var.y + 130, 100, 100, null);//Die Beiden Bilder der Antribsflammen animation werden angezeigt
			} else if (Var.flammeanimation == 0) {
				g.drawImage(Var.iflamme2, Var.x + 25, Var.y + 130, 100, 100, null);
			}

			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.icoin1, Var.coinX1[i], Var.coinY1[i], 80, 80, null); // Alle Münzen der WErtigkeit 1 von dem Array werden angezeigt

			}
			for (int i = 0; i <= 2; i++) {
				g.drawImage(Var.icoin5, Var.coinX2[i], Var.coinY2[i], 80, 80, null);// Alle Münzen der WErtigkeit 5 von dem Array werden angezeigt

			}
			g.drawImage(Var.icoin10, Var.coinX3, Var.coinY3, 80, 80, null);// Alle Münzen der WErtigkeit 10 angezeigt
			
			
			
			if (Var.moonhp > 0) {//Der Mond wird angeizgt (solang er nicht 0 Leben hat
				g.drawImage(Var.imoon, Var.enemyX2, Var.enemyY2, 900, 900, null);
			}

			
			
			for (int i = 0; i <= 4; i++) { //Alle Gegner werden durch eine for-Schleife angezeigt
				g.drawImage(Var.iasteroid1, Var.enemyX[i], Var.enemyY[i], 200, 200, null);
			}
			if (Var.shot) { // der Schuss wird angezeigt(wenn geschossen wird)
				g.drawImage(Var.ishot, Var.shotX, Var.shotY, 20, 70, null);
			}

			g.drawImage(Var.iplayer, Var.x, Var.y, 150, 150, null); // Spieler wird angezeigt

			if (Var.shieldactive == 1) {        //Schuld um den Spieler wird angezeigt wenn er ein Schild gekauft hat
				g.drawImage(Var.ishield, Var.x, Var.y, 150, 150, null);
			}

			// Lebensanzeige(für jeden Fall eine Anzeige
			if (Var.hp == 0) {
				
			} else if (Var.hp == 1) {
				
				g.drawImage(Var.iheart, 10, 10, 100, 100, null);
			} else if (Var.hp == 2) {
				g.drawImage(Var.iheart, 10, 10, 100, 100, null);
				g.drawImage(Var.iheart, 120, 0, 100, 100, null);
			} else if (Var.hp == 3) {
				g.drawImage(Var.iheart, 10, 10, 100, 100, null);
				g.drawImage(Var.iheart, 120, 10, 100, 100, null);
				g.drawImage(Var.iheart, 240, 10, 100, 100, null);
			}
			//munitionsanzeige:
			g.drawImage(Var.ishot, 520, 10, 20, 70, null);
			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			g.drawString(": "+Var.ammo, 600, 30);
			
			//Münzanzeige
			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			g.drawString("Your coins: " + Var.coins, 1500, 30);

			// Was passiert bei Kollision mit Gegner
			if (Var.collision) {

				if (Var.flammeanimation == 1) {//Flammenanimation wird angezeigt
					g.drawImage(Var.iflamme1, Var.x + 25, Var.y + 130, 100, 100, null);
				} else if (Var.flammeanimation == 0) {
					g.drawImage(Var.iflamme2, Var.x + 25, Var.y + 130, 100, 100, null);
				}

				g.drawImage(Var.iplayer, Var.x, Var.y, 150, 150, null); // Spieler wird angzeigt

				for(int i = 0; i<=10;i++) {
					if(Var.exanimation==i) {
					g.drawImage(Var.iexplosion[i],Var.x,Var.y,150,150,null);
					}
				}

				
			}
			repaint();

		} else if (Var.lost) {
			//Was angezeigt wird wenn  an Verloren hat

			g.drawImage(Var.ib1, 0, Var.backgroundY1, 1920, 1080, null); // Hintergründe werden angezeigt
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 1920, 1080, null);
			if (Var.flammeanimation == 1) {//Flammenanimation wird angezeigt
				g.drawImage(Var.iflamme1, Var.x + 25, Var.y + 130, 100, 100, null);
			} else if (Var.flammeanimation == 0) {
				g.drawImage(Var.iflamme2, Var.x + 25, Var.y + 130, 100, 100, null);
			}
			g.drawImage(Var.iplayer, Var.x, Var.y, 150, 150, null);//Spieler wird angezeigt
             
			
			//Alle Münzen werden angezeigt
			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.icoin1, Var.coinX1[i], Var.coinY1[i], 80, 80, null);

			}

			for (int i = 0; i <= 2; i++) {
				g.drawImage(Var.icoin5, Var.coinX2[i], Var.coinY2[i], 80, 80, null);

			}

			g.drawImage(Var.icoin10, Var.coinX3, Var.coinY3, 80, 80, null);
			
			//Der Mond wird angezeigt wenn er mehr als 0 Leben hat
			if (Var.moonhp > 0) {
				g.drawImage(Var.imoon, Var.enemyX2, Var.enemyY2, 900, 900, null);
			}
			
			
            //Alle Asteroiden werden angezeigt
			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.iasteroid1, Var.enemyX[i], Var.enemyY[i], 200, 200, null);
			}

			g.setColor(new Color(250, 100, 100, 128)); //grauer Hintergrund zum verdeutlichen das man Verloren hat
			g.fillRect(0, 0, Var.screenWidth, Var.screenHeight);

			repaint();

		}

		else if (Var.inMenu || Var.inShop ) {
			//Was angezeigt wird wenn man im Menü oder im Shop ist

			g.drawImage(Var.ib1, 0, Var.backgroundY1, 1920, 1080, null);// Der Hintergrund wird angezeigt
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 1920, 1080, null);
			if (Var.flammeanimation == 1) {// Die Flammen animation wird angezeigt
				g.drawImage(Var.iflamme1, Var.x + 25, Var.y + 130, 100, 100, null);
			} else if (Var.flammeanimation == 0) {
				g.drawImage(Var.iflamme2, Var.x + 25, Var.y + 130, 100, 100, null);
			}
			g.drawImage(Var.iplayer, Var.x, Var.y, 150, 150, null);// Der Spieler wird angezeigt
			
			
//Alle Münzen werden angezeigt
			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.icoin1, Var.coinX1[i], Var.coinY1[i], 80, 80, null);

			}

			for (int i = 0; i <= 2; i++) {
				g.drawImage(Var.icoin5, Var.coinX2[i], Var.coinY2[i], 80, 80, null);

			}

			g.drawImage(Var.icoin10, Var.coinX3, Var.coinY3, 80, 80, null);
			
			
			//Der Mond wird angezeigt wenn er mehr als 0 Leben hat
			if (Var.moonhp > 0) {
				g.drawImage(Var.imoon, Var.enemyX2, Var.enemyY2, 900, 900, null);
			}
			
            // Alle Gegner werden angezeigt
			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.iasteroid1, Var.enemyX[i], Var.enemyY[i], 200, 200, null);
			}
            
			//grauer Hintergrund
			g.setColor(new Color(100, 100, 100, 128));
			g.fillRect(0, 0, Var.screenWidth, Var.screenHeight);

			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			
			//Münzanzeige
			g.drawString("Your coins: " + Var.coins, 800, 540);
			g.setColor(new Color(100, 100, 100, 128));
			g.fillRect(0, 0, Var.screenWidth, Var.screenHeight);
            
			//Was angezeigt wird wenn man im Shop ist
			if (Var.inShop) {
				g.setColor(new Color(0, 230, 115));
				g.setFont(new Font("Arial", Font.BOLD, 35));

				g.drawString("shield", 400, 400);//Schrift die sagt was man kaufen kann
				g.drawString("shots", 400, 500);

				g.drawString("price:" + Var.shieldprice + " coins", 700, 400);//Schrift die anzeigt wie viel etwas kostet
				g.drawString("price:" + Var.shotprice + " coins", 700, 500);

				repaint();

			}

		}

		
	}
}
