class abc
{
int add(int a , int b)
{
return a+b;
}
int add(int a , int b , int c)
{
return a+b+c;
}
}

class xyz extends abc
{
int add(int a ,int b)
{
return a*b;
}
}

public class Addition{
public static void main(String args[]){
abc a=new abc();
System.out.println(a.add(10,12));
System.out.println(a.add(10,12,14));
abc b=new xyz();
System.out.println(b.add(10,12));
}
}