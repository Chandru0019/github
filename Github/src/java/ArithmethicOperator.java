package java;

public class ArithmethicOperator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("----Arithmethic----");
		System.out.println("add"+(a+b));
		System.out.println("sub"+(a-b));
		System.out.println("mul"+(a*b));
		System.out.println("Div"+(a/b));
		System.out.println("mod"+(a%b));
		//relational operator
		System.out.println("----Relationall----");
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		//logical operator
		boolean x=true;
		boolean y=false;
		System.out.println("----logical----");
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		//increment/decrement
		a=10;
		a++;
		System.out.println("----i/d----");
		System.out.println(a);
		b=20;
		b--;
		System.out.println(b);
		
		//swap
		a=10;
		b=20;
		int c = a+b;
		System.out.println(c);
		
		
		
	}

}
