package Practice;


public class Subarray_Find {
	

	public int subarraySum(int [] nums, int k) {
		
	int count = 0;
	int	sum = 0;
	for (int slow = 0; slow < nums.length; slow++) {
	sum = 0;
	
	for (int fast = slow; fast < nums. length; fast++) {
	sum += nums[fast];
	
			if (sum == k)
				count++; 
	
			if (sum > k) 
				 continue;
		}
	}
     return count;
	
	}

	public static void main(String[] args) {
		
		int nums[]= {1, 9, 10, 4, 2, 1 };
		int k=16;
	
	//	System.out.println(count);
	
	}

}
