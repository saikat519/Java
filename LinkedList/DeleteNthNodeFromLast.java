package LinkedList;

import LinkedList.MyImplementationLinkedList.Node;

public class DeleteNthNodeFromLast {

	public static void main(String[] args) {
		MyImplementationLinkedList ll = new MyImplementationLinkedList();
		ll.append(11); 
		ll.append(13);
		ll.append(15);
		ll.append(17);
		ll.append(20);
		ll.append(30);
		
		Node newhead=delNfromLast(ll.head,3);
		ll.printbyhead(newhead);

	}
	
	static Node delNfromLast(Node head,int n) {
		Node dummy = new Node();
		dummy.next=head;
		Node slow = dummy;
		Node fast = dummy;
		for(int i=0;i<n;i++) {
			fast=fast.next;
		}
		while(fast.next!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		slow.next=slow.next.next;
		return dummy.next;
	}
}
