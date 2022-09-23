import java.util.*;


class AI{

	private int totalSticks;
	private int currentSticks;
	
	List<Integer> biasMemory = new ArrayList<Integer>();

	
	List<Integer> bias1 = new ArrayList<Integer>();
	List<Integer> bias2 = new ArrayList<Integer>();
	List<Integer> bias3 = new ArrayList<Integer>();


	public AI(int totalSticks){

		currentSticks = totalSticks;
		
		
	}

	//reset information for a new game
	public void reset()	{
		//reset current sticks
		//for loop to add neccisary amount of slots to the array lists
	}
	
	// choose the number of sticks to pull
	public int chooseAmount()	{
		//init a random object and new arraylist
		
		//use some for loops to add the right amount of weight to each option
		
		//pull a random number from the pool

		//update memory
		
		return 0;
	}

	public void updateBias(boolean win)	{
		//update the bias arraylists with a for loop and some if statements

		//reset the bias memory for next game
	}
	
}