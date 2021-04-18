import java.util.Scanner;

public class LineLength {
	

public static void main(String[] args) {
	
	System.out.println("Enter the value for x1");
	int x1 =userInput();

	 System.out.println("Enter the value for x2");
	  int x2 =userInput();

	 System.out.println("Enter the value for y1");
	 int y1 =userInput();
	
	 System.out.println("Enter the value for y2");
	 int y2 =userInput();

	 
	 System.out.println(cal(x1,x2,y1,y2));
	
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

	



