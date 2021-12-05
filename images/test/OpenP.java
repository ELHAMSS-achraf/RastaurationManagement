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
	private  String IMG_PATH1 ;
	private  String IMG_PATH2 ;
	private  String IMG_PATH3 ;
	JButton b1 ;
	JButton b2 ;
	JButton b3 ;
	JLabel l = new JLabel();
	int c =1 ; 
	int clickb1=0 ; 
	int clickb2=1 ;
	int clickb3=2 ;
	public OpenP(String[] paths) {
		this.setPreferredSize(new Dimension(700,200));
		this.IMG_PATH1 = paths[0];
		this.IMG_PATH2 = paths[1];
		this.IMG_PATH3 = paths[2];
		message.setPreferredSize(new Dimension(100,50));
		try {
	         BufferedImage img = ImageIO.read(new File(IMG_PATH1));
	         BufferedImage img2 = ImageIO.read(new File(IMG_PATH2));
	         BufferedImage img3 = ImageIO.read(new File(IMG_PATH3));
	         ImageIcon icon = new ImageIcon(img);
	         ImageIcon icon2 = new ImageIcon(img2);
	         ImageIcon icon3 = new ImageIcon(img3);
	         b1 = new JButton(icon);
	         b2 = new JButton(icon2);
	         b3 = new JButton(icon3);
	      } catch (IOException e) {
	         e.printStackTrace();
	     }
		message.add(l);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(message);
		this.add(p);
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == b1) {
			clickb1++ ;
			if(c ==1 && b1.getBackground()== Color.white) {
				 b1.setBackground(Color.red);
				 c-- ; 	
			}
			else{
				l.setText("you can't select two items please select just one");
			}
			if( clickb1 != 0 && clickb1%2 == 0 && b1.getBackground()== Color.red) {
				b1.setBackground(Color.white);
				c++ ; 
			}
		 
		 }
		if(arg0.getSource() == b2){
			clickb2++ ; 
			if(c ==1 && b2.getBackground()== Color.white) {
				 b2.setBackground(Color.red);
				 c-- ;	 
			}
			else {
				l.setText("you can't select two items please select just one");
			}
			if(clickb2 != 1 && clickb2%2 == 0 && b2.getBackground()== Color.red) {
				b2.setBackground(Color.white);
				c++ ; 
				
			}
		
		}
		if(arg0.getSource() == b3){
			clickb3++ ; 
			if(c ==1 && b3.getBackground()== Color.white) {
				 b3.setBackground(Color.red);
				 c-- ; 
			}
			else{
				l.setText("you can't select two items please select just one");
			}
			if(clickb3 !=2 && clickb3%2 ==0 && b3.getBackground()== Color.red ) {
				b3.setBackground(Color.white);
				c++ ; 
				 
			}
		
		}

	}
}
		

	



	


