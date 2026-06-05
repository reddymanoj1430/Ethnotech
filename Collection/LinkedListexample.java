package Collection;
class Nodeexp{
	int data;
	Nodeexp next;
	Nodeexp(int data){
		this.data=data;
		this.next=null;
	}
}
public class LinkedListexample {
	public static void main(String args[]) {
		Nodeexp head=new Nodeexp(10);
		head.next=new Nodeexp(20);
		head.next.next=new Nodeexp(30);
		head=insertatbeginning(5,head);
		insertatend(40,head);
		traversal(head);
	}
	public static void traversal(Nodeexp head) {
		Nodeexp temp=head;
		int sum=0;
		while(temp!=null) {
			sum+=temp.data;
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("sum of nodes"+sum);
	}
	public static Nodeexp insertatbeginning(int data,Nodeexp head) {
		Nodeexp newNode=new Nodeexp(data);
		newNode.next=head;
		head=newNode;
		return newNode;
	}
	public static void insertatend(int data,Nodeexp head) {
		Nodeexp newnode=new Nodeexp(data);
		Nodeexp temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
	}
}
