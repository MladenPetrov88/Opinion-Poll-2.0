package Task1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        int count = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> people = new TreeMap<>();
        for (int i = 0; i < count; i++) {
            String[] temp = scanner.nextLine().split("\\s+");
            person.setName(temp[0]);
            person.setAge(Integer.parseInt(temp[1]));

            if (!people.containsKey(person.getName())) {
                people.put(person.getName(), person.getAge());
            } else {
                people.put(person.getName(), people.get(person.getAge()));
            }

        }
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            if (entry.getValue() > 30) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }


    }
}
