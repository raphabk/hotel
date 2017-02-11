package PPE;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Co {
	static JFrame identification = new JFrame("Identification");
	static JPanel idpan = new JPanel();
    static JPanel copan = new JPanel();
    static JPanel pan = new JPanel();
    static JPanel pane = new JPanel();
    static JPanel panG = new JPanel();
    
    static JTextField id = new JTextField("Identifiant");
    static JPasswordField password = new JPasswordField("Password");
    
    static JButton co = new JButton("Connect");
    
    static JLabel lab = new JLabel("Veuillez vous connecter");
    static JLabel laberr = new JLabel("Vos identifiants sont errones.");
    static Font f = new Font("Verdana", Font.BOLD, 20);
    
    static String user="raph";
    static String mdp ="raph";
    

	public static void Co() {
		
		lab.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lab.setFont(f);
        pan.add(lab);
        
        id.setColumns(15);
        password.setColumns(15);
        idpan.add(id);
        idpan.add(password);
        
        laberr.setAlignmentX(Component.RIGHT_ALIGNMENT);
        laberr.setForeground(Color.RED);
        laberr.setVisible(false);
        
        pane.add(laberr);
        
        
        
        copan.add(co);
        
        panG.add(pan);
        panG.add(idpan);
        panG.add(pane);
        panG.add(copan);
        panG.setLayout(new GridLayout(4, 1));
        
        identification.add(panG);
      
        identification.setSize(350, 300);
        identification.setResizable(false);
        identification.setLocationRelativeTo(null);
        //identification.getContentPane().add(pan, BorderLayout.NORTH);
        //identification.getContentPane().add(idpan, BorderLayout.CENTER);
        //identification.getContentPane().add(copan, BorderLayout.SOUTH);
        identification.setVisible(true);
        identification.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
       id.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
	            }
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			 
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_ENTER){
				if(id.getText().equals(user) && password.getText().equals(mdp)){
	            	id.setText("Identifiant");
	            	password.setText("Password");
	            	identification.dispose();
	                Menu.Menu();
	                
	                }
	            else {
	            	laberr.setVisible(true);
	            	id.setText(null);
	            	password.setText(null);
	            }
			}
			 
		}
	});        
       
       password.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_ENTER){
				if(id.getText().equals(user) && password.getText().equals(mdp)){
	            	id.setText("Identifiant");
	            	password.setText("Password");
	            	identification.dispose();
	                Menu.Menu();
	                
	                }
	            else {
	            	laberr.setVisible(true);
	            	id.setText(null);
	            	password.setText(null);
	            }
			} 
		}
	});

    
       co.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent p) {
            if(id.getText().equals(user) && password.getText().equals(mdp)){
            	id.setText("Identifiant");
            	password.setText("Password");
            	identification.dispose();
                Menu.Menu();
                
                }
            else {
            	laberr.setVisible(true);
            	id.setText(null);
            	password.setText(null);
            }
        }
     });
  }
}
