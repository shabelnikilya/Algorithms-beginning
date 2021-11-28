package algorithms.elementaryAlgorithmsSort;

import java.util.Arrays;

/**
 * Утилитный класс для дальнейшей работы с алгоритмами.
 * @param <T> - дженерик для работы с различными ссылочными типами данных.
 */

public class UtillsClass<T extends Comparable<T>> {

    /**
     * Метод предназначен для сравнения двух объектов.
     * @param left - сравнимаемый объект
     * @param right - сравниваемый объект
     * @return возвращает логическое выражение true, если объект left
     * больше объекта right.
     */

    public boolean less(T left, T right) {
        return left.compareTo(right) < 0;
    }

    /**
     * Метод меняет элементы в массиве
     * @param in - массив, в котором происходит перестановка элементов
     * @param i - индекс элемент
     * @param j - индекс другого элементы
     */
    public void exch(T[] in, int i, int j) {
        T t = in[i];
        in[i] = in[j];
        in[j] = t;
    }

    /**
     * Метод для вывода в консоль принимаемого массива
     * @param in - выводимый массив
     */

    public void show (T[] in) {
        Arrays.stream(in).forEach(System.out::println);
    }
}
