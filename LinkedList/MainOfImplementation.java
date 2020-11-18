package LinkedList;

import LinkedList.MyImplementationLinkedList.Node;

public class MainOfImplementation {

	public static void main(String[] args) {
		
		MyImplementationLinkedList ll = new MyImplementationLinkedList(); 
		
		ll.append(11); 
		ll.append(13);
		ll.append(15);
		ll.append(17);
	
		ll.insertFirst(20);
		ll.print();
//		System.out.println();
//		
//		int res=ll.add(0, 44);
//		if(res != -1)
//		{
//			ll.print();
//		}
//		else {
//			System.out.println("Position Out Of Range::");
//		}
//	
//		ll.add(0,11);
//		ll.add(1, 19);
//		ll.add(2, 12);
//		ll.add(3, 14);
//		
//		ll.print();
//		System.out.println();
//		
//		ll.delAtLast();
//		ll.remove(0);
//		ll.print();
//	
		
		ll.reverse();
		System.out.println();
		ll.print();
		
		System.out.println();
		
		
		System.out.println("print by head");
		
		ll.printbyhead(ll.head.next.next);
	}
	

}
