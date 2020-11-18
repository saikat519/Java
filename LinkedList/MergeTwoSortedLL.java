package LinkedList;

import LinkedList.MyImplementationLinkedList.Node;

public class MergeTwoSortedLL {

	
		public static void main(String[] args) {
			MyImplementationLinkedList l1 = new MyImplementationLinkedList();
			MyImplementationLinkedList l2 = new MyImplementationLinkedList();
			
			l1.append(2);
			l1.append(4);
			l1.append(7);
			l1.append(8);
			
			l2.append(5);
			l2.append(6);			
			l2.append(9);
			
			Node newhead=merge(l1.head,l2.head);
			printbyhead(newhead);

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
		
		static Node merge(Node l1,Node l2) {
			if(l1==null) {
				return l2;
			}
			if(l2==null) {
				return l1;
			}
			if(l1.data>l2.data) {
				Node t = l1;
				l1=l2;
				l2=t;
			}
			Node res=l1;
			
			while(l1!=null && l2!=null) {
				Node temp=null;
				while(l1!=null && l1.data<=l2.data) {
					temp=l1;
					l1=l1.next;
				}
				temp.next=l2;
				Node swap =l1;
				l1=l2;
				l2=swap;
			}
			return res;
		}

}
// time complexity O(m+n)
// space complexity O(1)

