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
}
