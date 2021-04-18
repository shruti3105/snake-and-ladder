import java.util.Random;

public class twoplayers {
public static void main(String args[]){

		int i=0,position1=0,position2=0,count1=0,count2=0;
		while(position1 < 100 && position2 <100)
		
		{
		    
		    
	if(i%2==0)
	
	{
		count1 = count1 + 1;

		int dice;
		Random random = new Random();
		dice = random.nextInt(6) + 1;

		int option;
		String move = new String();
		option = random.nextInt(3) + 1;
		switch(option) {
			case 1:
        position1 = position1;
		move="no play";
				break;
			case 2:
				position1 = position1 + dice;
				move="ladder";
				break;
			case 3:
				position1 = position1 - dice;
				move="snake";
				break;
    			}
			
	
	if(position1 > 100) {
			    position1 = position1 - dice;
			}
	else if (position1 == 100){
				position1 = position1;
			}
	else if(position1<0){
				position1 = 0;
			}
	System.out.println("Player1 got "+dice+" and "+move);
	System.out.println("Player1 position is "+position1);
			
	    
	    
	}
			
	else{
		count2 = count2 + 1;

		int dice;
		Random random = new Random();
		dice = random.nextInt(6) + 1;

		int option;
		String move = new String();
		option = random.nextInt(3) + 1;
		switch(option) {
			case 1:
    position2 = position2;
		move="no play";
				break;
			case 2:
				position2 = position2 + dice;
				move="ladder";
				break;
			case 3:
				position2 = position2 - dice;
				move="snake";
				break;
    			}


	if(position2 > 100) {
			    position2 = position2 - dice;
			}
			else if(position2 == 100){
				position2 = position2;
			}
			else if(position2<0){
				position2 = 0;
			}
			System.out.println("Player2 got "+dice+" and "+move);
			System.out.println("Player2 position is "+position2);
					
	    
	}
	
					i=i+1;
	}
			
			
						if (position1 == 100){
		    System.out.println("Player1 wins!");
		    System.out.println("Number of rolls: " + count1);
		}
		else if (position2 == 100){
		    System.out.println("Player2 wins!");
		    System.out.println("Number of rolls: " + count2);
		}

		
}
}




