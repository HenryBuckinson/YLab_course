package secondTask;

import java.util.Arrays;
import java.util.Objects;

public class SecondTaskRunner {
    public static void main(String[] args) {
        int[] targetArray = {3, 4, 2, 7};
        int[] ints2 = coupleOfSumNumber(targetArray, 10);

    }

    private static void printArrayResult(int[] ints) {
        System.out.print("Подходящая пара чисел: ");
        Arrays.stream(ints).forEach(k -> System.out.print(" [ " + k + " ] "));
        System.out.println();
    }

    /**
     * @param targetArray     интересующий массив.
     * @param resultSumNumber результат суммы первой пары чисел.
     * @return Результатом метод возвращает массив, содержащий первую пару чисел исходного массива, которые в сумме дают resultSumNumber.
     */
    public static int[] coupleOfSumNumber(int[] targetArray, int resultSumNumber) {
        if (targetArray == null || Objects.requireNonNull(targetArray).length == 0) {
            System.out.println("Входной массив пустой или на него отсутствует ссылка");
            return new int[]{};
        }
        for (int i = 0, j = targetArray.length - 1; ; ) {
            if (targetArray[i] + targetArray[j] < resultSumNumber) {
                j--;
                if (j == 0) {
                    System.out.println("Подходящей пары чисел не обнаружено");
                    return new int[]{};
                }
                continue;
            }
            if (targetArray[i] + targetArray[j] > resultSumNumber) {
                i++;
                if (i == targetArray.length - 1) {
                    System.out.println("Подходящей пары чисел не обнаружено");
                    return new int[]{};
                }
                continue;
            }
            if (targetArray[i] + targetArray[j] == resultSumNumber) {
                int[] result = new int[]{targetArray[i], targetArray[j]};
                printArrayResult(result);
                return result;
            }
        }
    }
}
