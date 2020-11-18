package LinkedList;

public class DoublyLLMain {

	public static void main(String[] args) {
//		DoublyLinkedList<String> obj = new DoublyLinkedList<>();
		
//		obj.addFirst("apple");
//		obj.addLast("orange");
//		obj.addFirst("pinaple");
		DoublyLinkedList<Integer> obj = new DoublyLinkedList<>();
		
		
		
		obj.addFirst(11);
		obj.addLast(12);
		obj.addLast(22);
		obj.addLast(32);
		obj.addFirst(1);
		obj.addLast(32);
		obj.addLast(42);
		obj.addLast(52);
		obj.addLast(62);
		
		obj.printHeadToTail(); // last to first
		//Bcz head is the last ele of the list and tail is the first ele
		obj.printTailToHead(); //first to last
		
		
		System.out.println(obj.peekFirst());
		System.out.println(obj.peekLast());
		
		System.out.println("delete from first");
		
		obj.printTailToHead();
		System.out.println(obj.delFirst());
		System.out.println(obj.delFirst());
		System.out.println(obj.delFirst());
		obj.printTailToHead();
		
		System.out.println("delete from Last");
		
		obj.printTailToHead();
		System.out.println(obj.delLast());
		System.out.println(obj.delLast());
		
		obj.printTailToHead();
		
	}

}
