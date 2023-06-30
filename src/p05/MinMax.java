package p05;

public class MinMax {

	public static void main(String[] args) {
		int[] nums = new int[] {10,22,5,8,25};

		int max = nums[0];
		int min = nums[0];
		
		int cnt1 = 0;
		int cnt2 = 0;
		for(int i=1; i<nums.length; i++) {
			if(max<nums[i]) {
				max = nums[i];
				cnt1=i;
				
			}
			if(min>nums[i]) {
				min = nums[i];
				cnt2=i;
			}
		}
		
		System.out.println("최대값 : " + max + ", index : " + cnt1);
		System.out.println("최소값 : " + min + ", index : " + cnt2);
	}
}