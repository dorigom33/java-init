package p09;

public class SortTest2 {

	public static void main(String[] args) {
		int[] nums = new int[] {10,18,35,17,4};
		for(int j=0; j<5; j++) {
			for(int i=j+1; i<5;i++) {
				if(nums[j]>nums[i]) {
					int tmp = nums[j];
					nums[j] = nums[i];
					nums[i] = tmp;
				}
				
			}
			
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		

	}

}
