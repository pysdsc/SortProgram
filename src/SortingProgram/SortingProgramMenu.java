package SortingProgram;

import java.util.Scanner;

public class SortingProgramMenu {

    private int SelectedMenu;
    private int SelectedSortAlgorithm;
    private int SelectedSortOrder;
    private int NumberOfNumbersToBeSort;
    private int[] NumbersToBeSorted;
    private int[] SortedNumbers;
    private int NumberOfWordsToBeSort;
    private String[] WordsToBeSorted;
    private String[] SortedWords;

    Scanner scanner = new Scanner(System.in);
   
    public void start() {
        while (true) {
            printStudentIDAndName();
            selectMenu();
            selectSortAlgorithm();
            selectSortOrder();
            if (SelectedMenu == 1) {
                enterNumberOfNumbersToBeSort();
                enterNumbersToBeSorted();
                sortNumbers();
            }
            if (SelectedMenu == 2) {
                enterNumberOfWordsToBeSort();
                enterWordsToBeSorted();
                sortWords();
            }
            sortInOrder();
            printResults();
        }
    }

    private void printStudentIDAndName() {
        System.out.println("[ ID: 2010888 ]");
        System.out.println("[ Name: 박영선 ]\n");
    }

    private void selectMenu() {
        System.out.print("1. Sort numbers\n" + "2. Sort Words\n" +"3. Quit\n" + "> ");
        SelectedMenu = scanner.nextInt();
        if (SelectedMenu == 3)
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
            BubbleSort.sortNumbers(NumbersToBeSorted);
        else
            MergeSort.sortNumbers(NumbersToBeSorted);
        SortedNumbers = NumbersToBeSorted;
    }

    private void enterNumberOfWordsToBeSort() {
        System.out.print("The number of words to be sorted\n" + "> ");
        NumberOfWordsToBeSort = scanner.nextInt();
        WordsToBeSorted = new String[NumberOfWordsToBeSort];
    }

    private void enterWordsToBeSorted() {
        System.out.print("The words to be sorted\n" + "> ");
        for (int i = 0; i < NumberOfWordsToBeSort ; i++) {
            WordsToBeSorted[i] = scanner.next();
        }
    }

    private void sortWords() {
        if (SelectedSortAlgorithm == 1)
            BubbleSort.sortWords(WordsToBeSorted);
        else
            MergeSort.sortWords(WordsToBeSorted);
        SortedWords = WordsToBeSorted;
    }

    private void sortInOrder() {
        if (SelectedSortOrder == 2)
            if (SelectedMenu == 1)
                descendNumbers(SortedNumbers);
            else
                descendWords(SortedWords);
    }

    protected void descendNumbers(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    protected void descendWords(String arr[]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private void printResults() {
        System.out.println("<Results>");
        if (SelectedMenu == 1) {
            for(int i : SortedNumbers)
                System.out.print(i + " ");
        }
        else {
            for (int i = 0; i < SortedWords.length; i++) {
                System.out.print(SortedWords[i] + " ");
            }
        }
        System.out.println("\n");
    }
}
