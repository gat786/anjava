class add
{

int a,b;

add(int a, int b)
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
	int subtraction(int a , int b)
	{
		return a-b;
	}
}

public class constDemo
{
	public static void main(String args[])
	{
		add a=new add(10,12);
		System.out.println(a.addition());

		subtract b=new subtract(); 
		System.out.println(b.subtraction(12,10));
	}
}