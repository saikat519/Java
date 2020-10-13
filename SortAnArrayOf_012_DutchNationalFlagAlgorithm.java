
public class SortAnArrayOf_012_DutchNationalFlagAlgorithm {

	public static void main(String[] args) {
		
		int a[]= {1,2,0,1,2,0,0,2,1};
		
		int high=a.length-1;
		int low=0,mid=0;
		int temp;
		
		while(high >= mid) {
			
		
			switch(a[mid]) {
			case 0: {
				temp=a[mid];
				a[mid] = a[low];
				a[low]=temp;
				low++;
				mid++;
				break;
			}
			
			case 1: {
				mid++;
				break;
			}
			
			case 2: {
				temp=a[mid];
				a[mid]=a[high];
				a[high]=temp;
				high--;
				break;
			}
		}
		}
		
		for(int x: a) {
			System.out.print(x+" ");
		}

	}

}

//Time Complexity O(N) and Space Complexity O(1) ...
// This algorithm is known as Dutch National Flag Algorithm
