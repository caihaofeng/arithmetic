package aa;

public class Node {

	public final int value;
	public Node next;
	
	public Node(int value) {
		this.value=value;
		this. next =null;
	}
	public int value() {
		return value;
		
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next=next;
	}
	
	public static void printLinkedList(Node head) {
		while(head!=null) {
	System.out.print(head.value());
	System.out.print(" ");
	 head=head.getNext();
		}
	}
	
}
