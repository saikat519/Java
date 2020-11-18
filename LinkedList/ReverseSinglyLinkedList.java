package LinkedList;

public class ReverseSinglyLinkedList {

	public static void main(String[] args) {
		MyImplementationLinkedList ll = new MyImplementationLinkedList();
		
		ll.append(12);
		ll.append(13);
		ll.append(15);
		ll.append(19);
	
		
		System.out.println("Before:");
		ll.print();
		
		System.out.println("\nAfter:");
		ll.reverse();
			
	}

}
