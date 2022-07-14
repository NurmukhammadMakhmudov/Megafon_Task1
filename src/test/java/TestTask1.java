import org.example.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestTask1 {
    // Первый тест
    @Test
    void Test1() {
        Assertions.assertEquals(List.of(1,2),  Task1.filterList(List.of(1, 2, "a", "b")));

    }
    // Второй тест
    @Test
    void Test2() {

        Assertions.assertEquals(List.of(1,2,0,15), Task1.filterList(List.of(1, 2, "a", "b", 0, 15)));
    }
    // Третий тест
    @Test
    void Test3() {
        Assertions.assertEquals(List.of(1,2,231),  Task1.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)));

    }
    // Проверка на то что выбреситься ли exception если передать пустой лист
    @Test
    void isListEmpty() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()-> Task1.filterList(List.of()));
    }
    // Проверка на то что выбреситься ли exception если передать негативное число лист
    @Test
    void TestNotNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> Task1.filterList(List.of(-1, 2, "a", "b", "aasf", "1", "123", 231)));
    }
}
