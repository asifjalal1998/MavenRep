package finalkeyword;

public class FinalMethod 
{
	 public void name()
	{
		String name = "Suhail";
		int age = 26;
		System.out.println(name+age);
	}
	
	//public void name()
	//{
	 //System.out.println("Error");
	//}
	
	public static void main(String[] args) 
	{
		FinalMethod obj = new FinalMethod();
		obj.name();
	}

}
