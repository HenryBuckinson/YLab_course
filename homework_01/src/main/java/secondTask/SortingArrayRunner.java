package secondTask;

public class SortingArrayRunner {
    public static void main(String[] args) {
        int[] targetArray = {5, 6, 3, 2, 5, 1, 4, 9};
        sortingArray(targetArray);
        sortingArrayReverse(targetArray);
    }

    public static int[] sortingArray(int[] array) {
        int[] resultArray = array.clone();
        System.out.println("Сортировка массива в порядке возрастания:");
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = i; j < resultArray.length; j++) {
                if (resultArray[i] >= resultArray[j]) {
                    int buffer = resultArray[j];
                    resultArray[j] = resultArray[i];
                    resultArray[i] = buffer;
                }
            }
        }
        printingArray(resultArray);
        return resultArray;
    }

    public static int[] sortingArrayReverse(int[] array) {
        int[] resultArray = array.clone();
        System.out.println("Сортировка массива в порядке убывания:");
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = i; j < resultArray.length; j++) {
                if (resultArray[i] <= resultArray[j]) {
                    int buffer = resultArray[j];
                    resultArray[j] = resultArray[i];
                    resultArray[i] = buffer;
                }
            }
        }
        printingArray(resultArray);
        return resultArray;
    }

    private static void printingArray(int[] resultArray) {
        for (int k : resultArray) {
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
