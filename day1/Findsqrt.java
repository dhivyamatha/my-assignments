package dailyjava;

public class Findsqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number : 4");
System.out.println(Math.sqrt(4));
System.out.println("Enter any number : 8");
System.out.println(Math.sqrt(8));
double a= Math.sqrt(8);
a=a*100;
a=Math.floor(a);
a=a/100;
System.out.println(a);
int b=(int) a;
b=b*100;
b=(int) Math.floor(b);
b=b/100;
System.out.println(b);
	}

}
