package practice;

public class A {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is  "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a is after swap "+a);
		System.out.println("The value of b is after swap "+b);
	}

}
