import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Scanner sc = new Scanner(System.in);
        employees[0] = new Employee();
        employees[1] = new Employee();
        employees[2] = new Employee();

        for (int i = 0; i < employees.length; i++) {
            System.out.print("Podaj imie: ");
            employees[i].setName(sc.nextLine());
            System.out.print("Podaj nazwisko: ");
            employees[i].setSurname(sc.nextLine());
            System.out.print("Podaj wynagrodzenie: ");
            employees[i].setSalary(sc.nextDouble());
            sc.nextLine();
        }

        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary = totalSalary + employees[i].getSalary();
        }

        System.out.println("Total salary: " + totalSalary);


    }
}
