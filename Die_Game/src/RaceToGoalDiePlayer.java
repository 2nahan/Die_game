
public class RaceToGoalDiePlayer implements DiePlayer {

	public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls)
	{
		boolean x;
		
		if(turnTotal <= 21 + Math.round((maxScore - myScore) / 8) && (myScore + turnTotal) <= 100)
		{	
			x = true;
		}
		else if(myScore >= 71 && maxScore >=71 && myScore + turnTotal <= 100)
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
