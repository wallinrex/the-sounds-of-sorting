package edu.grinnell.csc207.soundsofsorting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

import edu.grinnell.csc207.soundsofsorting.sorts.Sorts;

public class SortsTests {
    /**
     * @param <T> the carrier type of the array
     * @param arr the array to check
     * @return true iff <code>arr</code> is sorted.
     */
    public static <T extends Comparable<? super T>> boolean sorted(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static Integer[] makeTestArray() {
        return new Integer[] {
            3, 7, 9, 1, 2,
            18, 16, 15, 19, 8,
            14, 12, 5, 13, 4,
            6, 0, 17, 11, 10
        };
    }

    public void testSort(Consumer<Integer[]> func) {
        Integer[] arr = makeTestArray();
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    public static Integer[] makeDuplicatesTestArray() {
        return new Integer[] {
            3, 7, 9, 1, 2,
            18, 16, 1, 19, 8,
            14, 12, 5, 13, 14,
            6, 0, 14, 11, 10
        };
    }

    public void testSortDuplicates(Consumer<Integer[]> func) {
        Integer[] arr = makeDuplicatesTestArray();
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    public static Integer[] makeOrderedTestArray() {
        return new Integer[] {
            -12, -9, -8, -8, -6,
            -3, 0, 1, 1, 2,
            4, 5, 12, 13, 14,
            16, 20, 24, 31, 40
        };
    }

    public void testSortInOrder(Consumer<Integer[]> func) {
        Integer[] arr = makeOrderedTestArray();
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    public static Integer[] makeReversedTestArray() {
        return new Integer[] {
            40, 31, 24, 20, 16,
            14, 13, 12, 5, 4,
            2, 1, 1, 0, -3,
            -6, -8, -8, -9, -12
        };
    }

    public void testSortReverseOrder(Consumer<Integer[]> func) {
        Integer[] arr = makeReversedTestArray();
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    @Test
    public void testBubbleSort() {
        testSort(Sorts::bubbleSort);
    }

    @Test
    public void testBubbleSortDuplicates() {
        testSortDuplicates(Sorts::bubbleSort);
    }

    @Test
    public void testBubbleSortInOrder() {
        testSortInOrder(Sorts::bubbleSort);
    }

    @Test
    public void testBubbleSortReverseOrder() {
        testSortReverseOrder(Sorts::bubbleSort);
    }
    
    @Test
    public void testInsertionSort() {
        testSort(Sorts::insertionSort);
    }

    @Test
    public void testInsertionSortDuplicates() {
        testSortDuplicates(Sorts::insertionSort);
    }

    @Test
    public void testInsertionSortInOrder() {
        testSortInOrder(Sorts::insertionSort);
    }

    @Test
    public void testInsertionSortReverseOrder() {
        testSortReverseOrder(Sorts::insertionSort);
    }
    
    @Test
    public void testSelectionSort() {
        testSort(Sorts::selectionSort);
    }

    @Test
    public void testSelectionSortDuplicates() {
        testSortDuplicates(Sorts::selectionSort);
    }

    @Test
    public void testSelectionSortInOrder() {
        testSortInOrder(Sorts::selectionSort);
    }

    @Test
    public void testSelectionSortReverseOrder() {
        testSortReverseOrder(Sorts::selectionSort);
    }

    @Test
    public void testMergeSort() {
        testSort(Sorts::mergeSort);
    }

    @Test
    public void testMergeSortDuplicates() {
        testSortDuplicates(Sorts::mergeSort);
    }

    @Test
    public void testMergeSortInOrder() {
        testSortInOrder(Sorts::mergeSort);
    }

    @Test
    public void testMergeSortReverseOrder() {
        testSortReverseOrder(Sorts::mergeSort);
    }
    
    @Test
    public void testQuickSort() {
        testSort(Sorts::quickSort);
    }

    @Test
    public void testQuickSortDuplicates() {
        testSortDuplicates(Sorts::quickSort);
    }

    @Test
    public void testQuickSortInOrder() {
        testSortInOrder(Sorts::quickSort);
    }

    @Test
    public void testQuickSortReverseOrder() {
        testSortReverseOrder(Sorts::quickSort);
    }

    @Test
    public void testGnomeSort() {
        testSort(Sorts::gnomeSort);
    }

    @Test
    public void testGnomeSortDuplicates() {
        testSortDuplicates(Sorts::gnomeSort);
    }

    @Test
    public void testGnomeSortInOrder() {
        testSortInOrder(Sorts::gnomeSort);
    }

    @Test
    public void testGnomeSortReverseOrder() {
        testSortReverseOrder(Sorts::gnomeSort);
    }
}