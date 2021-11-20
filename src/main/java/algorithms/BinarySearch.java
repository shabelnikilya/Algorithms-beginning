package algorithms;

import java.util.Arrays;

public class BinarySearch {

    /*
    В методе searchKeyInArray использован алгоритм бинарного поиска
    значения по массиву. Метод принимает массив в котором будет происходить поиск,
    а также элемент индекс которого нужно найти. Т.к. для корректной
    работы алгоритма необходимо иметь отсортированный массив в самом начале
    принимаемый массив array сортируется с помощью статического метода sort() класса
    Arrays. Далее применяется сам алгоритм, который основан на том, что весь массив
    делится по длине на половину и сравниваются значения - искомое и значения массива с
    с индексом (размер_массива / 2). И в зависимости от того больше или меньше
    искомое значение и зависит в какой половине массива будет продолжаться поиск.
     */

    public int searchKeyInArray(int key, int[] array) {
        Arrays.sort(array);
        int inception = 0;
        int end = array.length - 1;
        while (inception <= end) {
            int mid = inception + (end - inception) / 2;
            if (key < array[mid]) {
                end = mid - 1;
            } else if (key > array[mid]) {
                inception = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
