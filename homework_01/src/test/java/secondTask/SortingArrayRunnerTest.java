package secondTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SortingArrayRunnerTest {

    @Test
    @DisplayName("Сортировка массива в порядке возрастания")
    void shouldSortingArray() {
        int[] targetArray1 = new int[]{3, 2, 1, 4, 1, 5, 1, 9};
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 2, 3, 4, 5, 9}, SortingArrayRunner.sortingArray(targetArray1));

        int[] targetArray2 = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5, 6, 9}, SortingArrayRunner.sortingArray(targetArray2));

        int[] targetArray3 = new int[]{4, 4, 7, 8, 9, 2, 3, 4, 5, 5, 5, 9, 9, 8, 7, 6, 4, -1};
        Assertions.assertArrayEquals(new int[]{-1, 2, 3, 4, 4, 4, 4, 5, 5, 5, 6, 7, 7, 8, 8, 9, 9, 9}, SortingArrayRunner.sortingArray(targetArray3));
    }

    @Test
    @DisplayName("Сортировка массива в порядке убывания")
    void shouldSortingArrayReverse() {
        int[] targetArray1 = new int[]{3, 2, 1, 4, 1, 5, 1, 9};
        Assertions.assertArrayEquals(new int[]{9, 5, 4, 3, 2, 1, 1, 1}, SortingArrayRunner.sortingArrayReverse(targetArray1));

        int[] targetArray2 = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        Assertions.assertArrayEquals(new int[]{9, 6, 5, 5, 4, 3, 2, 1}, SortingArrayRunner.sortingArrayReverse(targetArray2));

        int[] targetArray3 = new int[]{4, 4, 7, 8, 9, 2, 3, 4, 5, 5, 5, 9, 9, 8, 7, 6, 4, -1};
        Assertions.assertArrayEquals(new int[]{9, 9, 9, 8, 8, 7, 7, 6, 5, 5, 5, 4, 4, 4, 4, 3, 2, -1}, SortingArrayRunner.sortingArrayReverse(targetArray3));
    }
}