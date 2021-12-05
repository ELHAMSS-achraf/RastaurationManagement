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

class DesertP extends OpenP {
	String ChoiceDes = "";
	public String getChoiceDes() {
		return ChoiceDes;
	}
	public DesertP() {
		super();
	}
	public DesertP(String[] Items) {
		super(Items);
	}
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == b1) {
			clickb1++ ;
			if(c ==1 && b1.getBackground()== Color.white) {
				 b1.setBackground(Color.red);
				 c-- ; 	
				 ChoiceDes +="0";
				 
			}
			else{
				l.setText("you can't select two items please select just one");
			}
			if( clickb1 != 0 && clickb1%2 == 0 && b1.getBackground()== Color.red) {
				b1.setBackground(Color.white);
				c++ ; 
				ChoiceDes ="";
			}
		 
		 }
		if(arg0.getSource() == b2){
			clickb2++ ; 
			if(c ==1 && b2.getBackground()== Color.white) {
				 b2.setBackground(Color.red);
				 c-- ;
				 ChoiceDes +="1";
			}
			else {
				l.setText("you can't select two items please select just one");
			}
			if(clickb2 != 1 && clickb2%2 == 0 && b2.getBackground()== Color.red) {
				b2.setBackground(Color.white);
				c++ ; 
				ChoiceDes ="";
				
			}
		
		}
		

	}
	
}