package algorithms.elementaryAlgorithmsSort;

public class SortingByInserts {

    /**
     * Сортировка вставками.
     * Происходит поочередное сравнение элементов и если оно меньше,
     * то вставка на свое место из уже просмотренных.
     * @param array - Сортируемый массив.
     */

    public void sort(Integer[] array) {
        UtillsClass<Integer> utills = new UtillsClass<>();
        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && utills.less(array[j], array[j - 1]); j--) {
                utills.exch(array, j, j - 1);
            }
        }
    }

    /**
     * С лева всегда будет отсортированная часть массива
     * @param array
     */
    public static void secondSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                int swap = array[j];
                array[j] = array[j - 1];
                array[j - 1] = swap;
            }
        }
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{6, 3, 8, 8, 6, 9, 4, 11, 1};
        secondSort(testArr);
        for (int i : testArr) {
            System.out.println(i);
        }
    }
}
