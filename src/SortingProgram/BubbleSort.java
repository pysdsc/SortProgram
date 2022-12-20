package SortingProgram;

public class BubbleSort {

    public static void sortNumbers(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j < arr.length - i - 1 ; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void sortWords(String arr[]) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
