package Oops;

public class Recursionfact {
	public static void main(String args[]) {
		System.out.println(fact(5));
		System.out.println(print1ton(5));
	}
	public static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	public static int print1ton(int n) {
		if(n==5)
			return 1;
		return;
	}
}
