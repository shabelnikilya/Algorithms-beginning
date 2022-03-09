package algorithms.elementaryAlgorithmsSort;

public class FastSort {

    /**
     * Быстрая сортировка.
     * Сортировка основанная на рекурсии.
     * @param array
     */

    private static void sort(int[] array) {
        recursionFastSort(array, 0, array.length - 1);
    }

    /**
     * Сортируемый метод.
     * Сортировка заключается в том, что выбирается опорный элемент и
     * в результате сортируемый массив делится на два подмассива. В этих
     * подмассивах элементы сравниваются с опорным элементом и происходит сортировка
     * относительно него. С лева значения меньше, а с права больше. Если условие сортировки не
     * удовлетворяется то значения меняются местами и потом происходит рекурсивный вызов
     * данного метода.
     * @param array сортируемый массив
     * @param min индекс начала сортировки (используется при рекурсии)
     * @param max конечный индекс сортировки (используется при рекурсии)
     */

    private static void recursionFastSort(int[] array, int min, int max) {
        if (array.length == 0) {
            return;
        }
        if (min >= max) {
            return;
        }

        int middle = min + (max - min) / 2;
        int middleElement = array[middle];

        int i = min;
        int j = max;
        while (i <= j) {
            while (array[i] < middleElement) {
                i++;
            }
            while (array[j] > middleElement) {
                j--;
            }

            if (i <= j) {
                int swap = array[i];
                array[i] = array[j];
                array[j] = swap;
                i++;
                j--;
            }
        }

        if (min < j) {
            recursionFastSort(array, min, j);
        }
        if (max > i) {
            recursionFastSort(array, i, max);
        }
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{6, 3, 8, 8, 6, 9, 4, 11, 1};
        sort(testArr);
        for (int i : testArr) {
            System.out.println(i);
        }
    }
}
