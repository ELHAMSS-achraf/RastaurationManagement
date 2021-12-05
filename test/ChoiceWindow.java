package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.* ;
public class ChoiceWindow extends JFrame  {
	Panel p= new Panel() ; 
	Panel message = new Panel();
	JLabel b1Label = new JLabel();
	JLabel b2Label = new JLabel();
	JLabel b3Label = new JLabel();
	Panel b1Panel = new Panel();
	Panel b2Panel = new Panel();
	Panel b3Panel = new Panel();
    JLabel Choice = new JLabel("This is your choice");
    JButton b1 ;
	JButton b2 ;
	JButton b3 ;
    String[] Images = {"src/images/uthappizza.png","src/images/vadonut.png","src/images/zucchipakoda.png"};
     
	public ChoiceWindow(String[] A , int[] B) {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		b1Label.setText(A[0]);
		b2Label.setText(A[1]);
		b3Label.setText(A[2]);
		try {
			if(A[0]!= "") {
	         BufferedImage img = ImageIO.read(new File(Images[B[0]]));
	         ImageIcon icon = new ImageIcon(img);
	         b1 = new JButton(icon);
	         }
	         BufferedImage img2 = ImageIO.read(new File(Images[B[1]]));
	         BufferedImage img3 = ImageIO.read(new File(Images[B[2]]));
	         ImageIcon icon3 = new ImageIcon(img3);
	         b3 = new JButton(icon3);
	         ImageIcon icon2 = new ImageIcon(img2);
	         b2 = new JButton(icon2);
	         
	      } catch (IOException e) {
	         e.printStackTrace();
	     }
		this.setTitle("Choices");
		this.setSize(700,300);
		this.setLocationRelativeTo(null);
		b1Panel.setPreferredSize(new Dimension(200,200));
		b2Panel.setPreferredSize(new Dimension(200,200));
		b3Panel.setPreferredSize(new Dimension(200,200));
		b1Label.setPreferredSize(new Dimension(50,20));
		b2Label.setPreferredSize(new Dimension(50,20));
		b3Label.setPreferredSize(new Dimension(50,20));
		message.setPreferredSize(new Dimension(700,40));
		
		message.add(Choice);
		b3.setBackground(Color.white);
		b2.setBackground(Color.white);
		if(A[0] != "") {
		b1.setBackground(Color.white);
		b1Panel.add(b1Label);
		b1Panel.add(b1);
		}
		b2Panel.add(b2Label);
		b2Panel.add(b2);
		b3Panel.add(b3Label);
		b3Panel.add(b3);
		p.add(message);
		if(A[0]!="") {
		p.add(b1Panel);
		}
		p.add(b2Panel);
		p.add(b3Panel);
		
		this.add(p);
		this.setVisible(true);
	}
	

}
