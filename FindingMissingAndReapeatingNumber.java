import java.util.*;
public class FindingMissingAndReapeatingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Range::");
		int n=sc.nextInt();
		
		int[] arr = new int[n+1];       //{2,2,3,1}
		int freq[] =new int[n+1];
		
		for(int i=1;i<=n;i++) {
			
			arr[i-1]=sc.nextInt();
		}
		
		
		for(int i=1;i<=n;i++) {
			
			freq[arr[i-1]]++;
		}
		
		for(int i=1;i<=n;i++) {
			if(freq[i]==0) {
				System.out.println("Missing:"+i);
				
			}
			else if(freq[i] >= 2) {
				System.out.println("Repeating:"+i);
			}
		}



	}

}
// O(3N) solution with space complexity O(N)