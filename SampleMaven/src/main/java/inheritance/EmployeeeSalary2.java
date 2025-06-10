package inheritance;

public class EmployeeeSalary2 extends EmployeeeSalary1
{
	double hra;
	double pf;
	
	public void calc()
	{
		hra = 0.05*basicpay;
		pf = 0.2*basicpay;
	}
}
