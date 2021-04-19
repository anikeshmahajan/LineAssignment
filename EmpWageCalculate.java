
public class EmpWageCalculate {

	public static void main(String[] args) {
		
		int emprateperhour = 20;
		int emphr =0;
		int empwage =0;
		if(Math.floor(Math.random()*10)%2 == 1.0)
		{
			emphr =8;
			
			
		}
		else
		{
		emphr =0;
		}
		empwage = emphr * emprateperhour;
	
		System.out.println("The wage is : " + empwage);
	}
}
