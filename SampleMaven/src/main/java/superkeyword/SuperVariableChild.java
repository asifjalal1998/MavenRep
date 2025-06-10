package superkeyword;

public class SuperVariableChild extends SuperVariableParent
{
	int b = 10;
	String name = "Suhail";
	
	public void sum()
	{
	System.out.println(b+" "+name);
	System.out.println(super.a);
	}
	public static void main (String args[])
	{
		SuperVariableChild obj = new SuperVariableChild();
		obj.sum();
	}
}
