import org.example.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestTask1 {
    // Первый тест
    @Test
    void filteringTest() {
        Assertions.assertEquals(List.of(1,2,231),  Task1.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)));
    }
    // Проверка на то что выбреситься ли exception если передать пустой лист
    @Test
    void isListEmptyTest() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()-> Task1.filterList(List.of()));
    }
    // Проверка на то что выбреситься ли exception если передать негативное число лист
    @Test
    void isNotNegativeTest() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> Task1.filterList(List.of(-1, 2, "a", "b", "aasf", "1", "123", 231)));
    }
}
