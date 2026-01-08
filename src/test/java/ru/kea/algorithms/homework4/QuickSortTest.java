package ru.kea.algorithms.homework4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

    @Test
    public void testQuickSortEmptyArray() {
        int[] array = {};
        QuickSort.quickSort(array);
        assertArrayEquals(new int[]{}, array, "Пустой массив должен остаться пустым");
    }

    @Test
    public void testQuickSortSingleElement() {
        int[] array = {5};
        QuickSort.quickSort(array);
        assertArrayEquals(new int[]{5}, array, "Массив из одного элемента должен остаться неизменным");
    }

    @Test
    public void testQuickSortSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        QuickSort.quickSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array, "Уже отсортированный массив должен остаться отсортированным");
    }

    @Test
    public void testQuickSortReverseArray() {
        int[] array = {5, 4, 3, 2, 1};
        QuickSort.quickSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array, "Обратно отсортированный массив должен быть отсортирован");
    }

    @Test
    public void testQuickSortRandomArray() {
        int[] array = {3, 7, 1, 9, 4, 2, 8, 5, 6};
        QuickSort.quickSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, array, "Случайный массив должен быть отсортирован");
    }

    @Test
    public void testQuickSortArrayWithDuplicates() {
        int[] array = {4, 2, 4, 1, 2, 3, 1, 3};
        QuickSort.quickSort(array);
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3, 4, 4}, array, "Массив с дубликатами должен быть отсортирован");
    }

    @Test
    public void testQuickSortArrayWithNegativeNumbers() {
        int[] array = {-3, 5, -1, 0, 2, -4, 1};
        QuickSort.quickSort(array);
        assertArrayEquals(new int[]{-4, -3, -1, 0, 1, 2, 5}, array, "Массив с отрицательными числами должен быть отсортирован");
    }

    @Test
    public void testQuickSortNullArray() {
        int[] array = null;
        QuickSort.quickSort(array);
        assertNull(array, "Метод должен корректно обрабатывать null массив");
    }

    @Test
    public void testQuickSortLargeArray() {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i - 1; // Заполняем в обратном порядке
        }

        QuickSort.quickSort(array);

        // Проверяем, что массив отсортирован
        for (int i = 0; i < array.length; i++) {
            assertEquals(i, array[i], "Большой массив должен быть правильно отсортирован");
        }
    }
}