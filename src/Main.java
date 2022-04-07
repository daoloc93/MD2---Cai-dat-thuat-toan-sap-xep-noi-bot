public class Main {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(list);
        for (int element : list) {
            System.out.println(element);
        }
    }
}
