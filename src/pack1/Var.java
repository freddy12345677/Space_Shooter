
package pack1;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Var {
	static JFrame jf1;
	static int screenWidth = 1920;
	static int screenHeight = 1080;
	static int backgroundY1 = 0;              //Y-Koordinate des Background1
	static int backgroundY2 = -1080;          //Y-Koordinate des Background2
	static int backgroundspeed = 4;           //Geschw. des Hintergrund
	static int x = 700, y = 700; // Spieler Position
	static int flammeanimation;  //zustand, der animation(welches Bild angezeigt wird)

	static int enemyX[] = new int[5], enemyY[] = new int[5]; //Array mit den Koordinaten aller Asteroiden
	static int enemySpeed[] = new int[5];	                 //Array mit allen Geschwindigkeiten der Asteroiden
	static int enemyX2 = -20000;        //Anfangskoordinate des Mondes(der Mond soll nicht zu sehen sein)
	static int enemyY2 = -20000;
	static int enemy2speed = 3;//geschw des Mondes
	static int moonhp =4;      //Leben des Mondes
	
	static int coinX1[]= new int[5];       //Array mit allen Koordinaten der Münzen der Wertigkeit 1
	static int coinY1[]= new int[5];
	static int coinX2[]= new int[5];         //Array mit allen Koordinaten der Münzen der Wertigkeit 5
	static int coinY2[]= new int[5];
	static int coinX3;                       //Koordinaten der Münzen mit der Wertigkeit 10
	static int coinY3;
	
	static int coinspeed1[] = new int [5];    //Array mit den Geschwindigkeiten der Münzen der Wertigkeit 1
	static int coinspeed2[] = new int [2];       //Array mit den Geschwindigkeiten der Münzen der Wertigkeit 5
	static int coinspeed3 = 6;             //Geschwindigkeit der Münze der Wertigkeit 10
	
	static int coins = 0;                   //Anzahl der gesammelten Münzen
	static int hp = 3;                      //Anzahl der eigenen Leben
	static int ammo =0;                     //Anzahl der gekauften Munition
	 
	static boolean shot;                   //Zustand ob gerade Geschossen wird oder nicht
	static boolean shotcollision;          //Zustand ob der Schuss einen Gegner getroffen hat
	static int shotX;               //Koordinaten der Schusses
	static int shotY;
	
	static int shieldactive = 0;       //Zustand ob ein Schild aktiv ist
	static int exanimation;             // Zustand der Explosionsanimatiob(welches Bild der Animation angezeigt wird
	
	static int shotprice =25;      //Preise der Items die man im Shop kaufen kann
	static int shieldprice = 65;
	
	static boolean inGame = true, inOptions = false, inMenu = false, inShop = false;     //Zustände um zu prüfen ob der Spieler im Menü... usw ist
	
	
	
	static JButton btnresume, btnshop, btnexit; // Buttons eingeführt
	static JButton btnmute;
	static JButton btnupgrade1,btnupgrade2;
	
	
	
	
	static int movespeed = 3;           //Geschw. des Spielers

	static int movementdetected = 0; // zustand ob sich der Spieler bewegt(zum testen wird nicht im Spiel verwendet

	// KeyHandler
	static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
	static boolean collision = false, lost = false;
	
	//Label
	static Label lbl1;

	// Bilder als BufferedImage gespeichert
	static BufferedImage ib1, ib2;
	static BufferedImage iplayer;
	static BufferedImage iflamme1, iflamme2;
	static BufferedImage iasteroid1;
	static BufferedImage imoon;
	
	static BufferedImage icoin1, icoin5, icoin10;

	static BufferedImage iheart;
	static BufferedImage ishot;
	static BufferedImage ishield;
	
	static BufferedImage iexplosion[] = new BufferedImage[16];
	


	public Var() {
		//Bilder werden Bilderdateien zugewiesen
		try { //was ausgeführt werden sollte wenn möglich
			ib1 = ImageIO.read(new File("background.jpg"));
			ib2 = ImageIO.read(new File("background.jpg"));
			iplayer = ImageIO.read(new File("spaceship.png"));
			
			iflamme1 = ImageIO.read(new File("flame3.png"));
			iflamme2 = ImageIO.read(new File("flame4.png"));
			
			iasteroid1 = ImageIO.read(new File("asteroid.png"));
			imoon = ImageIO.read(new File("moon.png"));
			
			icoin1 = ImageIO.read(new File("coin1.png"));
			icoin5 = ImageIO.read(new File("coin5.png"));
			icoin10 = ImageIO.read(new File("coin10.png"));
			
			iheart = ImageIO.read(new File("heart.png"));
			ishield = ImageIO.read(new File("shield.png"));
			ishot = ImageIO.read(new File("shot.png"));
			
			//Array für alle Bilder einer Animation
			for(int i=0;i <=11; i++) {
			iexplosion[i] = ImageIO.read(new File("exp"+(i+1)+".png"));
			}
			

		} catch (IOException e) {//falls nicht möglich gibt eine Fehlernachricht aus ohne das Programm zu crashen
			e.printStackTrace(); //Fehlernachricht falls Bilder nicht geladen werden können
			System.out.println("Bilder konnten nicht geladen werden");

		}
		//Werte zu den Array von oben
		enemySpeed[0] = 3;
		enemySpeed[1] = 5;
		enemySpeed[2] = 3;
		enemySpeed[3] = 5;
		enemySpeed[4] = 1;
		
		coinspeed1[0] = 4;
		coinspeed1[1] = 4;
		coinspeed1[2] = 4;
		coinspeed1[3] = 4;
		coinspeed1[4] = 4;
		
		
		coinspeed2[0] = 3;
		coinspeed2[1] = 3;
		
		enemyX[0] = -1000;
		enemyX[1] = -1000;
		enemyX[2] = -1000;
		enemyX[3] = -1000;
		enemyX[4] = -1000;
		
		 coinY1[0]=-100;
		 coinY1[1]=-100;
		 coinY1[2]=-100;
		 coinY1[3]=-100;
		 coinY1[4]=-100;
		 
		 coinY2[0]=-100;
		 coinY2[1]=-100;
		 coinY2[2]=-100;
		 coinY2[3]=-100;
		 coinY2[4]=-100;
		
		
		
		
		
		
		
		
		
				
		
	    

	}

}

