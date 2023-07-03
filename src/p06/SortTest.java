package p06;

public class SortTest {

	public static void main(String[] args) {
		int[] nums = new int[] {10,7,15,1,4};
		System.out.println("정렬 전!!");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + ",");
		}
		System.out.println();
		for(int i=0;i<nums.length;i++) {
			int min = nums[i];
			int idx = i;
			for(int j= i +1 ;j<nums.length;j++) {
				if(min > nums[j]) {
					min = nums[j];
					idx = j;
				}
			}
			int tmp = nums[i];
			nums[i] = nums[idx];
			nums[idx] = tmp;
		}
		System.out.println("정렬 후!!");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + ",");
		}
	}
}