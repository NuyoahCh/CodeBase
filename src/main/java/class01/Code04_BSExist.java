package class01;

import java.util.Arrays;

/**
 * @author wangchen
 * @version 1.0
 */
public class Code04_BSExist {

    // 二分查找法判断一个数是否存在于有序数组中
    // 时间复杂度 O(logN)
    // 空间复杂度 O(1)
    // 注意：此方法要求输入的数组必须是有序的
    public static boolean exist(int[] sortedArr, int num) {
        if (sortedArr == null || sortedArr.length == 0) {
            return false;
        }
        int L = 0;
        int R = sortedArr.length - 1;
        int mid = 0;
        // L .. R
        while (L < R) {
            mid = L + ((R - L) >> 1); // 等价于 L + (R - L) / 2
            if (sortedArr[mid] == num) {
                return true;
            } else if (sortedArr[mid] > num) {
                R = mid - 1; // 注意这里是 mid - 1
            } else {
                L = mid + 1; // 注意这里是 mid + 1
            }
        }
        return sortedArr[L] == num; // 最后检查 L 位置
    }

    // for test
    public static boolean test(int[] sortedArr, int num) {
        for(int cur : sortedArr) {
            if(cur == num) {
                return true;
            }
        }
        return false;
    }


    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 10;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateRandomArray(maxSize, maxValue);
            Arrays.sort(arr);
            int value = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
            if (test(arr, value) != exist(arr, value)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }

}
