package algorithms;

public class Euclid {

    /**
    Метод описывает алгоритм Евклида заключающиеся в поиске
    наибольщего общего делителя двух не отрицательных чисел.
    Метод maxCommonDivisior принимает два не отрицательных параметра
    first и second. Условие if (second == 0) предназначена для завершения
    метода, а именно для прерывания рекурсии. Т.к при получении наибольшего
    общего делителя остаток от деления будет равен 0.
     */

    public int maxCommonDivisior(int first, int second) {
        if (second == 0) {
            return first;
        }
        int changeSecond = first % second;
        return maxCommonDivisior(second, changeSecond);
    }
}

