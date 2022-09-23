import java.util.*;

/* 



*/
class Main {
  public static void main(String[] args) {
		boolean playAgain = true;
		while(playAgain == true){
    	Scanner console = new Scanner(System.in);
			int totalSticks = intro(console);
			int playerMode = options(console);
			int playerTurn = 1;
			String tense = "are ";
			while(totalSticks > 0)	{
				if (totalSticks == 1)	{
					tense = "is ";
				}
				System.out.println("There " + tense + totalSticks + " sticks on the board.");
				if(playerTurn == 1)	{
					System.out.println("Player 1: How many sticks do you take (1-3)? ");
					playerTurn = playerTurn + 1;
				}
				else	{
					System.out.print("Player 2: How many sticks do you take (1-3)? ");
					playerTurn = playerTurn - 1;
				}
				int playerInput = input(console);
				totalSticks -= playerInput;
				System.out.println();
			}
			winner(playerTurn);
			System.out.println("Play again? (yes or no)");
			
			if(console.next().toLowerCase().equals("no"))	{
				playAgain = false;
			}
		}
  }

	static int intro(Scanner console)	{
		System.out.println("Welcome to the game of sticks!");
		System.out.print("How many sticks are there on the table initially (10-100) ");
		int numSticks = console.nextInt();
		System.out.println();
		while(numSticks < 10 || numSticks > 100){
			System.out.println("Please enter a number between 10 and 100");
			System.out.print("How many sticks are there on the table initially (10-100) ");
		numSticks = console.nextInt();
		System.out.println();
		} 
		System.out.println();
  	return numSticks;
	}

	static int input(Scanner console)	{
		int playerInput = console.nextInt();
		while(playerInput > 3 || playerInput < 1)	{
			System.out.println("Please enter a number between 1 and 3");
			playerInput = console.nextInt();
		}
		return playerInput;
	}

	static int winner(int playerTurn)	{
		if(playerTurn == 1)	{
			System.out.println("Player 2, you lose.");
			return 1;
		}

		else	{
			System.out.println("Player 1, you lose.");
			return 2;
		}
	}

	static int options(Scanner console)	{
		System.out.println("Options:");
		System.out.println(" Play against a friend (1)");
		System.out.println(" Play against the computer (2)");
		System.out.println("Which option do you take (1-2)? ");
		return console.nextInt();
	}
}