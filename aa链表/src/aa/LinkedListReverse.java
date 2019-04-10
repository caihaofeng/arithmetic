package aa;

import java.util.Arrays;

public class LinkedListReverse {

	public Node reverseLinkedList(Node head) {
		
		if(head==null||head.getNext()==null) {
			return head;
		}
		Node newHead=reverseLinkedList(head.getNext());
		
		head.getNext().setNext(head);
		 head.setNext(null);
		 return newHead;
		
	}


	public static void main(String[] args) {
		
		LinkedListCreator c= new LinkedListCreator();
		LinkedListReverse r=new LinkedListReverse();
		
		Node.printLinkedList(r.reverseLinkedList(c.createLinkedList(Arrays.asList(1,2,5,7,8,9))));
	}
}
