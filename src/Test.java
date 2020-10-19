import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Tools tools = new Tools();
        tools.addEmployee(employees);
        System.out.println("Łączne wynagrodzenie: " + tools.totalSalary(employees));
    }
}
