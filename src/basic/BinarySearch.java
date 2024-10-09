package basic;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,5,9,13,19,23};
		int target = 13;
        
		int result = binarySearch(nums, target);
		if(result != -1) {
			System.out.println("Target element found at index :: " + result);
		}else {
			System.out.println("Element does not found");
		}
		
	}
	
	public static int binarySearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int steps = 0;
		
		while(left <= right) {
			steps++;
			int mid = (left + right)/2;
			if(nums[mid] == target) {
				System.out.println("Number of steps taken by binary search :: " + steps);
				return mid;
			}else if(nums[mid] < target) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		System.out.println("Number of steps taken by binary search :: " + steps);
		return -1;
	}

}
