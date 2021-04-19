
public class SnakeLadderExample {
 
	public static final int STARTPOSITION = 0;
	public static final int WIN = 100;
	
	public static void main(String[] args) {
		 int newPosition =0;
	
		while(true)
		{
			
		int dice=getDiceNmbr();
		if(dice == 6)
			{
				while(newPosition !=WIN)
				{
					 
					
			  int dice2 = getDiceNmbr();
				int opt=options();
				switch (opt) {
				case 1: {
					if(newPosition>100)
					{
						  
					}else
					{
					newPosition= dice2+newPosition;
					}
					break;
				}
				case 2: {
					newPosition= newPosition-dice2;
					if(newPosition <0)
					{
						newPosition =0;
					}
					break;
					
				}
				

				default:{
					newPosition= newPosition;
					
					break;
				}
				
				}
				
				System.out.println(newPosition);
			
				}
				
			
			}
		
		
		
		}
		
	}

	static int getDiceNmbr()
	{
		 int dicevalue =(int)(Math.floor(Math.random() * 10 % 6) + 1);
		return dicevalue;
	}
	static int options()
	{
		int option =(int)(Math.floor(Math.random() * 10 % 3) );
		
		return option;
	}
	
}

