package class01;

/**
 * @author wangchen
 * @version 1.0
 */
public class Code03_InsertionSort {

    // 插入排序
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0～0 有序的
        // 0～i 想有序
        for (int i = 1; i < arr.length; i++) {
            // core 关注数据状况
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    // 交换方法
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        // 测试用例
        int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        System.out.println("Before sorting:");
        System.out.println(java.util.Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After sorting:");
        System.out.println(java.util.Arrays.toString(arr));
    }
}
