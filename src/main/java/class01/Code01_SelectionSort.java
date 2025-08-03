package class01;

/**
 * @author wangchen
 * @version 1.0
 */
public class Code01_SelectionSort {

    // 选择排序
    public static void selectionSort(int[] arr) {
        // 时间复杂度一定要去考虑最差的情况的
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            // 找到最小值
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            // 将当前位置的值与最小值交换
            swap(arr, i, minIndex);
        }
    }

    // 交换数组中两个位置的值
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        // 测试选择排序
        int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        System.out.println("Before sorting:");
        System.out.println(java.util.Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sorting:");
        System.out.println(java.util.Arrays.toString(arr));
    }
}
