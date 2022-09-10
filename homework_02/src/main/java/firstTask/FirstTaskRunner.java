package firstTask;

import java.util.*;
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
        Map<String, Long> stringListMap = advancedSortingVersion1(RAW_DATA);
        System.out.println();
        System.out.println(stringListMap + "\n");

        Map<String, List<Person>> stringListMap1 = advancedSortingVersion2(RAW_DATA);
        System.out.println();
        System.out.println(stringListMap1 + "\n");
    }

    /**
     * @param objArray  массив объектов типа Person
     * @return  Возвращается коллекция типа Map, ключ - сгруппированное имя, значение - число,
     * отражающее количество id, которые отсортированы в возрастающем порядке, без дубликатов.
     */
    public static Map<String, Long> advancedSortingVersion1(Person[] objArray) {
        Map<String, Long> collect = Arrays.stream(objArray)
                .filter(person -> Objects.nonNull(person) && person.getName() != null)
                .distinct()
                .sorted(Comparator.comparingInt(Person::getId))
                .collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
        printMapOfPersonsVersion1(collect);
        return collect;
    }

    private static void printMapOfPersonsVersion1(Map<String, Long> sortingMap) {
        for (Map.Entry<String, Long> entry : sortingMap.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }

    /**
     * @param objArray  массив объектов типа Person
     * @return  Возвращается коллекция типа Map, ключ - сгруппированное имя, значение - список, в котором
     * id отсортированы в возрастающем порядке, без дубликатов.
     */
    public static Map<String, List<Person>> advancedSortingVersion2(Person[] objArray) {
        Map<String, List<Person>> collect = Arrays.stream(objArray)
                .filter(person -> Objects.nonNull(person) && person.getName() != null)
                .distinct()
                .sorted(Comparator.comparing(Person::getId))
                .collect(Collectors.groupingBy(Person::getName, Collectors.toList()));
        printMapOfPersonsVersion2(collect);
        return collect;
    }

    private static void printMapOfPersonsVersion2(Map<String, List<Person>> sortingMap) {
        for (Map.Entry<String, List<Person>> entry : sortingMap.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue().size());
        }
    }
}
