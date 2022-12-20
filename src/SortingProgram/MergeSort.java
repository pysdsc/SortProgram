package SortingProgram;

public class MergeSort {

    public static void sortNumbers(int arr[]) {
        int n = arr.length;
        if (n == 1) return;

        int[] arr_temp1 = new int[n/2];
        int[] arr_temp2 = new int[n - n/2];

        for(int i = 0; i < n/2; i++) {
            arr_temp1[i] = arr[i];
        }
        for(int i = 0; i < n - n/2; i++) {
            arr_temp2[i] = arr[i + n/2];
        }
        sortNumbers(arr_temp1);
        sortNumbers(arr_temp2);
        mergeNumbers(arr_temp1, arr_temp2, arr);
    }

    private static void mergeNumbers(int arrA[], int arrB[], int arrC[]) {
        int iA = 0;
        int iB = 0;
        int iC = 0;

        while (iA < arrA.length) {
            if (iB < arrB.length) {
                if (arrA[iA] < arrB[iB]) {
                    arrC[iC] = arrA[iA];
                    iA++;
                }
                else {
                    arrC[iC] = arrB[iB];
                    iB++;
                }
                iC++;
            }
            else {
                while (iA < arrA.length) {
                    arrC[iC] = arrA[iA];
                    iA++;
                    iC++;
                }
            }
        }
        while (iB < arrB.length) {
            arrC[iC] = arrB[iB];
            iB++;
            iC++;
        }
    }

    public static void sortWords(String arr[]) {
        int n = arr.length;
        if (n == 1) return;

        String[] arr_temp1 = new String[n/2];
        String[] arr_temp2 = new String[n - n/2];

        for(int i = 0; i < n/2; i++) {
            arr_temp1[i] = arr[i];
        }
        for(int i = 0; i < n - n/2; i++) {
            arr_temp2[i] = arr[i + n/2];
        }
        sortWords(arr_temp1);
        sortWords(arr_temp2);
        mergeWords(arr_temp1, arr_temp2, arr);
    }

    private static void mergeWords(String arrA[], String arrB[], String arrC[]) {
        int iA = 0;
        int iB = 0;
        int iC = 0;

        while (iA < arrA.length) {
            if (iB < arrB.length) {
                if (arrA[iA].compareTo(arrB[iB]) < 0) {
                    arrC[iC] = arrA[iA];
                    iA++;
                }
                else {
                    arrC[iC] = arrB[iB];
                    iB++;
                }
                iC++;
            }
            else {
                while (iA < arrA.length) {
                    arrC[iC] = arrA[iA];
                    iA++;
                    iC++;
                }
            }
        }
        while (iB < arrB.length) {
            arrC[iC] = arrB[iB];
            iB++;
            iC++;
        }
    }
}
