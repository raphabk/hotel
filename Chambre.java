package PPE;

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class Chambre {

	static JFrame chambre = new JFrame();
	static JFrame liste = new JFrame();
	
	static JMenuBar mb = new JMenuBar();
	static JMenuItem miL = new JMenuItem("Liste");
	static JMenuItem mid = new JMenuItem("Deconnexion");
	static JMenuItem miE = new JMenuItem("Exit");
	
	static JPanel opt_ch = new JPanel();
	static JPanel boutonEC = new JPanel();
	static JPanel labEC = new JPanel();
	static JPanel panEC = new JPanel();
	 
	 
	static JLabel rsrt2 = new JLabel("Choisissez votre option.");
	static String[] etat_ch = {"Prix", "Disponibilite", "Retour"};
	static JButton ec[] = new JButton[etat_ch.length];
	 
	public static void Chambre(){
		for (int i = 0;i<etat_ch.length; i++){
	            ec[i] = new JButton(etat_ch[i]);
	            opt_ch.add(ec[i]);
	            ec[i].setSize(20, 50);
	        }
		labEC.add(rsrt2);
		
		 boutonEC.add(opt_ch);
	     panEC.add(labEC);
	     panEC.add(boutonEC);
	     
	     //--------------------------------------
	     
	     miL.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.ALT_MASK));
			
			mid.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_MASK));

	        miE.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_MASK));
	        
	        mb.add(miL);
	        mb.add(mid);
	        mb.add(miE);
	     
	     //-----------------------------------
	     
	     chambre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     chambre.setSize(350, 400);        
	     opt_ch.setLayout(new GridLayout(3, 1));
	     chambre.setResizable(false);
	     chambre.setLocationRelativeTo(null);
	     chambre.add(panEC);
	     chambre.setJMenuBar(mb);
	     chambre.setVisible(true);
	     
	     
	     ec[0].addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent p){
	                
	            }
	        });
	        
	        ec[1].addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent p){
	                
	            }
	        });
	        
	        ec[2].addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent p){
	                chambre.dispose();
	                Menu.Menu();
	            }
	        });
	        
	        
	        miL.addActionListener(new ActionListener() {
	    		@Override
	    		public void actionPerformed(ActionEvent e) {
	    			// TODO Auto-generated method stub
	    			liste.setVisible(true);
	    			
	    		}
	    	});
	          mid.addActionListener(new ActionListener() {
	    		
	    		@Override
	    		public void actionPerformed(ActionEvent e) {
	    			// TODO Auto-generated method stub
	    			
	    			chambre.dispose();
	    			Co.Co();
	    			
	    			
	    		}
	    	});
	          miE.addActionListener(new ActionListener() {
	    		
	    		@Override
	    		public void actionPerformed(ActionEvent e) {
	    			// TODO Auto-generated method stub
	    			System.exit(0);
	    		}
	    	});
	 }
}
