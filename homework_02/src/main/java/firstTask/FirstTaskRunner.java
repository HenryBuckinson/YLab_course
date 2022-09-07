package firstTask;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstTaskRunner {

    private static Person[] RAW_DATA = new Person[]{
            new Person(0, "Harry"),
            new Person(0, "Harry"),
            new Person(1, "Harry"),
            new Person(2, "Harry"),
            new Person(3, "Emily"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(6, "Amelia"),
            new Person(7, "Amelia"),
            new Person(8, "Amelia"),
    };

    public static void main(String[] args) {
        System.out.println("Исходный набор объектов типа Person:");
        for (Person item : RAW_DATA) {
            System.out.println(item.id + " : " + item.name);
        }
        System.out.println();
        Map<String, List<Person>> stringListMap = advancedSorting(RAW_DATA);
        printMapOfPersons(stringListMap);
    }

    public static Map<String, List<Person>> advancedSorting(Person[] objArray) {
        return Arrays.stream(objArray)
                .distinct()
                .collect(Collectors.groupingBy(Person::getName));
    }

    public static void printMapOfPersons(Map<String, List<Person>> sortingMap) {
        System.out.println("Карта без дубликатов, которая отсортирована по id и сгруппирована по имени:\n");
        for (Map.Entry<String, List<Person>> entry : sortingMap.entrySet()) {
            System.out.println(entry.getKey() + ": ");
            System.out.println("_______________");
            System.out.println("id   | name  ");
            System.out.println("---------------");
            for (Person person : entry.getValue()) {
                System.out.printf("%-4d | %-10s", person.id, person.name);
                System.out.println();
            }
            System.out.println("_______________\n");
        }
    }
}
