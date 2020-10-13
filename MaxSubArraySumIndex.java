
public class MaxSubArraySumIndex {

	public static void main(String[] args) {
		
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		
		System.out.println("max contiguous sum:"+kaden(a));
	}

	
	public static int kaden(int[] a) {
		int max_sum=0,curr_sum=0;
		int s=0;
		int ans[] = new int[2];
		for(int i=0;i<a.length;i++) {
			curr_sum+=a[i];
			if(curr_sum < 0) {
				curr_sum = 0;
				s=i+1;
			}
			if(curr_sum > max_sum) {
				max_sum=curr_sum;
				ans[0]=s;
				ans[1]=i;
			}
		} 
		
		System.out.print("Index: ");
		printIndex(ans);
		return max_sum;
	}
	static void printIndex(int[] ans) {
		for(int x:ans) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
