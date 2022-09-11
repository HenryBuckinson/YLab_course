package thirdTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ThirdTaskRunnerTest {

    @Test
    @DisplayName("Посимвольный поиск целевого слова в интересующем слове (проверка исходных тест-кейсов)")
    void shouldFuzzySearch1() {
        Assertions.assertTrue(ThirdTaskRunner.fuzzySearch("car", "ca6$$#_rtwheel"));
        Assertions.assertTrue(ThirdTaskRunner.fuzzySearch("cwhl", "cartwheel"));
        Assertions.assertTrue(ThirdTaskRunner.fuzzySearch("cwhee", "cartwheel"));
        Assertions.assertTrue(ThirdTaskRunner.fuzzySearch("cartwheel", "cartwheel"));
        Assertions.assertFalse(ThirdTaskRunner.fuzzySearch("cwheeel", "cartwheel"));
        Assertions.assertFalse(ThirdTaskRunner.fuzzySearch("lw", "cartwheel"));
    }

    @Test
    @DisplayName("Посимвольный поиск целевого слова в интересующем слове (проверка собственных тест-кейсов)")
    void shouldFuzzySearch2() {
        Assertions.assertFalse(ThirdTaskRunner.fuzzySearch("carbon", "cArBoNara"));
        Assertions.assertTrue(ThirdTaskRunner.fuzzySearch("carbon", "carbonara"));
        Assertions.assertFalse(ThirdTaskRunner.fuzzySearch("slider", "soldier"));
        Assertions.assertFalse(ThirdTaskRunner.fuzzySearch("banana", "ananab"));
        Assertions.assertTrue(ThirdTaskRunner.fuzzySearch("banana", "aanabananza"));
        Assertions.assertTrue(ThirdTaskRunner.fuzzySearch("tenet", "tenet"));
        Assertions.assertFalse(ThirdTaskRunner.fuzzySearch("opera", "arepo"));
        Assertions.assertFalse(ThirdTaskRunner.fuzzySearch("", ""));
        Assertions.assertFalse(ThirdTaskRunner.fuzzySearch(null, ""));
        Assertions.assertFalse(ThirdTaskRunner.fuzzySearch("", null));
        Assertions.assertFalse(ThirdTaskRunner.fuzzySearch(null, null));
    }
}