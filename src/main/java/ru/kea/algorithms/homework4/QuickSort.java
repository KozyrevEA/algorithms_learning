package ru.kea.algorithms.homework4;

import java.util.ArrayDeque;
import java.util.Deque;

public class QuickSort {

    //Быстрая сортировка без рекурсии
    public static void quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            // Массив отсортирован по определению, ничего делать не нужно
            return;
        }

        // Стек для хранения границ частей массива
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(0);                 // левая граница
        stack.push(array.length - 1);  // правая граница

        // Пока стек не пустой и левая граница меньше правой
        while (!stack.isEmpty()) {
            int right = stack.pop();   // правая граница
            int left = stack.pop();    // левая граница

            if (left < right) {
                // Разбиваем массив и получаем индекс опорного элемента
                int pivot = partition(array, left, right);

                // Добавляем в стек границы левой части, где располагаются элементы меньше опорного
                if (left < pivot - 1) {
                    stack.push(left);
                    stack.push(pivot - 1);
                }

                // Добавляем в стек границы правой части, где располагаются элементы больше опорного
                if (pivot + 1 < right) {
                    stack.push(pivot + 1);
                    stack.push(right);
                }
            }
        }
    }

    // Находим опорный элемент, сортируем относительно него
    private static int partition(int[] array, int left, int right) {
        // Выбираем последний элемент в качестве опорного
        int pivot = array[right];

        // Индекс, указывающий позицию, где будут размещены элементы меньше опорного
        int i = left - 1;

        // Проходим по всем элементам части массива
        for (int j = left; j < right; j++) {
            // Если текущий элемент меньше или равен опорному
            if (array[j] <= pivot) {
                i++; // Увеличиваем индекс для размещения элемента
                // Меняем местами элементы i и j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // После того как перебрали элементы меньшие опорного, ставим опорный элемент после них
        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;

        // Вернем индекс нового опорного элемента
        return i + 1;
    }
}
