package datastructures.arrays;

public class RemoveElements {

    // https://leetcode.com/problems/remove-element/description/

    public static void main(String args[]) {

        int[] input = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("Output : " + removeElement(input, val));


    }

    public static int removeElement(int[] nums, int val) {

        int left = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }

        return left;


    }


}