package secondTask;

import secondTask.Exceptions.ArrayDataException;
import secondTask.Exceptions.ArraySizeException;

import java.util.Arrays;

public class SecondTaskRunner {
    public static void main(String[] args) {
        int[] targetArray = {3, 4, 2, 7};
        try {
            int[] ints2 = coupleOfSumNumber(targetArray, 10);
            printArrayResult(ints2);
        } catch (ArrayDataException | ArraySizeException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printArrayResult(int[] ints) {
        System.out.print("Подходящая пара чисел: ");
        Arrays.stream(ints).forEach(k -> System.out.print(" [ " + k + " ] "));
    }

    /**
     * @param targetArray     интересующий массив.
     * @param resultSumNumber результат суммы первой пары чисел.
     * @return Результатом метод возвращает массив, содержащий первую пару чисел исходного массива, которые в сумме дают resultSumNumber.
     * @throws ArrayDataException  На входной массив отсутствует ссылка.
     * @throws ArraySizeException  Входной массив пустой.
     * @throws ArithmeticException Подходящей пары чисел не обнаружено.
     */
    public static int[] coupleOfSumNumber(int[] targetArray, int resultSumNumber) throws ArrayDataException, ArraySizeException, ArithmeticException {
        if (targetArray == null) {
            throw new ArrayDataException("На входной массив отсутствует ссылка");
        }
        if (targetArray.length == 0) {
            throw new ArraySizeException("Входной массив пустой");
        }
        for (int i = 0, j = targetArray.length - 1; ; ) {

            if (targetArray[i] + targetArray[j] < resultSumNumber) {
                j--;
                if (j == 0) {
                    throw new ArithmeticException("Интересующей пары чисел не обнаружено");
                }
                continue;
            }
            if (targetArray[i] + targetArray[j] > resultSumNumber) {
                i++;
                if (i == targetArray.length - 1) {
                    throw new ArithmeticException("Интересующей пары чисел не обнаружено");
                }
                continue;
            }
            if (targetArray[i] + targetArray[j] == resultSumNumber) {
                return new int[]{targetArray[i], targetArray[j]};
            }
        }
    }
}
