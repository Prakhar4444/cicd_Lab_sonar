public class test 
{
	private int n=10;
	public void f1(int n1)
	{
		n1=10;
	}
	public static void main(String[] args) 
	{
		int n2=20;
		System.out.println("Hello Sonar");
		test ob = new test();
		ob.f1(20);
		if(n2==10)
		{
			System.out.println("True part");
		}
		else
		{
			System.out.println("False part");
		}
	}
}
