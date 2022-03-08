package pack1;
import java.util.Timer;
import java.util.TimerTask;

public class CoinCollision {
	Timer collision;
	private int temp = 0;

	public CoinCollision() {
		collision = new Timer();
		collision.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				for (int i = 0; i <= 4; i++) {
					
						if (Var.x >= Var.coinX1[i] -150 && Var.x <= Var.coinX1[i] + 80 && Var.y >= Var.coinY1[i] - 80
								&& Var.y <= Var.coinY1[i] + 80) {   //if-Abfrage durch die gepr�ft werden kann ob eine M�nze ber�hrt wird
							Var.coins +=1;    //wenn M�nze der Wertigkeitn1 ber�hrt wird so z�hlt der M�nzcounter +1
							Var.coinY1[i]=-200;  //  Die M�nze wird zur�ck nach oben gesetzt
							Var.coinX1[i] = (int)(Math.random()*1900);//Die M�nze bekommt neuen zuf�lligen X-Wert
							
						}
						if (Var.x >= Var.coinX2[i] -150 && Var.x <= Var.coinX2[i] + 80 && Var.y >= Var.coinY2[i] - 80//Das selbe f�r diese M�nzen
								&& Var.y <= Var.coinY2[i] + 80) {
							Var.coins +=5;
							Var.coinY2[i]=-2000;
							Var.coinX2[i] = (int)(Math.random()*1900);
							
						}
						if (Var.x >= Var.coinX3 -150 && Var.x <= Var.coinX3 + 80 && Var.y >= Var.coinY3 - 80 // Das selbe f�r diese M�nze
								&& Var.y <= Var.coinY3 + 80) {
							Var.coins +=10;
							Var.coinY3=-4000;
							Var.coinX3 = (int)(Math.random()*1900);
							
						}
					
				}
				
			}
		}, 0, 15);
	}

}