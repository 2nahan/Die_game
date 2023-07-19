//Ahmet Tunahan Ozkan
//this program play the die game
import java.util.Scanner;

public class PlayDie {

	public static void main(String[] args) {
		DiePlayer players[] = new DiePlayer[2]; // for 2 players
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Welcome to the Die Game");
		System.out.println("Please Select the Strategy You Want to Play:");
		System.out.println("1. Hold at 20 or Goal");
		System.out.println("2. Hold at 25 or Goal");
		System.out.println("3. Keep Pace and End Race");
		System.out.println("4. My Die Player ( Hold at 15 or Goal )");
		System.out.println("5. TEST for Statistics.txt");
		String strategy = scan.nextLine();
		
		
		switch (strategy) {
		
		case "1": 
			System.out.println("You are the First Player...");
			players[0] = new UserDiePlayer();
			players[1] = new HoldAt20DiePlayer();
			DieGame begin = new DieGame(players);
			int winner = begin.play();
			
			if(winner == 0)
			{
				System.out.println("--------------------------");
				System.out.println("Congratulations. You Won..");
			}
			else
			{
				System.out.println("--------------");
				System.out.println("Computer Won..");
			}
			
			break;
			
		case "2": 
			System.out.println("You are the First Player...");
			players[0] = new UserDiePlayer();
			players[1] = new HoldAt25DiePlayer();
			DieGame begin2 = new DieGame(players);
			int winner2 = begin2.play();
			
			if(winner2 == 0)
			{
				System.out.println("--------------------------");
				System.out.println("Congratulations. You Won..");
			}
			else
			{
				System.out.println("--------------");
				System.out.println("Computer Won..");
			}
			
			break;
		
		case "3": 
			System.out.println("You are the First Player...");
			players[0] = new UserDiePlayer();
			players[1] = new RaceToGoalDiePlayer();
			DieGame begin3 = new DieGame(players);
			int winner3 = begin3.play();
			
			if(winner3 == 0)
			{
				System.out.println("--------------------------");
				System.out.println("Congratulations. You Won..");
			}
			else
			{
				System.out.println("--------------");
				System.out.println("Computer Won..");
			}
			break;
			
		case "4": 
			System.out.println("You are the First Player...");
			players[0] = new UserDiePlayer();
			players[1] = new MyDiePlayer();
			DieGame begin4 = new DieGame(players);
			int winner4 = begin4.play();
			
			if(winner4 == 0)
			{
				System.out.println("--------------------------");
				System.out.println("Congratulations. You Won..");
			}
			else
			{
				System.out.println("--------------");
				System.out.println("Computer Won..");
			}
			break;
		
		case "5":
			
			int x=0,y=0;
			for(int count=0;count<1000;count++) 
			{
				players[0] = new MyDiePlayer();
				players[1] = new HoldAt25DiePlayer();
				
				DieGame begin5 = new DieGame(players);
				int test = begin5.play();
				if(test == 0)
				{
					x++;
				}
				else if(test == 1)
				{
					y++;
				}
			}
				System.out.println("Hold at 15 or Goal ( My Die Player ) Won "+x+" Times");
				System.out.println("Hold at 25 or Goal Won "+y+ " Times");
	
				break;
		}
	scan.close();
	}

}
