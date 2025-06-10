package encapsulation;

public class EncapsulationParent 
{
	private String name;
	private int age;
	
	public void set(String n, int a)
	{
		this.name= n;
		this.age= a;
	}
	public void get()
	{
		System.out.println(name + age);
	}
}
