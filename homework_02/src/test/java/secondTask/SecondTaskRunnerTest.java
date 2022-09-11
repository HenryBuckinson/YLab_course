package secondTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class SecondTaskRunnerTest {

    @Test
    @DisplayName("Вывод первой пары чисел, в виде массива, сумма которых равна интересующему числу")
    void shouldCoupleOfSumNumber() {
        Assertions.assertArrayEquals(new int[]{3, 7}, SecondTaskRunner.coupleOfSumNumber(new int[]{3, 4, 2, 7}, 10));
        Assertions.assertArrayEquals(new int[]{2, 7}, SecondTaskRunner.coupleOfSumNumber(new int[]{3, 4, 2, 7}, 9));
        Assertions.assertArrayEquals(new int[]{2, 8}, SecondTaskRunner.coupleOfSumNumber(new int[]{2, 4, 6, 8}, 10));
        Assertions.assertArrayEquals(new int[]{4, 2}, SecondTaskRunner.coupleOfSumNumber(new int[]{8, 6, 4, 2}, 6));
        Assertions.assertArrayEquals(new int[]{}, SecondTaskRunner.coupleOfSumNumber(new int[]{3, 4, 2, 7}, 12));
        Assertions.assertArrayEquals(new int[]{}, SecondTaskRunner.coupleOfSumNumber(null, 12));
        Assertions.assertArrayEquals(new int[]{}, SecondTaskRunner.coupleOfSumNumber(new int[]{}, 12));
    }

}