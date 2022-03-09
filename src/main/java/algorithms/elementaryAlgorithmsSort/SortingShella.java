package algorithms.elementaryAlgorithmsSort;

public class SortingShella {

     /**
      * Сортировка Шелла.
      * Модифицированная сортиравка вставками.
      * Массив делится на группы, внутри которой осуществляется сортировка
      * выборкой. На каждой итерации количество групп увеличивается.
      * @param array
      */
     public static void sort(int[] array) {
          int length = array.length;
          int del = length / 2;
          while (del > 0) {
               for (int i = 0; i < length - del; i++) {
                    int r = i;
                    while (r >= 0 && array[r] > array[r + del]) {
                         int swap = array[r];
                         array[r] = array[r + del];
                         array[r + del] = swap;
                         r--;
                    }
               }
               del /= 2;
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
