package Oops;

public class Bank {
	int amount;
	int balance;
	public Bank(int v1,int v2)
	{
		this.amount=v1;
		this.balance=v2;
	}
	public void deposit(int amount) {
		System.out.println("the amount "+amount+" deposited");
		balance=balance+amount;
		System.out.println("the bank balance is " +balance);
	}
	public void withdrawl(int amount){
		if(amount<=balance)
		{
			System.out.println("the amount "+amount+" withdrawed");
			balance=balance-amount;
			System.out.println("the remaining balance is "+balance);
		}
		else
		{
			System.out.println("the amount is greater than balance");
		}
	}
	public void balancecheck(int balance)
	{
		System.out.println("the balance available is"+balance);
	}

}
