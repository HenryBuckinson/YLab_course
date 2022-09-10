package secondTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import secondTask.Exceptions.ArrayDataException;
import secondTask.Exceptions.ArraySizeException;


class SecondTaskRunnerTest {

    @Test
    @DisplayName("Вывод первой пары чисел, в виде массива, сумма которых равна интересующему числу")
    void shouldCoupleOfSumNumber() {
        Assertions.assertArrayEquals(new int[]{3, 7}, SecondTaskRunner.coupleOfSumNumber(new int[]{3, 4, 2, 7}, 10));
        Assertions.assertArrayEquals(new int[]{2, 7}, SecondTaskRunner.coupleOfSumNumber(new int[]{3, 4, 2, 7}, 9));
        Assertions.assertArrayEquals(new int[]{2, 8}, SecondTaskRunner.coupleOfSumNumber(new int[]{2, 4, 6, 8}, 10));
        Assertions.assertArrayEquals(new int[]{4, 2}, SecondTaskRunner.coupleOfSumNumber(new int[]{8, 6, 4, 2}, 6));
    }

    @Test
    @DisplayName("Обработка исключения в случае, если не удается найти подходящую пару чисел")
    void shouldThrowArithmeticException1() {
        try {
            SecondTaskRunner.coupleOfSumNumber(new int[]{3, 4, 2, 7}, 12);
        } catch (ArithmeticException e) {
            Assertions.assertEquals("Интересующей пары чисел не обнаружено", e.getMessage());
        }
    }

    @Test
    @DisplayName("Обработка исключения в случае, если входной массив пустой")
    void shouldThrowArithmeticException2() {
        try {
            SecondTaskRunner.coupleOfSumNumber(new int[]{}, 12);
        } catch (ArraySizeException e) {
            Assertions.assertEquals("Входной массив пустой", e.getMessage());
        }
    }

    @Test
    @DisplayName("Обработка исключения в случае, если на входной массив отсутствует ссылка")
    void shouldThrowArithmeticException3() {
        try {
            SecondTaskRunner.coupleOfSumNumber(null, 12);
        } catch (ArrayDataException e) {
            Assertions.assertEquals("На входной массив отсутствует ссылка", e.getMessage());
        }
    }
}