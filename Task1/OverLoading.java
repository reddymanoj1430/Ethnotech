package Oops;
class Load{
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public float add(float a,float b) {
		return a-b;
	}
	public String add(String a,String b) {
		return a+b;
	}
}
public class OverLoading {
	public static void main(String args[])
	{
		Load l1=new Load();
		System.out.println(l1.add(1, 2));
		System.out.println(l1.add(2.00, 7.99));
		System.out.println(l1.add(2, 1));
		System.out.println(l1.add("Man","oj"));
	}
}
