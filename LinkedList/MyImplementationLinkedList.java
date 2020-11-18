package LinkedList;

public class MyImplementationLinkedList {
	
	static class Node
	{
		int data;
		Node next;
		Node(){
			
		}
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	
	Node head;
	
	// appending method 
	void append(int data) {
		
		Node newNode = new Node(data);
		Node temp = head;
		if(head==null) {
		head = newNode;
		return;
		}
		else {			
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next = newNode;
			
		}
	}
	// printing method
	void print() {
		Node temp = head;
		while(temp != null)	// if i write while(temp.next != null)
		{					// then the last element will not be printed Dry run It
			System.out.print(temp.data+" ");
			temp=temp.next;		
		}
	}
	
	// inserting at First
	void insertFirst(int data) {
		
		Node newNode =  new Node(data);
		newNode.next = head;
		head=newNode;
		
	}
	
	//insert At middle
	int add(int pos,int data)
	{
		Node temp = head;
		
		
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
			return 0;
		}
		
		int i=0;
		while(temp != null) 
		{
			if(i == pos-1 ) 
			{
				Node prev=temp;
				Node agla=temp.next;
				newNode.next = agla;
				prev.next=newNode;
			
				return 0;
			}
		
			temp=temp.next;
			
			i++;
		}
		return -1;
	}
	
	// Delete the last node
	
	void delAtLast()
	{
		Node temp = head;
		Node prev = temp;
		
		if(head.next==null) {
			head=null;
			return;
		}
		
		while(temp.next != null) 
		{
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
	}
	
	// Delete at middle
	void remove(int pos) 
	{
		int i=0;
		Node temp=head;
		Node prev=temp;
		
		if(pos==0) {
			head=head.next;
			return;
		}
		
		while(temp != null)
		{
			if( i == pos )
			{
				prev.next=temp.next;
			}
			i++;
			prev=temp;
			temp=temp.next;
		}
	}
	
	// Reverse the LinkedList
	
	void reverse()
	{
		if(head==null || head.next==null)
			return;
		Node current=head;
		Node prev=null;
		Node next=null;
		
		while(current != null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		
		head=prev;
		
		
	}
	
	
	 
	 void printbyhead(Node temphead) {
		 if(temphead == null) {
			 return;
		 }
		 Node temp=temphead;
		 while(temp !=null) {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
		 }
	 }
	
	
	
	
	
}
