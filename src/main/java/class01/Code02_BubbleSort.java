package class01;

/**
 * @author wangchen
 * @version 1.0
 */
public class Code02_BubbleSort {

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        // 外层循环控制趟数
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环进行相邻元素的比较和交换
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // 交换数组中两个位置的值
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        // 测试用例
        int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        System.out.println("Before sorting:");
        System.out.println(java.util.Arrays.toString(arr));
        bubbleSort( arr);
        System.out.println("After sorting:");
        System.out.println(java.util.Arrays.toString(arr));
    }
}
