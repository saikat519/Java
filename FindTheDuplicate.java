import java.util.*;
public class FindTheDuplicate {

	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		int a[] = {3,1,3,4,2};
		
		for(int x:a) {
			if(s.add(x)==false) {
				System.out.println(x);
				break;
			}
		}
		
		System.out.println(s);

	}

}
