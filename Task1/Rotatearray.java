//right rotatation of an array by k elements
package Task1;
import java.util.*;
public class Rotatearray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		k=k%n;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	public static void reverse(int arr[],int l,int r) {
		while(l<r) {
			int temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}	
	}
}
