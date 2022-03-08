package pack1;

import java.util.Timer;
import java.util.TimerTask;


public class GameOver {
	Timer timer;
	private int temp = 0, temp1 = 0, temp2 = 0;

	public GameOver() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.lost) {//prüft ob man verloren hat
					if (temp >= 0 && temp <= 55) {
						temp++;
					} else if (temp == 56) {
						System.out.println("verloren");//Ausgabe in der Konsole
						//Menüzugriff
						Var.inGame = false;  //zustände werden richtig gesetzt
						Var.inShop = false;
						Var.inMenu = true;
						Var.inOptions = false;
						Var.btnresume.setVisible(true);//der resume button wird angezeigt
						Var.btnshop.setVisible(false);//alle anderen Buttons werden nicht gebraucht werden also unsichtbar gemacht
						
						Var.btnexit.setVisible(false);
						
						Var.btnupgrade1.setVisible(false);
						Var.btnupgrade2.setVisible(false);
						
						
						KeyHandler.tempKeyHandler++;
						Var.btnresume.requestFocus();//Die Buttons rücken in den Vordergrund
						Var.btnshop.requestFocus();
						Var.btnexit.requestFocus();
						
						
						Var.jf1.requestFocus();
						
						
						// Platzierung der Münzen
						for (int i = 0; i <= 4; i++) {
							Var.coinX1[i] = 20 + temp1;
							Var.coinY1[i] = -200 - temp1;
							temp += 160;
						}
						//Nach Game Over werden alle Bilder an ihre Ursprüngliche position gebracht dass man nachdem man gestorben ist auf resume weiter spielen kann
						Var.coinX2[0] = 266;
						Var.coinX2[1] = 533;
						Var.coinY2[0] = -2000;
						Var.coinY2[1] = -3000;

						Var.coinX3 = 375;
						Var.coinY3 = -4000;
						//Platzierung der Gegner
						for(int i = 0;i<=4;i++) {
							
							Var.enemyY[i] = -100 -temp2;
							temp2 +=160;
						}
						temp =0;
						Var.coins =0;  //Münzen, Leben , Munition werden zurückgesetzt
						Var.hp =3;
						Var.ammo = 0;
						Var.lost = false;
					}
				}
			}
		}, 0, 15);
	}

}
