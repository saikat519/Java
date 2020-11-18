package LinkedList;

public class DoublyLinkedList<E>{
	
	
	static class Node<E>{
		E data;
		Node<E> next,prev;
		public Node(E data) {
			this.data=data;
			this.next=null;
			this.prev=null;
			
		}
		
	}
	
	Node<E> head = null;
	Node<E> tail = null;
	
	void printHeadToTail() {
		if(tail==null) {
			System.out.println("Queue is Empty");;
		}
		
		Node<E> temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
		System.out.println();
	}
	
	void printTailToHead() {
		if(tail==null) {
			System.out.println("Queue is Empty");;
		}
		
		Node<E> temp = tail;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	void addLast(E data) {
		Node<E> newNode = new Node<>(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		head.next=newNode;
		newNode.prev=head;
		head=newNode;
		
	}
	
	void addFirst(E data) {
		Node<E> newNode = new Node<>(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		newNode.next=tail;
		tail.prev=newNode;
		tail=newNode;
	}
	
	E peekFirst() {
		return tail.data;
	}
	E peekLast() {
		return head.data;
	}
	
	E delFirst() {
		if(tail==null) {
			return null;
		}
		Node<E> temp = tail;
		if(tail==head) {
			tail=null;
			head=null;
			return temp.data;
		}
		tail=tail.next;
		tail.prev=null;
		return temp.data;
	}
	

	E delLast() {
		if(head==null) {
			return null;
		}
		Node<E> temp = head;
		if(tail==head) {
			tail=null;
			head=null;
			return temp.data;
		}
		head=head.prev;
		head.next=null;
		return temp.data;
	}

}
