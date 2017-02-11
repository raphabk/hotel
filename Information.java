package PPE;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Information {

	static JFrame frame = new JFrame("Information");
	
	static JPanel panel = new JPanel();
	static JPanel pm = new JPanel();
	static JPanel pb = new JPanel();
	
	static JButton b = new JButton("OK");
	
	static Font a = new Font("ARIAL",Font.BOLD, 25);
	
	static JLabel label = new JLabel();
	 
	public static void Information(){
		
		 label.setFont(a);
		 pm.add(label);
		 pb.add(b);
		 panel.add(pm);
		 panel.add(pb);
		 frame.add(panel);
		 panel.setLayout(new GridLayout(2,1));
		 frame.setSize(500, 150);
		 frame.setResizable(false);
		 frame.setLocationRelativeTo(null);
		 frame.setVisible(true);
		 
		 b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.dispose();
			}
		});
	}
}
