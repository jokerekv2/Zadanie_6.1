import java.util.Scanner;

public class EmployeeBuilder {
    Scanner sc = new Scanner(System.in);

    public void fillWithEmployees(Employee[] employees) {
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


}
