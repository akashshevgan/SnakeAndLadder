
	import java.util.Random;
    import java.util.Scanner;

	public class SnakeAndLadder 
	{	
		public static final int No_Play=1;
		public static final int Ladder=2;
		public static final int Snake=3;
		public static final int Position_check = 0;
		public static final int win_position = 100;
		public static void main(String[] args) 
		{
			System.out.println("Welcome to SnakeAndLadder program");
			int numDiceRolls = 0;
			int position=0;
			System.out.println("Player is at position : "+position);
			
			System.out.println("Start position of player : "+position);
			
			while (position < win_position){

			Random random = new Random();
		    int diceroll = 0;
			while (true)
			{
	    		diceroll = random.nextInt(7);
	    		if(diceroll !=0) break;
			}
			System.out.println(diceroll);
			
			System.out.println("Number of dice : "+diceroll);

			while (position < win_position){

			Random ran = new Random();
			numDiceRolls++;
		    int option = 0;
			while (true)
			{
	    		option = ran.nextInt(4);
	    		if(option !=0) break;
			}
			System.out.println("OPTIONS\n Option 1 : No Play\nOption 2 : Ladder \nOption 3 : Snake \n");
			System.out.println("Option : "+option);

			switch (option) {
				case No_Play:
					System.out.println("Player stays in the same position : "+position);
					break;

				case Ladder:
					
					position += diceroll;
					if ((position + diceroll) > win_position){
						position = win_position;
					} else{
						position += diceroll;	
					}
					System.out.println("Player moves ahead by : "+position);
					break;

				case Snake:
					
					position -= diceroll;
	                if ((position - diceroll) < Position_check){
	                	position = Position_check;
	                }
					System.out.println("Player moves behind by : "+position);
					break;				

				default: 
					System.out.println("Enter correct value");
                    break;
			}
		

		}
			System.out.println("Number Of Times The Dice Was Played To Win The Game Is : " +numDiceRolls);
			} 
			
			
	}
	}
