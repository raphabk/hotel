package PPE;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;

public class Reservation {

	static JFrame reservation = new JFrame("Reservation");
	
	
	static JMenuBar mb = new JMenuBar();
	static JMenuItem mi = new JMenuItem("Historique");
	static JMenuItem mid = new JMenuItem("Deconnexion");
	static JMenuItem mi1 = new JMenuItem("Exit");
	
	static CardLayout cl = new CardLayout();
	
	

	static JPanel content = new JPanel();
	
    
    static JPanel pancReser = new JPanel();
    static JPanel pancReserSP = new JPanel();
    static JPanel panmReser = new JPanel();
    static JPanel panaReser = new JPanel();
    
    
   
    
    //----------------------------------------------------------
    
  //----------------------------------------------------------------------------------------------------------------------
    //RESERVATION TEL
    
    
    static JPanel pan0 = new JPanel();
    static JPanel pan1 = new JPanel();
    static JPanel pan2 = new JPanel();
    static JPanel pan3 = new JPanel();
    static JPanel pan4 = new JPanel();
    static JPanel pan5 = new JPanel();
    static JPanel pan6 = new JPanel();
    static JPanel pan7 = new JPanel();
    static JPanel pan8 = new JPanel();
    static JPanel pan9 = new JPanel();
    static JPanel panf = new JPanel();
    
    static JLabel formu = new JLabel("Reservation par telephone");
    static JLabel lab1 = new JLabel("Nom");
    static JLabel lab2 = new JLabel("Prenom");
    static JLabel lab3 = new JLabel("Age");
    static JLabel lab4 = new JLabel("Sexe");
    static String[] sexe = {"Homme", "Femme"};
    static JLabel lab5 = new JLabel("Date d'arriver");
    static JLabel lab6 = new JLabel("Date de depart");
    static JLabel lab7 = new JLabel("ID de reservation");
    static JLabel lab8 = new JLabel("N° piece d'identite");
    static JLabel lab9 = new JLabel("Nombre de chambre");
    
    
    static protected JTextField text1 = new JTextField(20);
    static JTextField text2 = new JTextField(20);
    static JComboBox combo1 = new JComboBox(sexe);
    static JTextField text3 = new JTextField(2);
    
    static JFormattedTextField textf1 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textf2 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textf3 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textf4 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textf5 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textf6 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textf7 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textf8 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textf9 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    
    static JButton bFormu1 = new JButton("Retour");
    static JButton bFormu2 = new JButton("Valider");
    
    //------------------------------------------------------------------------------------------------------------------------------
    //RESER SP
    
    static JPanel panSP0 = new JPanel();
    static JPanel panSP1 = new JPanel();
    static JPanel panSP2 = new JPanel();
    static JPanel panSP3 = new JPanel();
    static JPanel panSP4 = new JPanel();
    static JPanel panSP5 = new JPanel();
    static JPanel panSP6 = new JPanel();
    static JPanel panSP7 = new JPanel();
    static JPanel panSPf = new JPanel();
    
    static String[] sexe2 = {"Homme", "Femme"};
    static JComboBox combo2 = new JComboBox(sexe2);
    
    
    static JLabel formuSP = new JLabel("Reservation sur place");
    static JLabel labSP1 = new JLabel("Nom");
    static JLabel labSP12 = new JLabel("Prenom");
    static JLabel labSP13 = new JLabel("N° piece d'identite");
    static JLabel labSP14 = new JLabel("Age");
    static JLabel labSP15 = new JLabel("Sexe");
    static JLabel labSP2 = new JLabel("Date d'arriver");
    static JLabel labSP3 = new JLabel("Date de depart");
    static JLabel labSP4 = new JLabel("Nombre de chambre");
    
    
    static JTextField tf1 = new JTextField(15);
    static JTextField tf2 = new JTextField(15);
    static JFormattedTextField textfSPa = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfSP1 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfSP2 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfSP3 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfSP4 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfSP5 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfSP6 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfSP7 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfSP8 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    
    static JButton bFormuSP1 = new JButton("Retour");
    static JButton bFormuSP2 = new JButton("Valider");
    
    //---------------------------------------------------------------------------------------------------------
    //MODIF RESER
    
    static JPanel panm = new JPanel();
    static JPanel panm0 = new JPanel();
    static JPanel panm1 = new JPanel();
    static JPanel panm2 = new JPanel();
    static JPanel panm3 = new JPanel();
    static JPanel panm4 = new JPanel();

    
    static JLabel formum = new JLabel("Modifier une reservation");
    static JLabel labm = new JLabel("ID employe");
    static JLabel labm1 = new JLabel("ID Reservation");
    static JLabel labm2 = new JLabel("Nouvelle date d'arriver");
    static JLabel labm3 = new JLabel("Nouvelle date de retour");
 
    static JTextField tf = new JTextField();
    
    static JFormattedTextField textfM1 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfM2 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfM3 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfM4 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfM5 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfM6 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField textfM7 = new JFormattedTextField(NumberFormat.getIntegerInstance());
   
    static JButton bFormuM1 = new JButton("Retour");
    static JButton bFormuM2 = new JButton("Valider");
    
    //----------------------------------------------------------------------------------------------------------------------------
    //ANNUL RESER
    static JPanel pana = new JPanel();
    static JPanel pana1 = new JPanel();
    static JPanel pana2 = new JPanel();
    static JPanel pana3 = new JPanel();
    static JPanel pana4 = new JPanel();
    
    static JLabel laba = new JLabel("Annuler une reservation");
    static JLabel laba1 = new JLabel("ID Reservation");
    static JLabel laba2 = new JLabel("ID Employe");
    static JLabel labaerr = new JLabel();
    
    static JTextField textfa1 = new JTextField(15);
    static JTextField textfa2 = new JTextField(15);
    
    static JButton bFormua1 = new JButton("Retour");
    static JButton bFormua2 = new JButton("Valider");
    
    //-----------------------------------------------------------------------------------------
    
    static String[] listContent={"Menu Reservation", "Reservation par telephone", "Reservation sur place", "Modifier une resevation", "Annuler une reservation"};
   
    
    static JPanel opt_reser = new JPanel();
    
    static JPanel boutonReser = new JPanel();
    static JPanel labReser = new JPanel();
    static JPanel panReser = new JPanel();
    
    static JLabel rsrt = new JLabel("Choisissez votre option.");
    
    static String[] reser = {"Reservation par telephone","Reservation sur place", "Modifier une resevation","Annuler une reservation", "Retour"};
    static JButton r[] =  new JButton[reser.length];
    
    static int age, ja, ma, aa, jd, md, ad, npi, nb_ch;
    
    static String nom, prenom, sexeF;
    
    
	public static void Reservation(){
		
		for (int i =0; i<reser.length; i++){
            r[i] = new JButton(reser[i]);
            opt_reser.add(r[i]);
        }
		
		labReser.add(rsrt);
		
		//*******************
		
		textf9.setText("0");
		textfSP8.setText("0");
		
		//----------------------------------------------------------------------------------------------------
        //RESER TEL
        textf1.setColumns(2); //DATE
        textf2.setColumns(2); //D'ARRIVE
        textf3.setColumns(4); //RESERVATION
        
        textf4.setColumns(2); //DATE
        textf5.setColumns(2); //DE DEPART
        textf6.setColumns(4); //RESERVATION
        
        textf8.setColumns(12);//NPI
        textf9.setColumns(2);//NB CHAMBRE
        
        //RESER SP
        textfSP1.setColumns(2); //DATE
        textfSP2.setColumns(2); //D'ARRIVE
        textfSP3.setColumns(4); //RESERVATION
        
        textfSP4.setColumns(2); //DATE
        textfSP5.setColumns(2); //DE DEPART
        textfSP6.setColumns(4); //RESERVATION
        
        textfSP7.setColumns(12);//ID?
        textfSP8.setColumns(2);//NB CHAMBRE
        
        textfSPa.setColumns(3); //AGE
        
        //MODIF
        
        textfM1.setColumns(2); //DATE
        textfM2.setColumns(2); //ARRIVER
        textfM3.setColumns(4); //MODIF
        
        textfM4.setColumns(2); //DATE
        textfM5.setColumns(2); //DEPART
        textfM6.setColumns(4); //MODIF
        
        textfM7.setColumns(12); //ID
        
        tf.setColumns(12); //ID employe
        
        
        boutonReser.add(opt_reser);
        panReser.add(labReser);
        panReser.add(boutonReser);
        
// RESER TEL
        
        
        
        
        panf.add(formu);
        
        pan0.add(lab1);
        pan0.add(text1);
        
        pan1.add(lab2);
        pan1.add(text2);
        
        pan2.add(lab3);
        pan2.add(text3);
        
        pan2.add(lab4);
        pan2.add(combo1);
        
        pan4.add(lab5);
        pan4.add(textf1);
        pan4.add(textf2);
        pan4.add(textf3);
        
        pan5.add(lab6);
        pan5.add(textf4);
        pan5.add(textf5);
        pan5.add(textf6);
        
        pan6.add(bFormu1);
        pan6.add(bFormu2);
        
        pan8.add(lab8);
        pan8.add(textf8);
        
        pan9.add(lab9);
        pan9.add(textf9);
        
        pancReser.add(panf);
        pancReser.add(pan0);
        pancReser.add(pan1);
        pancReser.add(pan2);
       // pancReser.add(pan3);
        pancReser.add(pan4);
        pancReser.add(pan5);
        pancReser.add(pan8);
        pancReser.add(pan9);
        pancReser.add(pan6);
        pancReser.setLayout(new GridLayout(9,1));
        //------------------------------------------------------------------------------------------------------
        //RESER SP
        panSPf.add(formuSP);
        
        panSP0.add(labSP1);
        panSP0.add(tf1);
        
        panSP1.add(labSP12);
        panSP1.add(tf2);
        
        panSP2.add(labSP13);
        panSP2.add(textfSP7);
        
        
        panSP3.add(labSP14);
        panSP3.add(textfSPa);
        panSP3.add(labSP15);
        panSP3.add(combo2);
        
        
        panSP4.add(labSP2);
        panSP4.add(textfSP1);
        panSP4.add(textfSP2);
        panSP4.add(textfSP3);
        
        panSP5.add(labSP3);
        panSP5.add(textfSP4);
        panSP5.add(textfSP5);
        panSP5.add(textfSP6);
        
        panSP6.add(labSP4);
        panSP6.add(textfSP8);
        
        panSP7.add(bFormuSP1);
        panSP7.add(bFormuSP2);
        
        pancReserSP.add(panSPf);
        pancReserSP.add(panSP0);
        pancReserSP.add(panSP1);
        pancReserSP.add(panSP2);
        pancReserSP.add(panSP3);
        pancReserSP.add(panSP4);
        pancReserSP.add(panSP5);
        pancReserSP.add(panSP6);
        pancReserSP.add(panSP7);
        pancReserSP.setLayout(new GridLayout(9,1));
        

        // MODIF RESER
        
        panm0.add(formum);
        
        panm1.add(labm1);
        panm1.add(textfM7);
        
        panm.add(labm);
        panm.add(tf);
        
        panm2.add(labm2); 
        panm2.add(textfM1);
        panm2.add(textfM2);
        panm2.add(textfM3);
        
        
        panm3.add(labm3);
        panm3.add(textfM4);
        panm3.add(textfM5);
        panm3.add(textfM6);
        
        panm4.add(bFormuM1);
        panm4.add(bFormuM2);
        
        panmReser.add(panm0);
        panmReser.add(panm1);
        panmReser.add(panm);
        panmReser.add(panm2);
        panmReser.add(panm3);
        panmReser.add(panm4);
        panmReser.setLayout(new GridLayout(6,1));
        
        //ANNUL RESER
        
        pana.add(laba);
        
        pana1.add(laba1);
        pana1.add(textfa1);
        
        pana2.add(laba2);
        pana2.add(textfa2);
        
        pana3.add(labaerr);
        
        pana4.add(bFormua1);
        pana4.add(bFormua2);
        
        panaReser.add(pana);
        panaReser.add(pana1);
        panaReser.add(pana2);
        panaReser.add(pana3);
        panaReser.add(pana4);
        pana3.setVisible(false);
        panaReser.setLayout(new GridLayout(5, 1));
        
        
        content.setLayout(cl);   
        content.add(panReser,listContent[0]);
        content.add(pancReser, listContent[1]);
        content.add(pancReserSP,listContent[2]);
        content.add(panmReser,listContent[3]);
        content.add(panaReser,listContent[4]);
        
   
        
        
        //---------------------------------------------------------
        
        
        mi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.ALT_MASK));
        
        mid.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_MASK));
        
        
        mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_MASK));
        
        mb.add(mi);
        mb.add(mid);
        mb.add(mi1);
        
        //---------------------------------------------------------
        JFrame historique = new JFrame("Historique");
        JFrame temp = new JFrame("Ajout manuel");
        JPanel panhReser = new JPanel();
        JButton b1 = new JButton("Ajout manuel");
        
        DefaultTableModel model = new DefaultTableModel();
        DefaultTableModel model1 = new DefaultTableModel();
        
        
        model.addColumn("Numero Hotel");
        model.addColumn("Numero Client");
		model.addColumn("Numero Chambre");
		model.addColumn("Date arrive");
		model.addColumn("Date depart");
		model.addRow(new String[]{"1", "1", "1", "1/2/2016", "6/2/2016"});
		
		
		JTable tableau = new JTable(model);
		
		panhReser.add(tableau);
        
        b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
        //*********************************************************
        
        reservation.add(content);
        reservation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        reservation.setSize(350, 400);    
        reservation.setResizable(false);
        reservation.setLocationRelativeTo(null);
        opt_reser.setLayout(new GridLayout(5,1));
        cl.show(content, listContent[0]);
        reservation.setJMenuBar(mb);
        reservation.setVisible(true);
        
        historique.add(panhReser);
        historique.setSize(400, 200);
        historique.setResizable(false);
        historique.setLocationRelativeTo(null);
        historique.setVisible(false);
        
        
        
        
        
        bFormu1.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent p){
                cl.show(content, listContent[0]);
            }
        });
        
        bFormu2.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent p){
                nom = text1.getText();
                prenom = text2.getText();
                if (combo1.getSelectedItem().equals("Femme"))
                    sexeF = "Femme";
                else
                    sexeF = "Homme";
                
                age = DoubleParseDouble(text3);
                
                ja = DoubleParseDouble(textf1);
                ma = DoubleParseDouble(textf2);
                aa = DoubleParseDouble(textf3);
                
                jd = DoubleParseDouble(textf4);
                md = DoubleParseDouble(textf5);
                ad = DoubleParseDouble(textf6);
                
                npi = DoubleParseDouble(textf8);
                nb_ch = DoubleParseDouble(textf9);               
      
                Payement.Payement();
                             
            }
        });

        bFormuSP1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                cl.show(content, listContent[0]);
            }
        });
        
        bFormuSP2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				 nom = text1.getText();
	                prenom = text2.getText();
	                if (combo1.getSelectedItem().equals("Femme"))
	                    sexeF = "Femme";
	                else
	                    sexeF = "Homme";
	                
	                age = DoubleParseDouble(text3);
	                
	                ja = DoubleParseDouble(textf1);
	                ma = DoubleParseDouble(textf2);
	                aa = DoubleParseDouble(textf3);
	                
	                jd = DoubleParseDouble(textf4);
	                md = DoubleParseDouble(textf5);
	                ad = DoubleParseDouble(textf6);
	                
	                npi = DoubleParseDouble(textf8);
	                nb_ch = DoubleParseDouble(textf9);
				    Payement.Payement();			
			}        	
        });
        
        bFormuM1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cl.show(content, listContent[0]);
			}
        	
        });
	    
	    bFormuM2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 nom = text1.getText();
	                prenom = text2.getText();
	                if (combo1.getSelectedItem().equals("Femme"))
	                    sexeF = "Femme";
	                else
	                    sexeF = "Homme";
	                
	                age = DoubleParseDouble(text3);
	                
	                ja = DoubleParseDouble(textf1);
	                ma = DoubleParseDouble(textf2);
	                aa = DoubleParseDouble(textf3);
	                
	                jd = DoubleParseDouble(textf4);
	                md = DoubleParseDouble(textf5);
	                ad = DoubleParseDouble(textf6);
	                
	                npi = DoubleParseDouble(textf8);
	                nb_ch = DoubleParseDouble(textf9);
	                
	                //payement.setVisible(true);
				
			}
        	
        });
	    
	    bFormua1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pana3.setVisible(false);
				cl.show(content, listContent[0]);
				
			}
		});
	    
	    bFormua2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(!textfa2.getText().equals("raph")){
					pana3.setVisible(true);
					labaerr.setForeground(Color.red);
					labaerr.setText("Acces refuse");
				}
				else{
					pana3.setVisible(true);
					labaerr.setForeground(Color.green);
					labaerr.setText("Reservation annule");
				}
			}
		});
	    
	    
	    
	    
	    r[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent p){
                cl.show(content, listContent[1]);
                
            }
        });
        
        r[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent p){
                cl.show(content, listContent[2]);
            }
        });
        
        r[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent p){
                cl.show(content, listContent[3]);
            }
        });
        
        r[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent p){
                cl.show(content, listContent[4]);
            }
        });
      r[4].addActionListener(new ActionListener(){
          public void actionPerformed( ActionEvent p){
              //reservation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              reservation.dispose();
              Menu.Menu();
              
          }
      });
      
      mi.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			historique.setVisible(true);
			
		}
	});
      mid.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			reservation.dispose();
			Co.Co();
			
			
		}
	});
      mi1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	});
        
	}


	protected static int DoubleParseDouble(JTextField text32) {
		// TODO Auto-generated method stub
		return 0;
	}
}
