package Part1.InlineClass.version2;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта адреси
        Address address = new Address("Street", "City", "Country");

        // Створення об'єкта персони з використанням створеного об'єкта адреси
        Person person = new Person("John Doe", address);

        // Виведення інформації про персону та її адресу
        System.out.println("Person: " + person.getName() + person.getAddress());
    }
}
