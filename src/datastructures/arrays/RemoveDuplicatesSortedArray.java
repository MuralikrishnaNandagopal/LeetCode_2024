package datastructures.arrays;

public class RemoveDuplicatesSortedArray {

    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

    public static void main (String args[]) {
        int[] myArray = {0,0,1,1,1,2,2,3,3,4};
        int output = removeDuplicates(myArray);
        System.out.println("Count of Unique Elements : " + output);
    }


    public static int removeDuplicates(int[] nums) {
        int left = 1;

        for(int right=1; right<nums.length; right++) {
            if(nums[right] != nums[right-1]) {
                nums[left] = nums[right];
                left++;
            }
        }

        return left;
    }

    //Create 2 pointers
    // One pointer is iterate the array
    // Second one is to hold the position of Unique elements

}
