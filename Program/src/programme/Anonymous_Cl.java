package programme;
interface Person{
	public void eat(int a,int b);
}

public class Anonymous_Cl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person() {
		public void eat(int a,int b)
		{
			System.out.println("sum "+(a+b));
		}
		};
		p.eat(5,6);
		

	}

}
