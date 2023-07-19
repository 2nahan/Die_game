//Ahmet Tunahan Ozkan
//this program play the die game

import java.util.Scanner;

	public class UserDiePlayer implements DiePlayer{
	
	public UserDiePlayer() {
	    System.out.println("Enter nothing to roll; enter anything to hold. ");
	}
	
	public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls)
	{
		
		Scanner input = new Scanner(System.in);	 
		System.out.println("Roll (Enter) / Hold (h) ");
	    String holdOrRoll = input.nextLine();
	    boolean x;
	    //
	    if(holdOrRoll.length() > 0 )
	    {
	    	x=false;	    		    		    	
	    }
	    else
	    {	
	    	x = true;		    	
	    }
	    
	    return x;
	}

}
