package secondTask;

import java.util.Arrays;

public class SecondTaskRunner {
    public static void main(String[] args) {
        int[] ints = coupleOfSumNumber(new int[]{3, 4, 2, 7}, 10);
        printArrayResult(ints);
    }

    private static void printArrayResult(int[] ints) {
        Arrays.stream(ints).forEach(k -> System.out.print(" [ " + k + " ] "));
    }

    public static int[] coupleOfSumNumber(int[] targetArray, int resultSumNumber) {
        for (int i = 0; i < targetArray.length; i++) {
            for (int j = i; j < targetArray.length; j++) {
                if (targetArray[i] + targetArray[j] == resultSumNumber) {
                    return new int[]{targetArray[i], targetArray[j]};
                }
            }
        }
        throw new ArithmeticException("Интересующей пары чисел не обнаружено");
    }
}
