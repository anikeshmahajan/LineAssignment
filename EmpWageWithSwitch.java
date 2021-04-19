
public class EmpWageWithSwitch {
	public static void main(String[] args) {
		
		int empDailywage=0;
		int emphr=8;
		int hrrate=20;
		int salary=0;
		int partsalary=0;
		
		for(int i =0;i<20;i++)
		{
			int outcome = (int)Math.floor(Math.random() *10) %3;
			switch (outcome) {
			case 1:
				System.out.println("Present");
		    	
		    	empDailywage= emphr*hrrate;
		    	salary =empDailywage+salary;
				break;
			case 0:
				System.out.println("Absent");
		    	
		    	empDailywage = emphr*0;
		    	break;
			default:
				System.out.println("Parttime Employe ");
		    	
		    	empDailywage= emphr*hrrate;
		    	partsalary =empDailywage+partsalary;
				break;
			}
	    
	    
}
		
		
	    System.out.println("Monthly salary  of FullTime employe   :" + salary);
	    System.out.println("Monthly salary  of PartTime employe   :" + partsalary);
		
		
	}
}
