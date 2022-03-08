
package pack1;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.w3c.dom.events.MouseEvent;
import java.awt.event.*;

public class Gui {

	public Gui() {
		Var.jf1 = new JFrame();  // neues JFrame wird erstellt
		Var.jf1.setSize(Var.screenWidth,Var.screenHeight); //die Größe des JFrame wird bestimmt
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Man kann das JFrame auf X schliesen
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.setLayout(null);//kein bestimmtes LAyout
		Var.jf1.setTitle("space shooter"); //Name der Anwendung
		Var.jf1.setResizable(false);//man kann die größe der Anwendung nicht veränder
		Var.jf1.addKeyListener(new KeyHandler()); //KeyListener wird dem JFrame hinzugefügt
		Var.jf1.requestFocus();//alles wird angezeigt
		
		
		
		
		Var.lbl1 = new Label(); // neues Label wird erstellt
		
		Var.lbl1.setBounds(0,0,Var.screenWidth,Var.screenHeight);//größer des Labels wird determiniert
		
		
		
		Var.lbl1.setVisible(true);//das Label und der JFrame wird beides sichtbar gemacht
		Var.jf1.setVisible(true);//JFramew wird sichtbar gemacht
		
		
		
		
		 int b = 600;//Variable für Texte mit einheitlicher Position
		
		Var.btnresume = new JButton();//Butten wird hinzugefügt( weiter button)
		Var.btnresume.setText("Resume");//Name des Buttons
		Var.btnresume.setBounds(b,50,726,50);//Größe und Position des Buttons
		Var.btnresume.setVisible(false);//ist unsichtbar wird also noch nicht angezeigt
		Var.btnresume.addActionListener(new ActionHandler()); //damit der Button gedrückt werden kann
		Var.btnresume.setBackground(Color.BLACK);//Hintergrundfarbe des Buttons
		Var.btnresume.setFont(new Font("Arial",Font.BOLD,40));//Schrift art des Buttons
		Var.btnresume.setForeground(Color.WHITE);//Fordergrundfarbe des Buttons
		Var.btnresume.setBorder(null);
		Var.btnresume.setFocusPainted(false);
		Var.btnresume.addMouseListener(new MouseAdapter() {//interaktion mit der Maus(funktoniert bei uns nicht)
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnresume.setBackground(new Color(0,230,115));
				Var.btnresume.setForeground(Color.BLACK);
				
			}
			public void mouseExited(MouseEvent evt) {
				Var.btnresume.setBackground(Color.BLACK);
				Var.btnresume.setForeground(Color.WHITE);
				
			}
			
			
		});
		Var.jf1.add(Var.btnresume);//der Button wird der JFrame hinzugefügt
		
		Var.btnshop = new JButton();// dasselbe wie für den oberen Button(button damit man in den Shop kommt)
		Var.btnshop.setText("Upgrades!");//Name des Buttons
		Var.btnshop.setBounds(b,150,726,50);
		Var.btnshop.setVisible(false);
		Var.btnshop.addActionListener(new ActionHandler()); 
		Var.btnshop.setBackground(Color.BLACK);
		Var.btnshop.setFont(new Font("Arial",Font.BOLD,40));
		Var.btnshop.setForeground(Color.WHITE);
		Var.btnshop.setBorder(null);
		Var.btnshop.setFocusPainted(false);
		Var.btnshop.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnshop.setBackground(new Color(0,230,115));
				Var.btnshop.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent evt) {
				Var.btnshop.setBackground(Color.BLACK);
				Var.btnshop.setForeground(Color.WHITE);
			}
			
			
		});
		Var.jf1.add(Var.btnshop);
		
		
		
		
		
		
		Var.btnexit = new JButton();//das gleiche wie für die oberen Buttons(button um das Spiel zu schliesen)
		Var.btnexit.setText("Exit");
		Var.btnexit.setBounds(b,250,726,50);
		Var.btnexit.setVisible(false);
		Var.btnexit.addActionListener(new ActionHandler()); 
		Var.btnexit.setBackground(Color.BLACK);
		Var.btnexit.setFont(new Font("Arial",Font.BOLD,40));
		Var.btnexit.setForeground(Color.WHITE);
		Var.btnexit.setBorder(null);
		Var.btnexit.setFocusPainted(false);
		Var.btnexit.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnexit.setBackground(new Color(0,230,115));
				Var.btnexit.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent evt) {
				Var.btnexit.setBackground(Color.BLACK);
				Var.btnexit.setForeground(Color.WHITE);
			}
			
			
		});
		Var.jf1.add(Var.btnexit);
		
		
		Var.btnupgrade1 = new JButton();//das gleiche wie für die oberen Buttons(Button um das Schilupgrade zu kaufen)
		Var.btnupgrade1.setText("buy shield");
		Var.btnupgrade1.setBounds(1100,350,300,50);
		Var.btnupgrade1.setVisible(false);
		Var.btnupgrade1.addActionListener(new ActionHandler()); 
		Var.btnupgrade1.setBackground(Color.BLACK);
		Var.btnupgrade1.setFont(new Font("Arial",Font.BOLD,40));
		Var.btnupgrade1.setForeground(Color.WHITE);
		Var.btnupgrade1.setBorder(null);
		Var.btnupgrade1.setFocusPainted(false);
		Var.btnupgrade1.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnupgrade1.setBackground(new Color(0,230,115));
				Var.btnupgrade1.setForeground(Color.BLACK);
				if(Var.coins<Var.shotprice) {
					Var.btnupgrade1.setText("X");
				}
			}
			public void mouseExited(MouseEvent evt) {
				Var.btnupgrade1.setBackground(Color.BLACK);
				Var.btnupgrade1.setForeground(Color.WHITE);
				Var.btnupgrade1.setText("buy shield");
			}
		});
		Var.jf1.add(Var.btnupgrade1);
		
		
		Var.btnupgrade2 = new JButton();//das gleiche wie für die oberen Buttons (button um schüsse zu kaufen)
		Var.btnupgrade2.setText("buy shots");
		Var.btnupgrade2.setBounds(1100,450,300,50);
		Var.btnupgrade2.setVisible(false);
		Var.btnupgrade2.addActionListener(new ActionHandler()); 
		Var.btnupgrade2.setBackground(Color.BLACK);
		Var.btnupgrade2.setFont(new Font("Arial",Font.BOLD,40));
		Var.btnupgrade2.setForeground(Color.WHITE);
		Var.btnupgrade2.setBorder(null);
		Var.btnupgrade2.setFocusPainted(false);
		Var.btnupgrade2.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent evt) {
				Var.btnupgrade2.setBackground(new Color(0,230,115));
				Var.btnupgrade2.setForeground(Color.BLACK);
				if(Var.coins<Var.shieldprice) {
					Var.btnupgrade2.setText("X");
				}
			}
			public void mouseExited(MouseEvent evt) {
				Var.btnupgrade2.setBackground(Color.BLACK);
				Var.btnupgrade2.setForeground(Color.WHITE);
				Var.btnupgrade2.setText("buy shots");
			}
		});
		Var.jf1.add(Var.btnupgrade2);
		
		Var.jf1.add(Var.lbl1);//Das Label wird dem JFrame hinzugefügt
		
		
	}

}
