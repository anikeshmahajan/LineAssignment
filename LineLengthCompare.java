import java.util.Scanner;
public class LineLengthCompare {
	

	
		

	public static void main(String[] args) {
		
		System.out.println("Enter the value for x1");
		int x1 =userInput();

		 System.out.println("Enter the value for x2");
		  int x2 =userInput();

		 System.out.println("Enter the value for y1");
		 int y1 =userInput();
		
		 System.out.println("Enter the value for y2");
		 int y2 =userInput();
		 
		 System.out.println("ENTER THE POINTS FOR THE LINE 2");
		 System.out.println("Enter the value for x1");
			int x11 =userInput();

			 System.out.println("Enter the value for x2");
			  int x22 =userInput();

			 System.out.println("Enter the value for y1");
			 int y11 =userInput();
			
			 System.out.println("Enter the value for y2");
			 int y22 =userInput();

		 
		 
		 double line1 = cal(x1,x2,y1,y2);
		  double line2 = cal (x11,x22,y11,y22);
		String length1= Double.toString(line1);
		String length2= Double.toString(line2);
		
		 
			if(length1.contentEquals(length2))
			{
				System.out.println("Both lines are equal");
			}
			else {
				System.out.println("Not Equal");
			}
		
		  
	}
	
	

	 static int userInput()
	 {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the value");
		  int val1= s.nextInt();
		 return val1;
	 }
	 
	 static  double cal( int x1, int x2, int y1, int y2)
	 {
		 
		
		 
		 return  Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
	 }

	}

		





