package org.example;

import java.util.List;

import static org.example.Task1.filterList;

public class Main {
    // Cоздания main для дальнейшего upgrade-да задания
    public static void main(String[] args) {
        filterList(List.of(1, 2, "a", "b")).forEach(System.out::println);
        filterList(List.of(1, 2, "a", "b", 0, 15)).forEach(System.out::println);
        filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)).forEach(System.out::println);

    }

}