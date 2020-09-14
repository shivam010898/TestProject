package programme;
@FunctionalInterface
interface Figure
{
	public void shape();
	default void display()// default methods can be added to functional interfaces
	{
		System.out.println("This is default");
	}
}
// Functional Interface with arguments
interface Calc
{
	public int add(int a,int b);
}

public class Anonymous_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Fly f= new Fly()
		{
		public void fly()
		{
		System.out.println("Hey There Arnab is Flying");
		}
		};*/

		/*Figure fi=new Figure()
		{
		public void shape()
		{
		System.out.println("Rectangle");
		}
		};
		f.fly();
		fi.shape();*/
		
Figure f1=()->{System.out.println("Inside Lamda Expression : Rectangle");};
f1.shape();
f1.display();
Calc c1=(a,b)->{return a+b;};
System.out.println(c1.add(4,5));

	}

}
