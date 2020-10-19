import java.util.Scanner;

public class Tools {
    Scanner sc = new Scanner(System.in);

    public void addEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            employees[i] = dataReader();
        }
    }

    public Employee dataReader() {
        System.out.print("Podaj imie: ");
        String name = sc.nextLine();
        System.out.print("Podaj nazwisko: ");
        String surname = sc.nextLine();
        System.out.print("Podaj wynagrodzenie: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        return new Employee(name, surname, salary);
    }

    public double totalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary = totalSalary + employees[i].getSalary();
        }
        return totalSalary;
    }
}
