package algorithms.elementaryAlgorithmsSort;

public class BubbleSort {

    /**
     *Сортировка пузырьком.
     * Сортировка основанна на попарном сравнении чисел и если
     * левое число больше правого, то они меняются местами. Таким
     * образом происходит "выталкивание" максимальных чисел.
     * @param array сортируемый массив
     */

    public static void bubbleSort(int[] array) {
        int length = array.length - 1;
        while (length != 0) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int swip = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = swip;
                }
            }
            length--;
        }
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{6,3,8,2,6,9,4,11,1};
        bubbleSort(testArr);
        for (int i : testArr) {
            System.out.println(i);
        }
    }
}
