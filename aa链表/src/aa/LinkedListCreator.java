package aa;

import java.util.Arrays;
import java.util.List;

public class LinkedListCreator {

	public Node createLinkedList(List<Integer> data) {
		if(data.isEmpty()) {
			return null;
		}
		
		Node firstNode = new Node(data.get(0));
		
		Node headOfSublist = createLinkedList(data.subList(1, data.size()));
		
		firstNode.setNext(headOfSublist);
		return firstNode;
		
	}
	public static  void main(String[] args) {
		LinkedListCreator c= new LinkedListCreator() ;
		
		Node.printLinkedList(c.createLinkedList(Arrays.asList(1,2,3,4,5)));
		
	}
}
