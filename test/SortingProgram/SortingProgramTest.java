package SortingProgram;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortingProgramTest {
    SortingProgramMenu sp = new SortingProgramMenu();
    BubbleSort bs = new BubbleSort();
    MergeSort ms = new MergeSort();

    @Test
    public void testSortNumbersInAscendingOrderByBubbleSort() {
        int[] expected = {1, 2, 4, 3, 5};
        int[] actual = {1, 2, 3, 4, 5};

        bs.sortNumbers(expected);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortNumbersInDescendingOrderByBubbleSort() {
        int[] expected = {1, 2, 4, 3, 5};
        int[] actual = {5, 4, 3, 2, 1};

        bs.sortNumbers(expected);
        sp.descendNumbers(expected);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortNumbersInAscendingOrderByMergeSort() {
        int[] expected = {1, 2, 4, 3, 5};
        int[] actual = {1, 2, 3, 4, 5};

        ms.sortNumbers(expected);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortNumbersInDescendingOrderByMergeSort() {
        int[] expected = {1, 2, 4, 3, 5};
        int[] actual = {5, 4, 3, 2, 1};

        ms.sortNumbers(expected);
        sp.descendNumbers(expected);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortWordsInAscendingOrderByBubbleSort() {
        String[] expected = {"cat", "bird", "dog", "lion", "tiger"};
        String[] actual = {"bird", "cat", "dog","lion", "tiger"};

        bs.sortWords(expected);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortWordsInDescendingOrderByBubbleSort() {
        String[] expected = {"cat", "bird", "dog", "lion", "tiger"};
        String[] actual = {"tiger", "lion", "dog", "cat", "bird"};

        bs.sortWords(expected);
        sp.descendWords(expected);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortWordsInAscendingOrderByMergeSort() {
        String[] expected = {"cat", "bird", "dog", "lion", "tiger"};
        String[] actual = {"bird", "cat", "dog","lion", "tiger"};

        ms.sortWords(expected);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortWordsInDescendingOrderByMergeSort() {
        String[] expected = {"cat", "bird", "dog", "lion", "tiger"};
        String[] actual = {"tiger", "lion", "dog", "cat", "bird"};

        ms.sortWords(expected);
        sp.descendWords(expected);
        assertArrayEquals(expected, actual);
    }
}