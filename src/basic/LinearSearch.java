package basic;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,5,9,13,19,23};
		int target = 13;
        
		int result = linearSearch(nums, target);
		if(result != -1) {
			System.out.println("Target element found at index :: " + result);
		}else {
			System.out.println("Element does not found");
		}
	}
	
	public static int linearSearch(int[] nums, int target) {
		int steps = 0;
		for(int i = 0; i < nums.length; i++) {
			steps++;
			if(nums[i] == target) {
				System.out.println("Number of steps taken by linear search :: " + steps);
				return i;
			}
		}
		System.out.println("Number of steps taken by linear search :: " + steps);
		return -1;
	}

}
