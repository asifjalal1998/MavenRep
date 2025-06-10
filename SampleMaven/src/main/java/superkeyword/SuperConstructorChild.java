package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent
{
	public SuperConstructorChild()
	{
		super();
		String color = "Red";
		System.out.println("Color of car is :"+color);
	}
	public static void main(String[] args) 
	{
		SuperConstructorChild obj = new SuperConstructorChild();
		//obj.SuperConstructorChild();
	}

}
