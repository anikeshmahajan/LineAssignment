import java.util.Scanner;

public class LineLengthOops {

//	int x1,x2,y1,y2;
//	
//	public LineLengthOops() {
//		System.out.println("Enter the value for x1");
//		 x1 =userInput();
//
//		 System.out.println("Enter the value for x2");
//		   x2 =userInput();
//
//		 System.out.println("Enter the value for y1");
//		 y1 =userInput();
//		
//		 System.out.println("Enter the value for y2");
//		  y2 =userInput();
//	}
public static void main(String[] args) {
	
	

	 LineLengthOops l1= new LineLengthOops();
	 

//	 System.out.println(l1.cal(l1.x1,l1.x2,l1.y1,l1.y2));
	 System.out.println(l1.cal(1,2,3,4));
	
}

   int userInput()
 {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the value");
	  int val1= s.nextInt();
	 return val1;
 }
 
   double cal( int x1, int x2, int y1, int y2)
 {
	 
	
	 
	 return  Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
 }
}
