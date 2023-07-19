//Ahmet Tunahan Ozkan
//this program play the die game

public class MyDiePlayer implements DiePlayer {

	public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls)
	{
		boolean x;
		if(turnTotal <= 15 && (myScore + turnTotal) <= 100 && turnTotal != 1)
		{	
			x = true;
		}
		else
		{
			x = false;
		}

		return x;
	}
}
