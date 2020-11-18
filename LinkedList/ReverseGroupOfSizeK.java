package LinkedList;
import LinkedList.MyImplementationLinkedList.Node;

public class ReverseGroupOfSizeK {

	public static void main(String[] args) {

		MyImplementationLinkedList ll = new MyImplementationLinkedList();
		ll.append(10);
		ll.append(20);
		ll.append(30);
		ll.append(15);
		ll.append(17);
		ll.append(18);
		ll.append(40);
		System.out.println("before");
		ll.printbyhead(ll.head);
		int k = 3;
		Node newHead = reverseKGroup(ll.head,k);
		System.out.println("\nafter");
		printbyhead(newHead);
	}
	static void printbyhead(Node temphead) {
		 if(temphead == null) {
			 return;
		 }
		 Node temp=temphead;
		 while(temp !=null) {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
		 }
	 }
	public static Node reverseKGroup(Node head, int k) {
        
        if(head==null || k==1){
            return head;
        }
        
        int cnt=0;
        Node temp=head;
        // count the length of linkedlist
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        
        Node dummy = new Node(0);
        dummy.next=head;
        
        Node prev = dummy;
        Node curr = dummy;
        Node agla = dummy;
        
        while(k <= cnt){
            curr=prev.next;
            agla=curr.next;
            for(int i=1;i<k;i++){
                curr.next=agla.next;
                agla.next=prev.next;
                prev.next=agla;
                agla=curr.next;
            }
            prev=curr;	// important for 2nd and 3rd and after groups
            cnt -= k;
        }
        return dummy.next;
        
    }

}
