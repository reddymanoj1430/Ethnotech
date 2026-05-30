package Task1;

import java.util.Scanner;

public class Weatherreport {
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int max=0,min=Integer.MAX_VALUE,sum=0,avg=0;
		 for(int i=0;i<n;i++) {
			  max=Math.max(max,arr[i]);
			  min=Math.min(min,arr[i]);
			  sum+=arr[i];
		 }
		 avg=sum/n;
		 System.out.println("the max temperature is"+max);
		 System.out.println("the min temperature is"+min);
		 System.out.println("the avg temperature is"+avg);
	}
}
