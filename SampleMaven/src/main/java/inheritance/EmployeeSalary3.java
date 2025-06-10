package inheritance;

public class EmployeeSalary3 extends EmployeeeSalary2
{	
	public void totalSalary()
	{
		double totalsalary = basicpay+hra-pf-deduction+bonus;
		System.out.println("Basic pay: "+basicpay);
		System.out.println("HRA (5%): "+hra);
		System.out.println("PF (20%): "+pf);
		System.out.println("Deduction: "+deduction);
		System.out.println("Bonus: "+bonus);
		System.out.println("Total Salary is: "+totalsalary);
	}
	public static void main(String args[]) 
	{
		EmployeeSalary3 obj = new EmployeeSalary3();
		obj.details();
		obj.calc();
		obj.totalSalary();
	}
}
