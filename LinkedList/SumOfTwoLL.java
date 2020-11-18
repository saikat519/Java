package LinkedList;
import LinkedList.MyImplementationLinkedList.Node;
public class SumOfTwoLL {
	
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
	
	public static Node addTwoNumbers(Node l1,Node l2) {
        Node dummy = new Node();
        Node temp =dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node node = new Node(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;
    }

	public static void main(String[] args) {
		MyImplementationLinkedList l1 = new MyImplementationLinkedList();
		MyImplementationLinkedList l2 = new MyImplementationLinkedList();
		
		l1.append(2);
		l1.append(4);
		l1.append(3);
		
		l2.append(5);
		l2.append(6);			// 243+564=807 so by reverse 807--->708
		l2.append(4);
		
		
		
		
		Node newhead=addTwoNumbers(l1.head,l2.head);
		printbyhead(newhead);

	}

}
