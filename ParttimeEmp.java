
public class ParttimeEmp {

	public static void main(String[] args) {
		
		int empDailywage=0;
		int emphr=8;
		int hrrate=20;
		int salary=0;
		int partsalary=0;
		
		for(int i =0;i<20;i++)
		{
			double outcome =Math.floor(Math.random() *10) %3  ;
	    if( outcome== 1.0 )
	      {
	    	System.out.println("Present");
	    	
	    	empDailywage= emphr*hrrate;
	    	salary =empDailywage+salary;
	    	
	      }
	    else if(outcome == 0.0)
	    {
	    	System.out.println("Absent");
	    	
	    	empDailywage = emphr*0;
	    }
	    else {
	    		System.out.println("Parttime Employe ");
	    	
	    	empDailywage= emphr*hrrate;
	    	partsalary =empDailywage+partsalary;
		}
		}
		
	    System.out.println("Monthly salary  of FullTime employe   :" + salary);
	    System.out.println("Monthly salary  of PartTime employe   :" + partsalary);
		
		
	}
}
