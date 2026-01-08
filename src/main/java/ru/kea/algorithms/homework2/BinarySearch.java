package ru.kea.algorithms.homework2;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13};

        System.out.println("array = {1, 3, 5, 7, 9, 11, 13}");
        System.out.println("target = 1:  " + binarySearch(array, 1));
        System.out.println("target = 13: " + binarySearch(array, 13));
        System.out.println("target = 4: " + binarySearch(array, 4));
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (array[mid] < target) {
                left = mid + 1;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
