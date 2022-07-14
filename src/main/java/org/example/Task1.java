package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// Создания класса для фильтрации
public class Task1 {
    // Создания метода для фильтрации Листов
    public static List<Object> filterList(final List<Object> list) {
        if (list.isEmpty())
            throw new ArrayIndexOutOfBoundsException("Empty List");
        // Создантя обьекта stream из листа
        // Фильтрация стрима, он стравниве классы что бы отфильтровать string-ги
        List<Object> filteredList = list.stream().filter(x-> x instanceof Integer).filter(x-> {
            // Проверка на наличие негативных элиментов
            if((Integer) x < 0)
                throw new IllegalArgumentException("Negative number was inserted");
            return true;
            //Стрим переводим в лист
        }).collect(Collectors.toList());
        return filteredList;


    }

}
