package aggregation;

public class AggregationChild
{
	String name; //= "Suhail";
	int rollnumber; //= 3;
	AggregationParent address;
	
	public AggregationChild(String name, int rollnumber,AggregationParent address)
	{
		this.name= name;
		this.rollnumber= rollnumber;
		this.address= address;
	}
	
	public void display()
	{
		System.out.println(name + rollnumber);
		System.out.println(address.state+address.city);
	}
	public static void main(String[] args) 
	{
		AggregationParent obj1 = new AggregationParent("Kochi ","Kerala ");
		AggregationChild obj = new AggregationChild("Suhail ", 3, obj1);
		obj.display();
	}
}
