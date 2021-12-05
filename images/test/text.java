package test;

import java.awt.*;
import javax.swing.* ;



class Mafenetre extends JFrame  {
	Panel p= new Panel() ; 
	String[] paths = {"src/images/uthappizza.png","src/images/vadonut.png","src/images/zucchipakoda.png"} ;
	Panel selectP = new Panel() ;
	Panel PrincipalP= new Panel() ;
	Panel OpEnP = new Panel();
	OpenP Op  = new OpenP(paths);
	OpenP Prin = new OpenP(paths);
	JLabel select = new JLabel("SELECT ONE ITEM IN EACH CATEGORY");
	JLabel Principal = new JLabel("REPAS PRINCIPAL");
	JLabel Open = new JLabel("OPENINGS");
	
	public Mafenetre() {
		this.setTitle("Meal");
		this.setSize(700,700);
		this.setLocationRelativeTo(null);
		selectP.setPreferredSize(new Dimension(700,50));
		PrincipalP.setPreferredSize(new Dimension(700,50));
		OpEnP.setPreferredSize(new Dimension(700,50));
		selectP.add(select);
		PrincipalP.add(Principal);
		OpEnP.add(Open);
		p.add(selectP) ;
		p.add(PrincipalP);
		p.add(Prin);
		p.add(OpEnP);
		p.add(Op);
		this.setContentPane(p);
		this.setVisible(true);	
	}
	
}
		

	

public class text {
	
	public static void main(String[] args) {
		Mafenetre f = new Mafenetre();
		
		
		 
		
		
			
	}
}

	


