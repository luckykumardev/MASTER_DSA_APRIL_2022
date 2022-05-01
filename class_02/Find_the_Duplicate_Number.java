package class_02;
/*
 https://leetcode.com/problems/find-the-duplicate-number/
*/
public class Find_the_Duplicate_Number {

	public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i =0; i<n; i++){
            int temp = Math.abs(nums[i]);
            if(nums[temp-1] > 0){
                nums[temp-1] = -1*nums[temp-1];
            }else{
              return temp; 
            }
        }
        return -1;
    }
	
	
/*	public static int findDuplicate(int[] A) {
		int xor = 0;

		for(int i =0; i<A.length; i++){
			xor ^= A[i];				
		}

		for (int i = 1; i <= A.length - 1; i++) {
			xor ^= i;
		}
		
		return xor;
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 3, 4 };
		System.out.println("The duplicate element is " + findDuplicate(A));
	}
*/	
}