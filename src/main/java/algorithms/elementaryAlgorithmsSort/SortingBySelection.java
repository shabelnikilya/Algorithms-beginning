package algorithms.elementaryAlgorithmsSort;

public class SortingBySelection {

    /**
     * Сортировка выборкой.
     * Метод принимает массив чисел. Алгоритм основан на нахождения
     * min значения на разных отрезках массива и вставку его в начало.
     * Алгоритм не эффективный. Сложность O(n^2)
     * @param array
     */

    public static void sortArraySelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int swap = array[i];
            array[i] = array[min];
            array[min] = swap;
        }
    }

    public static void main(String[] args) {
        int[] ar = new int[] {4, 9, 7, 3};
        sortArraySelection(ar);
        for (int out : ar) {
            System.out.println(out);
        }
    }
}
