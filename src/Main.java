import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<Person> generateClients() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Viktor", "Petrov", 3));
        list.add(new Person("Semen", "Volkov", 1));
        list.add(new Person("Ivan", "Fedorov", 6));
        list.add(new Person("Oleg", "Sidorov", 2));
        list.add(new Person("Fedor", "Kabachkov", 7));
        return list;
    }
    public static void main(String[] args) {
        Queue<Person> queueAttraction = new LinkedList<>(generateClients());
        while (!queueAttraction.isEmpty()) {
            Person person = queueAttraction.poll();
            System.out.println(person.getName() + " " + person.getSurname() + " прокатился на аттракционе!");
            person.setTickets(person.getTickets() - 1);
            if (person.getTickets() != 0) {
                queueAttraction.offer(person);
            }
        }
    }
}
