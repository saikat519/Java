
public class KadensAlgorithm {

	public static void main(String[] args) {
		
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
			
		System.out.println("max contiguous sum:"+kaden(a));

	}
	
	public static int kaden(int[] a) {
		int max_sum=0,curr_sum=0;
		
		for(int i=0;i<a.length;i++) {
			curr_sum=Math.max(a[i],curr_sum+a[i]);
			max_sum=Math.max(curr_sum, max_sum);
			
		
		}
		
		return max_sum;
	}

}
