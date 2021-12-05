package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;



class Mafenetre extends JFrame implements ActionListener  {
	String Title ; 
	String Choice ="" ; 
	Panel p= new Panel() ; 
	Panel selectP = new Panel() ;
	Panel PrincipalP= new Panel() ;
	Panel SelectedP= new Panel() ;
	Panel OpEnP = new Panel();
	Panel DesertP = new Panel();
	OpenP Op  ;
	DesertP Des ;
	PrincipalP Prin ;
	JLabel select = new JLabel("SELECT ONE ITEM IN EACH CATEGORY");
	JLabel Principal = new JLabel("REPAS PRINCIPAL");
	JLabel Open = new JLabel("OPENINGS");
	JLabel Selected = new JLabel("");
	JLabel Desert = new JLabel("Deserts");
	JButton Validate = new JButton("Validate you choice");
	String [] Items = {"Tea","Coffee"};
	String[] Items2 = {"Cheese","Butter"};
	String[] ItemsLunch = {"Salad 1","Salad 2"};
	String[] Items3 = {"Soda","Fruits"};
	String[][] Day = new String[3][3];
	int i  ; 
	
	public Mafenetre(int i , String[][] Day) {
		this.Day = Day ; 
		this.i = i ; 
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		switch(i) {
		   case 0:
			   Op = new OpenP(Items);
			   Des = new DesertP(Items2);
			   Prin = new PrincipalP(Day[0]); 
			   Title = "Breakfest";
			break;
		   case 1:
			   Op = new OpenP(ItemsLunch);
			   Des = new DesertP();
			   Prin = new PrincipalP(Day[1]);
			   Title = "Lunch";
			   break;
		   case 2 :
			   Op = new OpenP("null");
			   Open.setText("");
			   Des = new DesertP();
			   Prin = new PrincipalP(Day[2]);
			   Title = "Dinner";
			   break;
		   default : 
			   Title="unrocgnized meal";
		}
		
		this.setTitle(Title);
		this.setSize(700,850);
		this.setLocationRelativeTo(null);
		selectP.setPreferredSize(new Dimension(700,30));
		SelectedP.setPreferredSize(new Dimension(700,20));
		PrincipalP.setPreferredSize(new Dimension(700,20));
		OpEnP.setPreferredSize(new Dimension(700,20));
		DesertP.setPreferredSize(new Dimension(700,20));
		selectP.add(select);
		SelectedP.add(Selected);
		PrincipalP.add(Principal);
		OpEnP.add(Open);
		DesertP.add(Desert);
		Validate.addActionListener(this);
		p.add(selectP) ;
		p.add(OpEnP);
		p.add(Op);
		p.add(PrincipalP);
		p.add(Prin);
		p.add(DesertP);
		p.add(Des);
		p.add(Validate);
		p.add(SelectedP);
		this.setContentPane(p);
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		String ChoiceOp , ChoicePrin , ChoiceDes ; 
		String[] Choices = new String[3];
		int[] ChoicesInt = new int[3];
		boolean sel = false ; 
		int indexChoiceOp;int indexChoiceDes;int indexChoicePrin;
		if(i==1 || i ==0) {
		       if(!Op.getChoiceOp().isEmpty() && 
		       !Des.getChoiceDes().isEmpty() && !Prin.getChoicePrin().isEmpty() ){
		    	 indexChoiceOp = Integer.parseInt(Op.getChoiceOp());
		 		 ChoicesInt[0]=indexChoiceOp;
		 		 indexChoiceDes = Integer.parseInt(Des.getChoiceDes());
		 		 indexChoicePrin = Integer.parseInt(Prin.getChoicePrin());
		 		 ChoicesInt[1]=indexChoicePrin;ChoicesInt[2]=indexChoiceDes;
		 		switch(i) {
		 		  case 0 : 
		 			  ChoiceOp=Items[indexChoiceOp];
		 			  ChoicePrin=Day[i][indexChoicePrin];
		 			  ChoiceDes=Items2[indexChoiceDes];
		 			  Choices[0]=ChoiceOp;Choices[1]=ChoicePrin;Choices[2]=ChoiceDes;
		 			  break;
		 		  case 1 : 
		 			  ChoiceOp=ItemsLunch[indexChoiceOp];
		 			  ChoicePrin=Day[i][indexChoicePrin];
		 			  ChoiceDes=Items3[indexChoiceDes];
		 			  Choices[0]=ChoiceOp;Choices[1]=ChoicePrin;Choices[2]=ChoiceDes;
		 			  break;
		 		  case 2 : 
		 			  ChoiceOp="";
		 			  ChoicePrin=Day[i][indexChoicePrin];
		 			  ChoiceDes=Items3[indexChoiceDes];
		 			  Choices[0]=ChoiceOp;Choices[1]=ChoicePrin;Choices[2]=ChoiceDes;
		 			  break;
		 		  default :
		 			  System.out.println("No such choice");
		 		}
		 		ChoiceWindow w = new ChoiceWindow(Choices , ChoicesInt);
		 		this.setVisible(false);
		
		 } 
		  else {
	    Selected.setText("PlEASE SELECT ITEMS" );
	    }    
	}
		if(i==2) {
			 if(!Des.getChoiceDes().isEmpty() && !Prin.getChoicePrin().isEmpty() ) {
	    	  indexChoiceDes = Integer.parseInt(Des.getChoiceDes());
	 		  indexChoicePrin = Integer.parseInt(Prin.getChoicePrin());
	 		 ChoicesInt[1]=indexChoicePrin;ChoicesInt[2]=indexChoiceDes;
	 		switch(i) {
	 		  case 0 : 
	 			  ChoicePrin=Day[i][indexChoicePrin];
	 			  ChoiceDes=Items2[indexChoiceDes];
	 			 Choices[1]=ChoicePrin;Choices[2]=ChoiceDes;
	 			  break;
	 		  case 1 : 
	 			  
	 			  ChoicePrin=Day[i][indexChoicePrin];
	 			  ChoiceDes=Items3[indexChoiceDes];
	 			  Choices[1]=ChoicePrin;Choices[2]=ChoiceDes;
	 			  break;
	 		  case 2 : 
	 			  ChoiceOp="";
	 			  ChoicePrin=Day[i][indexChoicePrin];
	 			  ChoiceDes=Items3[indexChoiceDes];
	 			  Choices[0]=ChoiceOp;Choices[1]=ChoicePrin;Choices[2]=ChoiceDes;
	 			  break;
	 		  default :
	 			  System.out.println("No such choice");
	 		}
	 		ChoiceWindow w = new ChoiceWindow(Choices , ChoicesInt);
	 		this.setVisible(false);
	 		}
			 else {
				 Selected.setText("PlEASE SELECT ITEMS" );
			 }
			  
	}
		
		
			 
		
		 
		
		
	}
	
}
		

	

public class text {
	
	public static void main(String[] args) {
		String[][] Lundi = {{"Bread" , "Croissant" ,"Harcha"},{"Tajine","Fish","Pastilla"},{"Pizza","Harira","Rise"}};
		Mafenetre f = new Mafenetre(2 ,Lundi);
		
		
		
		
		 
		
		
			
	}
}

	


