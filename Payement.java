package PPE;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.*;

public class Payement {

	static JFrame payement = new JFrame();

	
	static CardLayout cl = new CardLayout();
	
	 static String[] listContent = {"Choix Chambre","Payement"};
	 
	
	
	static JPanel content = new JPanel();
	
	static JPanel choix = new JPanel();
	
	static JPanel pan1 = new JPanel();
	static JPanel pan2 = new JPanel();
	static JPanel pan3 = new JPanel();
	static JPanel pan4 = new JPanel();
	static JPanel pan5 = new JPanel();
	static JPanel pan6 = new JPanel();
	static JPanel pan7 = new JPanel();
	
	static JLabel lab1 = new JLabel("Composition des chambres");
	static JLabel lab2 = new JLabel("Chambre enfant");
	static JLabel lab3 = new JLabel("Chambre simple");
	static JLabel lab4 = new JLabel("Chambre double");
	static JLabel lab5 = new JLabel();
	

	static JCheckBox cb1 = new JCheckBox("Chambre enfant");
	static JCheckBox cb2 = new JCheckBox("Chambre simple");
	static JCheckBox cb3 = new JCheckBox("Chambre double");
	
	static JFormattedTextField tf1 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField tf2 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField tf3 = new JFormattedTextField(NumberFormat.getIntegerInstance());
	
	static JButton b1 = new JButton("Retour");
	static JButton b2 = new JButton("Valider");
	static JButton b3 = new JButton("OK");
	static JButton b4 = new JButton("Payement CB");
	
    
	static JPanel pay = new JPanel();
    static JPanel payp = new JPanel();
    static JPanel pay1 = new JPanel();
    static JPanel pay2 = new JPanel();
    static JPanel pay3 = new JPanel();
    static JPanel pay4 = new JPanel();
    
    static JLabel labpay = new JLabel("Payement");
    static JLabel labpay1 = new JLabel("N° de carte");
    static JLabel labpay2 = new JLabel("Date d'expiration");
    static JLabel labpay3 = new JLabel("Cryptogramme");
    
    static JFormattedTextField paytextf1 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField paytextf2 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField paytextf3 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    static JFormattedTextField paytextf4 = new JFormattedTextField(NumberFormat.getIntegerInstance());
    
    static JButton val = new JButton("Valider");
    static JButton ret = new JButton("Retour");    
	
    static int nb;
    
	public static void Payement(){
		
		
		//CHOIX CHAMBRE
		tf1.setText("0");
    	tf2.setText("0");
    	tf3.setText("0");
		tf1.setColumns(2);
		tf2.setColumns(2);
		tf3.setColumns(2);
		
		
		//lab1.setFont(Co.f);
		
		pan1.add(lab1);
		
		pan2.add(cb1);
		pan2.add(cb2);
		pan2.add(cb3);
		
		pan3.add(lab2);
		pan3.add(tf1);
		pan3.add(lab3);
		pan3.add(tf2);
		pan3.add(lab4);
		pan3.add(tf3);
		
		pan4.add(b1);
		pan4.add(b2);
		
		pan5.add(b3);
		
		pan6.add(lab5);
		
		pan7.add(b4);
		
		choix.add(pan1);
		choix.add(pan2);
		choix.add(pan3);
		choix.add(pan4);
		choix.add(pan5);
		choix.add(pan6);
		choix.add(pan7);
		
		choix.setLayout(new GridLayout(7, 1));

		//CB
        
        paytextf1.setColumns(16);
        paytextf2.setColumns(2);
        paytextf3.setColumns(2);
        paytextf4.setColumns(3);
        
        payp.add(labpay);
        
        pay1.add(labpay1);
        pay1.add(paytextf1);
        
        pay2.add(labpay2);
        pay2.add(paytextf2);
        pay2.add(paytextf3);
        
        pay3.add(labpay3);
        pay3.add(paytextf4);
        
        pay4.add(val);
        
        pay.add(payp);
        pay.add(pay1);
        pay.add(pay2);
        pay.add(pay3);
        pay.add(pay4);
        
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan6.setVisible(false);
        pan7.setVisible(false);
        content.setLayout(cl);   
        content.add(choix,listContent[0]);
        content.add(pay, listContent[1]);
        
        payement.add(content);
        payement.setSize(400, 300);
        payement.setLocationRelativeTo(null);
        payement.setResizable(false);
        cl.show(content, listContent[0]);
        payement.setVisible(true);
        
        payement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        val.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                payement.dispose();
                cb1.setSelected(false);
				cb2.setSelected(false);
				cb3.setSelected(false);
				tf1.setEnabled(true);
				tf2.setEnabled(true);
				tf3.setEnabled(true);
            }
            
        });
        b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				payement.dispose();
				pan1.setVisible(true);
				pan2.setVisible(true);
				pan3.setVisible(false);
				pan4.setVisible(false);
				pan5.setVisible(true);
				pan6.setVisible(false);
				pan7.setVisible(false);
				cb1.setSelected(false);
				cb2.setSelected(false);
				cb3.setSelected(false);
				tf1.setEnabled(true);
				tf2.setEnabled(true);
				tf3.setEnabled(true);
			}
		});
        b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//cl.show(content, listContent[1]);
				nb = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText()) + Integer.parseInt(tf3.getText());
				
					
				
				if(!(nb == Integer.parseInt(Reservation.textf9.getText()))){
					lab5.setText("Nombre de chambre incorrect");
					lab5.setForeground(Color.RED);
					pan6.setVisible(true);
				}
				else{
					pan7.setVisible(true);
					pan4.setVisible(false);
					tf1.setEnabled(false);
					tf2.setEnabled(false);
					tf3.setEnabled(false);
					pan7.setVisible(true);
				}
				
			}
		});
        b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(cb1.isSelected() ==  true && cb2.isSelected() == true && cb3.isSelected() == true){
					pan1.setVisible(true);
					pan2.setVisible(false);
					pan3.setVisible(true);
					pan4.setVisible(true);
					pan5.setVisible(false);
					pan6.setVisible(false);
					pan7.setVisible(false);
				}
				else if (cb1.isSelected() == true && cb3.isSelected() == true){
					tf2.setEnabled(false);
					pan1.setVisible(true);
					pan2.setVisible(false);
					pan3.setVisible(true);
					pan4.setVisible(true);
					pan5.setVisible(false);
					pan6.setVisible(false);
					pan7.setVisible(false);
				}
				else if (cb1.isSelected() == true && cb2.isSelected() == true){
					tf3.setEnabled(false);
					pan1.setVisible(true);
					pan2.setVisible(false);
					pan3.setVisible(true);
					pan4.setVisible(true);
					pan5.setVisible(false);
					pan6.setVisible(false);
					pan7.setVisible(false);
				}
				else if (cb2.isSelected() == true && cb3.isSelected() == true){
					tf1.setEnabled(false);
					pan1.setVisible(true);
					pan2.setVisible(false);
					pan3.setVisible(true);
					pan4.setVisible(true);
					pan5.setVisible(false);
					pan6.setVisible(false);
					pan7.setVisible(false);
				}
				else if (cb1.isSelected() == true){
					tf2.setEnabled(false);
					tf3.setEnabled(false);
					pan1.setVisible(true);
					pan2.setVisible(false);
					pan3.setVisible(true);
					pan4.setVisible(true);
					pan5.setVisible(false);
					pan6.setVisible(false);
					pan7.setVisible(false);
				}
				else if (cb2.isSelected() == true){
					tf1.setEnabled(false);
					tf3.setEnabled(false);
					pan1.setVisible(true);
					pan2.setVisible(false);
					pan3.setVisible(true);
					pan4.setVisible(true);
					pan5.setVisible(false);
					pan6.setVisible(false);
					pan7.setVisible(false);
				}
				else if(cb3.isSelected() == true){
					tf1.setEnabled(false);
					tf2.setEnabled(false);
					pan1.setVisible(true);
					pan2.setVisible(false);
					pan3.setVisible(true);
					pan4.setVisible(true);
					pan5.setVisible(false);
					pan6.setVisible(false);
					pan7.setVisible(false);
				}
			}
		});
	}
	
	protected static int DoubleParseDouble(JTextField text32) {
		// TODO Auto-generated method stub
		return 0;
	}
}
