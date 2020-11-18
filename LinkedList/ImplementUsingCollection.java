package LinkedList;
import java.util.*;
public class ImplementUsingCollection {

	public static void main(String[] args) {
		
		List<Integer> ll = new LinkedList<>();
		
		// now we can implement all methods 
		// Like get set add addAll remove etc
		
		ll.add(10);
		ll.add(12);
		ll.add(14);
		
		System.out.println(ll);
		
		ll.add(1, 11);
		System.out.println(ll);
		
		System.out.println("At index 2 val : "+ll.get(2));
		
		
	}

}
