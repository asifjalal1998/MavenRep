package superkeyword;

public class SuperMethod2 extends SuperMethod
{
	public void detail()
	{
		String f = "I can fly";
		super.color();
		System.out.println("About parrot :"+f);
	}

	public static void main(String[] args) 
	{
		SuperMethod2 obj = new SuperMethod2();
		obj.detail();
	}
}
