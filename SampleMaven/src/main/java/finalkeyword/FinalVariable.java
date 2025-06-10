package finalkeyword;

public class FinalVariable 
{
	final int a = 20;
	
	public void print()
	{
		//a = 30;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		FinalVariable obj = new FinalVariable();
		obj.print();
	}
}
