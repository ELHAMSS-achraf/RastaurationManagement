package test;
 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

public class OutOfTime extends JFrame {
        Panel p = new Panel();
		JLabel l = new JLabel() ;
	public OutOfTime(int i) {
		p.setPreferredSize(new Dimension(700,200));
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(700,400);
		this.setLocationRelativeTo(null);
		this.setTitle("Sorry");
		l.setText("No Meals Available . Please check our meals planing");
		p.add(l);
		this.setContentPane(p);
		this.setVisible(true);
		
	}

}
