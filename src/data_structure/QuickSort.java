package data_structure;

import java.util.Arrays;

// Divide and Conquer方法
// Bubble Sort 的一種改進
//
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {89, 34, 23, 78, 67, 100, 66, 29, 79, 55, 78, 88, 92, 96, 96, 23};
        quickSort(nums);

        System.out.print(Arrays.toString(nums));
    }

    static void quickSort(int[] nums) {
        quickSortHelp(nums, 0, nums.length-1);
    }

    static void quickSortHelp(int[] nums, int i, int j) {
        if(i >= j) {
            return;
        }

        int left = i, right = j;
        int target = nums[left];
        while(i != j) {
            while(nums[j] > target && i < j) { //從最右邊開始找比基準點小的值
                j--;
            }
            while(nums[i] <= target && i < j) {
                i++;
            }
            if(i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }

        nums[left] = nums[i];
        nums[i] = target;

        quickSortHelp(nums, left, i-1);
        quickSortHelp(nums, i+1, right);
    }
}
