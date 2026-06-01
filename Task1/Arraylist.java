package Task1;
import java.util.*;
public class Arraylist {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList();
		System.out.println("Enter the number of songs to store");
		int n=sc.nextInt();
		System.out.println("Enter the songs: ");
		for(int i=0;i<n;i++) {
			arr.add(sc.nextLine());
		}
		arr.remove(2);
		if(arr.contains("no lie"))
		{
			System.out.println("found the song");
		}
		System.out.println("number of songs:"+arr.size());
		System.out.println("The songs in playlist:");
		arr.forEach(System.out::println);
		sc.close();
	}
}
