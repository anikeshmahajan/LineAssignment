
public class EmpPartTimeWage {
public static void main(String[] args) {
	
	int empDailywage=0;
	int emphr=8;
	int hrrate=20;
	int salary=0;
	for(int i =0;i<20;i++)
	{
    if(  Math.floor(Math.random() *10) %2 == 1.0 )
      {
    	System.out.println("Present");
    	
    	empDailywage= emphr*hrrate;
    	salary =empDailywage+salary;
    	
      }
    else
    {
    	System.out.println("Absent");
    	
    	empDailywage = emphr*0;
    }
	}
    System.out.println("Monthly salary    :" + salary);
    
	
	
}
}
