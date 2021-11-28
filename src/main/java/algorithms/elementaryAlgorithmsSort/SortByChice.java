package algorithms.elementaryAlgorithmsSort;

public class SortByChice {

    /**
     *Сортировка выбором.
     * На начальном этапе за минимальный число берется элемент с индексом 0.
     * Далее происходит сравнение с остальными элементами, и если находятся
     * элементы меньше его, то они меняются местами.
     * Класс use - утилитный; метод less() - возвращает true  когда выбираем элемент меньше
     * текущего минимального, а метод exch() - меняет местами значения в массиве.
     * @param array - сортируемый массив.
     */

    public void sort(Integer[] array) {
        UtillsClass<Integer> use = new UtillsClass<>();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (use.less(array[j], array[min])) {
                    min = j;
                    use.exch(array, i, min);
                }
            }
        }
    }
}
