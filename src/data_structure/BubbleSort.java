package data_structure;

import java.util.Arrays;

// 時間複雜度：O(N^2)
// 每一次左右比都將最大的值放到最右邊
// 效率較低下
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {89, 34, 23, 78, 67, 100, 66, 29, 79, 55, 78, 88, 92, 96, 96, 23};
        bubbleSort(nums);

        System.out.print(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums) {
        //先找到一個基準點
        for (int i = 0; i < nums.length-1; i++) {
            //基準點以後的不斷比大小，將最大值塞到最後一個
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }
}
