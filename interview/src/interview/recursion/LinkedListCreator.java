package interview.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListCreator {	
	/**
	 * Creates a linked list.
	 * 
	 * @param data the data to create the list
	 * @return head of the linked list.The returned linked list
	 * ends with last node with getNext()==null  
	 */
	
	public Node createLinkedList(List<Integer> data) {
		if(data.isEmpty()) {
			return null;
		}
		
		Node firstNode = new Node(data.get(0));
		Node headOfSublist=
				createLinkedList(data.subList(1, data.size()));
		firstNode.setNext(headOfSublist);
		return firstNode;
	}
	
	
	public static void main(String[] args) {
		LinkedListCreator creator = new LinkedListCreator();
		
		Node.printLinkedList(
				creator.createLinkedList(new ArrayList<>()));
		Node.printLinkedList(
		creator.createLinkedList(Arrays.asList(1)));
		Node.printLinkedList(
		creator.createLinkedList(Arrays.asList(1,2,3,4,5,6,7,8)));
		// TODO Auto-generated method stub

	}

}
