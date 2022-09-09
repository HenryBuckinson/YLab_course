package firstTask;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGeneratorRunner {
    public static void main(String[] args) {
        showArrayInfo();

    }

    /**
     * Метод создаёт массив, размерность которого зависит от выбора пользователя. Массив заполняется числами в
     * диапазоне от -100 до 100. В качестве результата работы, в консолль выводится max, min, avg массива.
     */
    public static void showArrayInfo() {
        int[][] targetArray = fillingArray();
        int maxValue = 0;
        int minValue = 0;
        double avgValue = 0;
        for (int i = 0; i < targetArray.length; i++) {
            for (int j = 0; j < targetArray[i].length; j++) {
                avgValue += targetArray[i][j];
                if (i == 0 & j == 0) {
                    minValue = targetArray[i][j];
                    maxValue = targetArray[i][j];
                }
                if (targetArray[i][j] <= minValue) {
                    minValue = targetArray[i][j];
                }
                if (targetArray[i][j] >= maxValue) {
                    maxValue = targetArray[i][j];
                }
            }
        }
        System.out.println("Average value: " + avgValue / (targetArray.length * targetArray.length));
        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
    }

    private static int[][] fillingArray() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите желаемую длину массива:");
        int lengthArray = 0;
        while (scn.hasNextInt() || scn.hasNext()) {
            if (scn.hasNextInt()) {
                int checkNumber = scn.nextInt();
                if (checkNumber > 0) {
                    lengthArray = checkNumber;
                    break;
                } else {
                    System.out.println("Длина массива не может быть отрицательной величиной. Введите значение заново: ");
                }
            } else if (scn.hasNext()) {
                System.out.println("Некорректный ввод. Введите значение заново: ");
                scn.next();
            }
        }
        int[][] resultArray = new int[lengthArray][lengthArray];
        System.out.println("Полученный массив имеет вид:");
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                resultArray[i][j] = new Random().nextInt(-100, 101);
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return resultArray;
    }
}
