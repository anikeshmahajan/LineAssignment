
public class ConditionalWageCalculation {

public static void main(String[] args) {
	
	int empDailywage=0;
	int emphr=8;
	int hrrate=20;
	int salary=0;
	int hr=8;
	int i=0;
	
	while(i<20 && hr!=100)
	{
    if(  Math.floor(Math.random() *10) %2 == 1.0 )
      {
    	System.out.println("Present");
    	
    	empDailywage= emphr*hrrate;
    	salary =empDailywage+salary;
    	hr=hr+8;
      }
    else
    {
    	System.out.println("Absent");
    	
    	empDailywage = emphr*0;
    }
    
	 i=i+1;
	 
   
	}
    System.out.println( salary);
    
	
	
}


}
