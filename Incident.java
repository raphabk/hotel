package PPE;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import java.text.NumberFormat;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Incident {

	static JFrame incident = new JFrame();
	
	static CardLayout cl = new CardLayout();
	static String[] listContent = {"Menu","Signaler Incident","Historique"};
	
	static JMenuBar mb = new JMenuBar();
	static JMenuItem mid = new JMenuItem("Deconnexion");
	static JMenuItem miE = new JMenuItem("Exit");
	

	static JPanel content = new JPanel();
    
	static JPanel panmInci = new JPanel();
    static JPanel pansInci = new JPanel();
    static JPanel panhInci = new JPanel();

    
    //-----------------------------------------------------------------
    
    static int i = 1;
    
    static JPanel pans = new JPanel();
    static JPanel pans0 = new JPanel();
    static JPanel pans1 = new JPanel();
    static JPanel pans2 = new JPanel();
    static JPanel pans3 = new JPanel();
    static JPanel pans4 = new JPanel();
    
    static JLabel lab = new JLabel("Signaler un incident");
    static JLabel lab0 = new JLabel("ID");
    static JLabel lab1 = new JLabel("ID employe");
    static JLabel lab2 = new JLabel("Type");
    static JLabel lab3 = new JLabel("Date");
    static JLabel lab4 = new JLabel("Note");
    
    static String[] type = {"Vol","Deterioration", "Accident"};
    
    static JComboBox cb = new JComboBox(type);
    
    
    static JFormattedTextField tf0 = new JFormattedTextField(15);
    static JTextField tf1 = new JTextField(15);
    static JFormattedTextField tf2 = new JFormattedTextField(NumberFormat.getIntegerInstance()); 
    static JFormattedTextField tf3 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField tf4 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    
    static JTextArea area = new JTextArea();
	static JScrollPane jsp = new JScrollPane(area);
	
	static JButton b0 = new JButton("Valider");
	static JButton b1 = new JButton("Retour");
    
    
    //----------------------------------------------------------------
	
	static JTable tableau = new JTable();
	static DefaultTableModel model = new DefaultTableModel(5, 1);
	
	
	//----------------------------------------------------------------
	
	static JPanel opt_inci = new JPanel();
	static JPanel boutonInci = new JPanel();
    static JPanel labInci = new JPanel();
    
    
    static JLabel rsrt1 = new JLabel("Choisissez votre option.");
    static String[] inci = {"Signaler un incident","Historique des incident","Retour"};
    static JButton in[] = new JButton[inci.length];
    
    public static void Incident(){
    	tf2.setText("0");
    	tf3.setText("0");
    	tf4.setText("0");
    	
    	 for (int i = 0;i<inci.length; i++ ){
             in[i] = new JButton(inci[i]);
             opt_inci.add(in[i]);
         }
    	 
    	 labInci.add(rsrt1);
    	 boutonInci.add(opt_inci);
         panmInci.add(labInci);
         panmInci.add(boutonInci);
     //-----------------------------------------------------------------
         
         tf0.setColumns(2);
         tf1.setColumns(15);
         tf2.setColumns(2);
         tf3.setColumns(2);
         tf4.setColumns(2);
         
         tf0.setEnabled(false);
         
     //----------------------------------------------------------------
         
         tf0.setText(String.valueOf(i));
         
         jsp.setPreferredSize(new Dimension(150,50));
    	 
         pans.add(lab);
         pans0.add(lab0);
         pans0.add(tf0);
         
         pans1.add(lab1);
         pans1.add(tf1);
         
         pans2.add(lab2);
         pans2.add(cb);
         pans2.add(lab3);
         pans2.add(tf2);
         pans2.add(tf3);
         pans2.add(tf4);
         
         pans3.add(lab4);
         pans3.add(jsp);
         
         pans4.add(b0);
         pans4.add(b1);
         
         pansInci.add(pans);
         pansInci.add(pans0);
         pansInci.add(pans1);
         pansInci.add(pans2);
         pansInci.add(pans3);
         pansInci.add(pans4);
         pansInci.setLayout(new GridLayout(6, 1));
         
      //--------------------------------------------------------------
         
         mid.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_MASK));
         
         
         miE.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_MASK));
         
         mb.add(mid);
         mb.add(miE);
         
         
         
     //-----------------------------------------------------------------    
         content.setLayout(cl);   
         content.add(panmInci,listContent[0]);
         content.add(pansInci, listContent[1]);
         content.add(panhInci,listContent[2]);

         incident.add(content);
         incident.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         incident.setSize(350, 400);
	     incident.setResizable(false);
	     opt_inci.setLayout(new GridLayout(3,1));
	     incident.setLocationRelativeTo(null);
	     cl.show(content, listContent[0]);
	     incident.setJMenuBar(mb);
	     incident.setVisible(true);
         
         in[0].addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent p){
                 cl.show(content, listContent[1]);
             }
         });
         
         in[1].addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent p){
            	 cl.show(content, listContent[2]);
             }
         });
         
         in[2].addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent p){
                 incident.dispose();
                 Menu.Menu();
             }
         });
         b0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(tf1.getText().equals(Co.user)){
					
					 
					 
					 int id, j,m,a;
					 String type_inci,note, ide;
					 
						id =Integer.parseInt(tf0.getText()); 
						ide = tf1.getText();              
						type_inci = (String)cb.getSelectedItem();
						j = Integer.parseInt(tf2.getText());
						m = Integer.parseInt(tf3.getText());
						a = Integer.parseInt(tf4.getText());
						note = area.getText();
						System.out.println(id+"\n"+ide+"\n"+type_inci+"\n"+j+" "+ m+ " "+a+"\n"+note);
						
						i++;
						
						tf0.setText(String.valueOf(i));
						tf1.setText(null);
						tf2.setText("0");
						tf3.setText("0");
						tf4.setText("0");
					    cb.setSelectedIndex(0);
					    
					    Information.label.setText("Incident enregistre");
					    Information.label.setForeground(Color.GREEN);
					    Information.Information();
				}
				else{
					 /*JFrame frame = new JFrame("Erreur");
					 JPanel panel = new JPanel();
					 Font a = new Font("ARIAL",Font.BOLD, 25);
					 JLabel label = new JLabel("Acces refuse");
					 label.setFont(a);
					 label.setForeground(Color.red);
					 panel.add(label);
					 frame.add(panel);
					 frame.setSize(500, 150);
					 frame.setResizable(false);
					 frame.setLocationRelativeTo(null);
					 frame.setVisible(true);*/
					Information.label.setText("Acces refuse");
					Information.label.setForeground(Color.red);
					Information.Information();
					 
				}
			}
		});
    	 b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(content, listContent[0]);
			}
		});
    	 
    	 mid.addActionListener(new ActionListener() {
    			
    			@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    				
    			incident.dispose();
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
