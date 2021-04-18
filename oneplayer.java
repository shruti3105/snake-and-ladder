import java.util.Random;

public class oneplayer {
public static void main(String args[]){

		int position=0,count=0;
		while(position < 100) {
			count = count + 1;

		int dice;
		Random random = new Random();
		dice = random.nextInt(6) + 1;

		int option;
		String move = new String();
		option = random.nextInt(3) + 1;
		switch(option) {
			case 1:
    position = position;
		move="no play";
				break;
			case 2:
				position = position + dice;
				move="ladder";
				break;
			case 3:
				position = position - dice;
				move="snake";
				break;
    			}
			
	
	if(position > 100) {
			    position = position - dice;
			}
			else if (position == 100){
				position = position;
			}
			else if(position<0){
				position = 0;
			}
			System.out.println("You got "+dice+" and "+move);
			System.out.println("Your position is "+position);
			}
			System.out.println("***WIN***");
		System.out.println("Total number of rolls: " + count);
	}
}


