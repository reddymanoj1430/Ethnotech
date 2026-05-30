package Oops;

public class Customer extends Bank{
	public Customer(int v1,int v2)
	{
		super(v1,v2);
	}
	public static void main(String args[])
	{
		Customer c1= new Customer(5000,10000);
		c1.balancecheck(10000);
		c1.deposit(2000);
		c1.withdrawl(2000);
	}
}
