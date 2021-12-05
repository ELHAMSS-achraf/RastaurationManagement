package test;

import java.awt.*;
import javax.swing.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class OpenP extends JPanel implements ActionListener {
	Panel p= new Panel() ; 
	Panel message = new Panel();
	JLabel b1Label = new JLabel() ;
	JLabel b2Label = new JLabel() ;
	Panel b1Panel = new Panel();
	Panel b2Panel = new Panel();
	String ChoiceOp = "";
	private static final String IMG_PATH1 ="src/images/uthappizza.png" ;
	private static final String IMG_PATH2 = "src/images/vadonut.png" ;
	JButton b1 ;
	JButton b2 ;
	JLabel Open = new JLabel("OPENINGS");
	JLabel l = new JLabel();
	int c =1 ; 
	int clickb1=0 ; 
	int clickb2=1 ;
	public String getChoiceOp() {
		return ChoiceOp;
	}
	public OpenP(String s) {
		
	}
	public OpenP() {
		b1Label.setText("Soda");
		b2Label.setText("Fruits");
		this.setPreferredSize(new Dimension(700,170));
		try {
	         BufferedImage img = ImageIO.read(new File(IMG_PATH1));
	         BufferedImage img2 = ImageIO.read(new File(IMG_PATH2));
	         
	         ImageIcon icon = new ImageIcon(img);
	         ImageIcon icon2 = new ImageIcon(img2);
	         
	         b1 = new JButton(icon);
	         
	         b2 = new JButton(icon2);
	         
	      } catch (IOException e) {
	         e.printStackTrace();
	     }
		b1Panel.setPreferredSize(new Dimension(200,200));
		b2Panel.setPreferredSize(new Dimension(200,200));
		
		b1Label.setPreferredSize(new Dimension(50,20));
		b2Label.setPreferredSize(new Dimension(50,20));
		
		message.add(l);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		
		b1Panel.add(b1Label);
		b1Panel.add(b1);
		b2Panel.add(b2Label);
		b2Panel.add(b2);
		
		p.add(b1Panel);
		p.add(b2Panel);
		
		p.add(message);
		this.add(p);
		
	}
	public OpenP(String[] Items) {
		b1Label.setText(Items[0]);
		b2Label.setText(Items[1]);
		this.setPreferredSize(new Dimension(700,200));
		try {
	         BufferedImage img = ImageIO.read(new File(IMG_PATH1));
	         BufferedImage img2 = ImageIO.read(new File(IMG_PATH2));
	         
	         ImageIcon icon = new ImageIcon(img);
	         ImageIcon icon2 = new ImageIcon(img2);
	         
	         b1 = new JButton(icon);
	         
	         b2 = new JButton(icon2);
	         
	      } catch (IOException e) {
	         e.printStackTrace();
	     }
		b1Panel.setPreferredSize(new Dimension(200,200));
		b2Panel.setPreferredSize(new Dimension(200,200));
		
		b1Label.setPreferredSize(new Dimension(50,20));
		b2Label.setPreferredSize(new Dimension(50,20));
		
		message.add(l);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		
		b1Panel.add(b1Label);
		b1Panel.add(b1);
		b2Panel.add(b2Label);
		b2Panel.add(b2);
		
		p.add(b1Panel);
		p.add(b2Panel);
		
		p.add(message);
		this.add(p);
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == b1) {
			clickb1++ ;
			if(c ==1 && b1.getBackground()== Color.white) {
				 b1.setBackground(Color.red);
				 c-- ; 	
				 ChoiceOp +="0";
			}
			else{
				l.setText("you can't select two items please select just one");
			}
			if( clickb1 != 0 && clickb1%2 == 0 && b1.getBackground()== Color.red) {
				b1.setBackground(Color.white);
				c++ ; 
				ChoiceOp ="";
			}
		 
		 }
		if(arg0.getSource() == b2){
			clickb2++ ; 
			if(c ==1 && b2.getBackground()== Color.white) {
				 b2.setBackground(Color.red);
				 c-- ;
				 ChoiceOp +="1";
			}
			else {
				l.setText("you can't select two items please select just one");
			}
			if(clickb2 != 1 && clickb2%2 == 0 && b2.getBackground()== Color.red) {
				b2.setBackground(Color.white);
				c++ ; 
				ChoiceOp ="";
				
			}
		
		}
		

	}
}