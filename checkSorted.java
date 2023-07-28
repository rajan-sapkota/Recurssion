public class checkSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int[] arr2 = { 1, 3, 6, 7, 9, 4, 2 };
        System.out.println(Sorted(arr, 0));
    }

    static boolean Sorted(int[] array, int count) {
        if (count == array.length - 1) {
            return true;
        }

        return array[count] < array[count + 1] && Sorted(array, ++count);
    }
}
