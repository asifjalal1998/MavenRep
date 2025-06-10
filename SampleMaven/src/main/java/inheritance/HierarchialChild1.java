package inheritance;

public class HierarchialChild1 extends HierarchialParent1
{
	public static void main(String[] args) 
	{
		HierarchialChild1 obj = new HierarchialChild1();
		obj.Name();
		HierarchialParent2 obj1 = new HierarchialParent2();
		obj1.Name();
		obj1.age();
		HierarchialParent3 obj3 = new HierarchialParent3();
		obj3.Name();
		obj3.detail();
	}
}
