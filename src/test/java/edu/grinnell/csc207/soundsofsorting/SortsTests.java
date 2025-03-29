package edu.grinnell.csc207.soundsofsorting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import org.junit.jupiter.api.Test;

import edu.grinnell.csc207.soundsofsorting.sorts.Sorts;
import edu.grinnell.csc207.soundsofsorting.sortevents.SortEvent;

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

    public void testSort(Consumer<Integer[]> func, Integer[] arr) {
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    public void testSortEvents(Function<Integer[], List<SortEvent<Integer>>> func, Integer[] arr) {
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        List<SortEvent<Integer>> events = func.apply(arr);
        Sorts.eventSort(arr2, events);
        assertTrue(sorted(arr2));
    }

    public static Integer[] makeTestArray() {
        return new Integer[] {
            3, 7, 9, 1, 2,
            18, 16, 15, 19, 8,
            14, 12, 5, 13, 4,
            6, 0, 17, 11, 10
        };
    }

    public static Integer[] makeDuplicatesTestArray() {
        return new Integer[] {
            3, 7, 9, 1, 2,
            18, 16, 1, 19, 8,
            14, 12, 5, 13, 14,
            6, 0, 14, 11, 10
        };
    }

    public static Integer[] makeOrderedTestArray() {
        return new Integer[] {
            -12, -9, -8, -8, -6,
            -3, 0, 1, 1, 2,
            4, 5, 12, 13, 14,
            16, 20, 24, 31, 40
        };
    }

    public static Integer[] makeReversedTestArray() {
        return new Integer[] {
            40, 31, 24, 20, 16,
            14, 13, 12, 5, 4,
            2, 1, 1, 0, -3,
            -6, -8, -8, -9, -12
        };
    }

    @Test
    public void testBubbleSort() {
        testSort(Sorts::bubbleSort, makeTestArray());
    }

    @Test
    public void testBubbleSortEvents() {
        testSortEvents(Sorts::bubbleSort, makeTestArray());
    }

    @Test
    public void testBubbleSortDuplicates() {
        testSort(Sorts::bubbleSort, makeDuplicatesTestArray());
    }

    @Test
    public void testBubbleSortInOrder() {
        testSort(Sorts::bubbleSort, makeOrderedTestArray());
    }

    @Test
    public void testBubbleSortReverseOrder() {
        testSort(Sorts::bubbleSort, makeReversedTestArray());
    }
    
    @Test
    public void testInsertionSort() {
        testSort(Sorts::insertionSort, makeTestArray());
    }

    @Test
    public void testInsertionSortEvents() {
        testSortEvents(Sorts::insertionSort, makeTestArray());
    }

    @Test
    public void testInsertionSortDuplicates() {
        testSort(Sorts::insertionSort, makeDuplicatesTestArray());
    }

    @Test
    public void testInsertionSortInOrder() {
        testSort(Sorts::insertionSort, makeOrderedTestArray());
    }

    @Test
    public void testInsertionSortReverseOrder() {
        testSort(Sorts::insertionSort, makeReversedTestArray());
    }
    
    @Test
    public void testSelectionSort() {
        testSort(Sorts::selectionSort, makeTestArray());
    }

    @Test
    public void testSelectionSortEvents() {
        testSortEvents(Sorts::selectionSort, makeTestArray());
    }

    @Test
    public void testSelectionSortDuplicates() {
        testSort(Sorts::selectionSort, makeDuplicatesTestArray());
    }

    @Test
    public void testSelectionSortInOrder() {
        testSort(Sorts::selectionSort, makeOrderedTestArray());
    }

    @Test
    public void testSelectionSortReverseOrder() {
        testSort(Sorts::selectionSort, makeReversedTestArray());
    }

    @Test
    public void testMergeSort() {
        testSort(Sorts::mergeSort, makeTestArray());
    }

    @Test
    public void testMergeSortEvents() {
        testSortEvents(Sorts::mergeSort, makeTestArray());
    }

    @Test
    public void testMergeSortDuplicates() {
        testSort(Sorts::mergeSort, makeDuplicatesTestArray());
    }

    @Test
    public void testMergeSortInOrder() {
        testSort(Sorts::mergeSort, makeOrderedTestArray());
    }

    @Test
    public void testMergeSortReverseOrder() {
        testSort(Sorts::mergeSort, makeReversedTestArray());
    }
    
    @Test
    public void testQuickSort() {
        testSort(Sorts::quickSort, makeTestArray());
    }

    @Test
    public void testQuickSortEvents() {
        testSortEvents(Sorts::quickSort, makeTestArray());
    }

    @Test
    public void testQuickSortDuplicates() {
        testSort(Sorts::quickSort, makeDuplicatesTestArray());
    }

    @Test
    public void testQuickSortInOrder() {
        testSort(Sorts::quickSort, makeOrderedTestArray());
    }

    @Test
    public void testQuickSortReverseOrder() {
        testSort(Sorts::quickSort, makeReversedTestArray());
    }

    @Test
    public void testGnomeSort() {
        testSort(Sorts::gnomeSort, makeTestArray());
    }

    @Test
    public void testGnomeSortEvents() {
        testSortEvents(Sorts::gnomeSort, makeTestArray());
    }

    @Test
    public void testGnomeSortDuplicates() {
        testSort(Sorts::gnomeSort, makeDuplicatesTestArray());
    }

    @Test
    public void testGnomeSortInOrder() {
        testSort(Sorts::gnomeSort, makeOrderedTestArray());
    }

    @Test
    public void testGnomeSortReverseOrder() {
        testSort(Sorts::gnomeSort, makeReversedTestArray());
    }
}