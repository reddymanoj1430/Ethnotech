package Task1;
import java.util.*;
public class Arraymutipleexceptself {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int pro=1;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					pro*=arr[j];
				}
			}
			System.out.println(pro);
		}
		sc.close(); 
	}
}