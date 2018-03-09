class divi{
int a,b;

	divi()					//default constructor
	{
		a=20;
		b=10;
	}
	int division()
	{
		return b/a;
	}
}


class add
{

	int a,b;  				//global variable

	add(int a, int b)			//parameterized constructor
	{
		this.a=a;
		this.b=b;
	}

	int addition()
	{
		return a+b;
	}

}
class subtract
{
	int subtraction(int a , int b)  			//local variable
	{
		return a-b;
	}
}

public class constDemo
{
	public static void main(String args[])
	{
		divi d=new divi();
		System.out.println(d.division());

		add a=new add(10,12);
		System.out.println(a.addition());

		subtract b=new subtract(); 
		System.out.println(b.subtraction(12,10));
	}
}