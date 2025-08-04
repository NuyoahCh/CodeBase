package class03;

/**
 * @author wangchen
 * @version 1.0
 */
public class Code04_RingArray {

    public static class MyQueue {
        private int[] arr;
        private int pushi;
        private int polli;
        private int size;
        private final int limit;

        public MyQueue(int limit) {
            this.limit = limit;
            arr = new int[limit];
            pushi = 0;
            polli = 0;
            size = 0;
        }

        public void push(int value) {
            if (size == limit) {
                throw new RuntimeException("Queue is full");
            }
            size++;
            arr[pushi] = value;
            pushi = nextIndex(pushi);
        }

        public int pop() {
            if (size == 0) {
                throw new RuntimeException("Queue is empty");
            }
            size--;
            int value = arr[polli];
            arr[polli] = 0; // 可选，清空位置
            polli = nextIndex(polli);
            return value;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        // 如果现在的下标是i，返回下一个位置
        private int nextIndex(int i) {
            return i < limit - 1 ? i + 1 : 0;
        }
    }
}
