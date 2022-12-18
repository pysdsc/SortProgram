package SortingProgram;

import java.util.Scanner;

public class SortingProgramMenu {

    int SelectedMenu;
    int SelectedSortAlgorithm;
    int SelectedSortOrder;
    int NumberOfNumbersToBeSort;
    int[] NumbersToBeSorted;
    int[] SortedNumbers;

    Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            printStudentIDAndName();
            selectMenu();
            selectSortAlgorithm();
            selectSortOrder();
            enterNumberOfNumbersToBeSort();
            enterNumbersToBeSorted();
            sortNumbers();
            sortInOrder();
            printResults();
        }
    }

    private void printStudentIDAndName() {
        System.out.println("[ ID: 2010888 ]");
        System.out.println("[ Name: 박영선 ]\n");
    }

    private void selectMenu() {
        System.out.print("1. Sort numbers\n" + "2. Quit\n" + "> ");
        SelectedMenu = scanner.nextInt();
        if (SelectedMenu == 2)
            System.exit(0);
    }

    private void selectSortAlgorithm() {
        System.out.println("Select a sorting algorithm");
        System.out.println("1. Bubble sort");
        System.out.print("2. Merge sort\n" + "> ");
        SelectedSortAlgorithm = scanner.nextInt();
    }

    private void selectSortOrder() {
        System.out.println("Select a sort order");
        System.out.println("1. Ascending order");
        System.out.print("2. Descending order\n" + "> ");
        SelectedSortOrder = scanner.nextInt();
    }

    private void enterNumberOfNumbersToBeSort() {
        System.out.print("The number of numbers to be sorted\n" + "> ");
        NumberOfNumbersToBeSort = scanner.nextInt();
        NumbersToBeSorted = new int[NumberOfNumbersToBeSort];
    }

    private void enterNumbersToBeSorted() {
        System.out.print("The numbers to be sorted\n" + "> ");
        for (int i = 0 ; i < NumberOfNumbersToBeSort ; i++) {
            NumbersToBeSorted[i] = scanner.nextInt();
        }
    }

    private void sortNumbers() {
        if (SelectedSortAlgorithm == 1)
            BubbleSort.sort(NumbersToBeSorted);
        else
            MergeSort.sort(NumbersToBeSorted);
        SortedNumbers = NumbersToBeSorted;
    }

    private void sortInOrder() {
        if (SelectedSortOrder == 2)
            descend(SortedNumbers);
    }

    private void descend(int arr[]) {
        for(int i=0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private void printResults() {
        System.out.println("<Results>");
        for(int i : SortedNumbers) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
