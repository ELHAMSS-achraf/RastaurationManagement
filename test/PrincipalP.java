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


class PrincipalP extends JPanel implements ActionListener {
	Panel p= new Panel() ; 
	Panel message = new Panel();
	JLabel b1Label = new JLabel();
	JLabel b2Label = new JLabel();
	JLabel b3Label = new JLabel();
	Panel b1Panel = new Panel();
	Panel b2Panel = new Panel();
	Panel b3Panel = new Panel();
	String ChoicePrin ="";
	private static final String IMG_PATH1 ="src/images/uthappizza.png" ;
	private static final String IMG_PATH2 = "src/images/vadonut.png" ;
	private static final String IMG_PATH3 ="src/images/zucchipakoda.png";
	JButton b1 ;
	JButton b2 ;
	JButton b3 ;
	JLabel Open = new JLabel("OPENINGS");
	JLabel l = new JLabel();
	int c =1 ; 
	int clickb1=0 ; 
	int clickb2=1 ;
	int clickb3=2 ;
	public String getChoicePrin() {
		return ChoicePrin ; 
	}
	public PrincipalP(String[] NamePrin) {
		b1Label.setText(NamePrin[0]);
		b2Label.setText(NamePrin[1]);
		b3Label.setText(NamePrin[2]);
		this.setPreferredSize(new Dimension(700,170));
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
		
		b1Panel.setPreferredSize(new Dimension(200,200));
		b2Panel.setPreferredSize(new Dimension(200,200));
		b3Panel.setPreferredSize(new Dimension(200,200));
		b1Label.setPreferredSize(new Dimension(50,20));
		b2Label.setPreferredSize(new Dimension(50,20));
		b3Label.setPreferredSize(new Dimension(50,20));
		message.add(l);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b1Panel.add(b1Label);
		b1Panel.add(b1);
		b2Panel.add(b2Label);
		b2Panel.add(b2);
		b3Panel.add(b3Label);
		b3Panel.add(b3);
		p.add(b1Panel);
		p.add(b2Panel);
		p.add(b3Panel);
		p.add(message);
		this.add(p);
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == b1) {
			clickb1++ ;
			
			if(c ==1 && b1.getBackground()== Color.white) {
				 b1.setBackground(Color.red);
				 c-- ;
				 ChoicePrin +="0";
			}
			else{
				l.setText("you can't select two items please select just one");
			}
			if( clickb1 != 0 && clickb1%2 == 0 && b1.getBackground()== Color.red) {
				b1.setBackground(Color.white);
				c++ ; 
				ChoicePrin ="";
			}
		 
		 }
		if(arg0.getSource() == b2){
			clickb2++ ; 
			if(c ==1 && b2.getBackground()== Color.white) {
				 b2.setBackground(Color.red);
				 c-- ;	 
				 ChoicePrin +="1";
			}
			else {
				l.setText("you can't select two items please select just one");
			}
			if(clickb2 != 1 && clickb2%2 == 0 && b2.getBackground()== Color.red) {
				b2.setBackground(Color.white);
				c++ ; 
				ChoicePrin ="";
				
			}
		
		}
		if(arg0.getSource() == b3){
			clickb3++ ; 
			if(c ==1 && b3.getBackground()== Color.white) {
				 b3.setBackground(Color.red);
				 c-- ; 
				 ChoicePrin +="2";
			}
			else{
				l.setText("you can't select two items please select just one");
			}
			if(clickb3 !=2 && clickb3%2 ==0 && b3.getBackground()== Color.red ) {
				b3.setBackground(Color.white);
				c++ ; 
				ChoicePrin ="";
				 
			}
		
		}
		
	}
}
