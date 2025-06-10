package inheritance;
import java.util.Scanner;

public class EmployeeeSalary1 
{
	double basicpay;
	double deduction;
	double bonus;
	
	public void details()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basicpay: ");
		basicpay=sc.nextDouble();
		System.out.println("Enter deduction: ");
		deduction=sc.nextDouble();
		System.out.println("Enter bonus: ");
		bonus=sc.nextDouble();
	}
}
