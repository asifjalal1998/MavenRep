package superkeyword;

public class Addition2 extends Addition
{
	public Addition2 (int a,int b)
	{
		super(a, b);
		System.out.println("Sum of result is: "+super.sum);
		
		if (super.sum%10==0)
		{
			System.out.println("Addition is divisible by 10");
		}
		else
		{
			System.out.println("Addition is not divisible by 10");
		}
	}
	public static void main(String[] args) 
	{
		Addition2 obj = new Addition2(10,10);
	}

}
