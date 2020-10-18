public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Klaudia", "Pawłat", 5000);
        employees[1] = new Employee("Król", "Julian", 10000);
        employees[2] = new Employee("Jan", "Kowalski", 2100);

        System.out.println("The total remuneration is: " + (employees[0].getSalary() + employees[1].getSalary() +
                employees[2].getSalary()));
    }
}
