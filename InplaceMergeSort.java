// import java.util.Arrays;

// public class InplaceMergeSort {
//     public static void main(String[] args) {
//         int[] arr = { 6, 5, 4, 3, 2, 1 };
//         divide(arr, 0, arr.length - 1);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void divide(int[] arr, int s, int e) {
//         if (s < e) {
//             int mid = s + (e - s) / 2;

//             divide(arr, s, mid);
//             divide(arr, mid + 1, e);
//             merge(arr, s, mid, e);

//         }
//     }

//     private static void merge(int[] arr, int s, int mid, int e) {
//         int i = s;
//         int j = mid + 1;
//         int k = 0; // Initialize a new variable to keep track of the index in the temporary array.
//         int[] array = new int[e - s + 1];

//         while (i <= mid && j <= e) {
//             if (arr[i] < arr[j]) {
//                 array[k++] = arr[i++];
//             } else {
//                 array[k++] = arr[j++];
//             }
//         }
//         while (i <= mid) {
//             array[k++] = arr[i++];
//         }
//         while (j <= e) {
//             array[k++] = arr[j++];
//         }

//         // Copy the elements from the temporary array back to the original array.
//         for (int l = 0; l < array.length; l++) {
//             arr[s + l] = array[l];
//         }
//     }

// }

import java.util.Arrays;

public class InplaceMergeSort {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 4, 5, 3 };
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void divide(int[] arr, int s, int e) {
        if (s < e) {
            int mid = s + (e - s) / 2;

            divide(arr, s, mid);
            divide(arr, mid + 1, e);
            merge(arr, s, mid, e);

        }
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int i = s;
        int j = mid + 1;
        int k = 0; // Initialize a new variable to keep track of the index in the temporary array.
        int[] array = new int[e - s + 1];

        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                array[k++] = arr[i++];
            } else {
                array[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            array[k++] = arr[i++];
        }
        while (j <= e) {
            array[k++] = arr[j++];
        }

        // Copy the elements from the temporary array back to the original array.
        for (int l = 0; l < array.length; l++) {
            arr[s + l] = array[l];
        }
    }

}