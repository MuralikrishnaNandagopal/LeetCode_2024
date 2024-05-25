package datastructures.arrays;

public class MaxValue {

    public static void main(String[] args) {
                int[] arr = {1, 3, 2, 9, 18};
                System.out.println(maxRange(arr, 1, 4));
    }

    static int maxRange(int[] arr, int index1, int index2) {

        int maxValue = arr[index1];

        for (int i = index1; i <= index2 ; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
