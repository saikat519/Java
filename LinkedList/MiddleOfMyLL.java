package LinkedList;

import LinkedList.MyImplementationLinkedList.Node;

public class MiddleOfMyLL {

	public static void main(String[] args) {
		MyImplementationLinkedList ll = new MyImplementationLinkedList();
		ll.append(11); 
		ll.append(13);
		ll.append(15);
		ll.append(17);
		ll.append(20);
		ll.append(30);
		//ll.printbyhead(ll.head);
		Node mid=findMid(ll.head);
		System.out.println(mid.data);

	}
	
	static Node findMid(Node head) {
		 if( head==null || head.next==null){
	            return head;
	        }
	        Node fast = head;
	        Node slow = head;
	        while(fast != null && fast.next != null ){
	            fast = fast.next.next;
	            slow=slow.next;
	        }
	        return slow;
		
	}
	
	

}
