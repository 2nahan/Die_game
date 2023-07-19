
//Ahmet Tunahan Ozkan
//this program play the die game

public class DieGame {

	public static final int GOAL_SCORE = 100; //max score
	private DiePlayer[] players;
	private int[] scores;
	
	
	public DieGame(DiePlayer[] players) {
		this.players = players;
	    this.scores = new int[players.length];
	}
	
	int playTurn(DiePlayer p, int playerNum)
	{
		players[playerNum] = p;		
		Die d = new Die();	
		int roll = 0;
		int turnScore = 0;
		int rolls = 0;
		
		//play 1 turn	
		while(players[playerNum].isRolling(scores[playerNum], turnScore, getMaxScore(), rolls) && roll != 1) 
		{
			 roll = d.nextRoll();
			 System.out.println("Roll: "+roll );
			 turnScore += roll;
			 
			 if(roll == 1)
			 {
				 System.out.println("Turn Total: "+ 0 );
			 }
			 else
			 {
				 System.out.println("Turn Total: "+turnScore );
			 }
			 	 
		}
		
		if(roll == 1)
		{
			return 0;
		}
		else
		{
			return turnScore;
		}
		
	}
	

	public int play()
	{
		int x=0;		
		
		while(getMaxScore() < GOAL_SCORE)
		{
			printScores();
			scores[0] += playTurn(players[0], 0);
			scores[1] += playTurn(players[1], 1);
		}
		
		if(scores[0] > GOAL_SCORE)
		{
			x = 0;
		}
		else if(scores[1] > GOAL_SCORE)
		{
			x = 1;
		}
		
		return x;
	}
	
	void printScores()
	{
		for(int i=0;i<scores.length;i++)
		{
			System.out.println((i+1) +". Player's Score: "+scores[i]);
		}
		
	}
	
	int getMaxScore()
	{
		int temp = scores[0];
		for(int i=0;i<players.length;i++)
		{
			if(scores[i] > temp)
			{
				temp = scores[i];
			}
		}
		return temp;
	}
		
	
}
