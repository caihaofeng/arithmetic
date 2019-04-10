package aa;

import java.util.Arrays;

public class LinkedListSum {

	public Node mergeTwoLists(Node l1,Node l2) {
		Node dummy = new Node(0);
        Node lastNode = dummy;
        
        
        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                lastNode.next = l1;
                l1 = l1.next;
            } else {
                lastNode.next = l2;
                l2 = l2.next;
            }
            lastNode = lastNode.next;
        }
        
        if (l1 != null) {
            lastNode.next = l1;
        } else {
            lastNode.next = l2;
        }
        
        return dummy.next;
        
	}
	public static void main(String[] args) {
		LinkedListCreator c= new LinkedListCreator();
		LinkedListSum r=new LinkedListSum();
		
		Node.printLinkedList(r.mergeTwoLists
				(c.createLinkedList(Arrays.asList(1,2,3)),
						c.createLinkedList(Arrays.asList(3,5,7,9))));
	}
	
}
