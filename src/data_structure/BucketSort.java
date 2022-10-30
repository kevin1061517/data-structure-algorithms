package data_structure;

import java.util.Arrays;

// 數字有一定範圍的排序
// 時間複雜度：O(M+N)
// 資料很大會浪費空間
// 數字只能使用整數，小數無法產生相對應桶子
public class BucketSort {
    public static void main(String[] args) {
        int[] nums = {89, 34, 23, 78, 67, 100, 66, 29, 79, 55, 78, 88, 92, 96, 96, 23};
        bucketSort(nums);

        System.out.print(Arrays.toString(nums));
    }

    static void bucketSort(int[] nums) {
        // find the max value in array
        int maxScore = Arrays.stream(nums).max().getAsInt();
        // create new array with max value size
        int[] scoreBucket = new int[maxScore+1];

        for(int i:nums) {
            scoreBucket[i]++;
        }

        int index = 0;
        for(int i=0;i<scoreBucket.length;i++) {
            int size = scoreBucket[i];
            if(size != 0) { //不為0才表示有資料
                for(int j=0;j<size;j++) {
                    nums[index++] = i;
                }
            }
        }
    }
}
