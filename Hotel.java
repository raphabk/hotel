package PPE;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Hotel {
	static JFrame hotel = new JFrame();
	static JFrame liste = new JFrame();
	
	static CardLayout cl = new CardLayout();
	
	
	static String[] listContent={"Menu","Creer hotel","Modifier hotel", "Supprimer hotel"};
	
	
	static JPanel content = new JPanel();
	
	
	static JPanel panHotel = new JPanel();
	static JPanel pancHotel = new JPanel();
	static JPanel panmHotel = new JPanel();
	static JPanel pansHotel = new JPanel();
	
	
	
	static JMenuBar mb = new JMenuBar();
	
	static JMenuItem miL = new JMenuItem("Historique");
	static JMenuItem mid = new JMenuItem("Deconnexion");
	static JMenuItem miE = new JMenuItem("Exit");
	
	int num,nbc, an_ouv;
	String nom, ad;
	
	Hotel(){
		this.num = 0;
		this.nom = null;
		this.ad = null;
		this.an_ouv = 0;
		this.nbc = 0;
	}
	
	public static void Hotel(){
		
		
		
	
		
		miL.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.ALT_MASK));
		
		mid.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_MASK));

        miE.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_MASK));
        
        mb.add(miL);
        mb.add(mid);
        mb.add(miE);
        

        
        content.setLayout(cl);   
        content.add(panHotel,listContent[0]);
        content.add(pancHotel, listContent[1]);
        content.add(panmHotel,listContent[2]);
        content.add(pansHotel,listContent[3]);
        
        hotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hotel.setSize(350, 400);
	    hotel.setResizable(false);
	    hotel.setLocationRelativeTo(null);
	    hotel.setJMenuBar(mb);
	    hotel.setVisible(true);
        
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
    			
    			hotel.dispose();
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
