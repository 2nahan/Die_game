//Ahmet Tunahan Ozkan
//this program play the die game

import java.util.Random;

public class Die {
	
	int nextRoll()
	{
		Random r = new Random();
		return r.nextInt(6)+1; // 1 to 6 random number
	}

}
