public class B
{

	public A()
	{
		System.out.println("Non-parameterise Cons");
	}

	// bug fix=1
	public A(int a)
	{
		System.out.println("parameterise const");
	}
	

	// bug fix=2
	public A(int a,String s)
	{
		this.a=a;
		this.s=s;
	}
<<<<<<< Updated upstream


	// bug fix=3
	public A(float f)
	{
		System.out.println("Const");
	}
=======
>>>>>>> Stashed changes
}