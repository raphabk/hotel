package PPE;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu {

	static JFrame cadre = new JFrame("Menu");
	static JPanel options = new JPanel();
	static JLabel bvn = new JLabel("Bienvenue, quel option souhaitez-vous utiliser ?");
	//static JLabel raphaelle =  new JLabel(new ImageIcon ("c:/home/crif/Bureau/Raph/restaurant.jpg"));
	
	static String[] menu = {"Reservation", "Incident","Chambres", "Hotel"};
	static  JComboBox choix_menu = new JComboBox(menu);
	
	public static void Menu(){
		
		options.add(bvn);
        options.add(choix_menu);
		cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadre.setSize(500, 300);
	    cadre.setResizable(false);
	    cadre.setLocationRelativeTo(null);
	    cadre.setLayout(new BorderLayout());
	    cadre.getContentPane().add(options, BorderLayout.NORTH);
	    cadre.setVisible(true);
	    
	    choix_menu.addActionListener(new ActionListener(){
	 

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (choix_menu.getSelectedItem().equals("Reservation")) {
			        
			        cadre.setVisible(false);
			        Reservation.Reservation();
			}
				else if(choix_menu.getSelectedItem().equals("Incident")){
			        
			        cadre.setVisible(false);
			        Incident.Incident();
			}
				else if(choix_menu.getSelectedItem().equals("Chambres")){
			        cadre.setVisible(false);
			        Chambre.Chambre();
			}
				else if(choix_menu.getSelectedItem().equals("Hotel")){
					cadre.setVisible(false);
					Hotel.Hotel();
			}
	     }
     });
  }
}
