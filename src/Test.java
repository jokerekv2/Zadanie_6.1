public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        employeeBuilder.fillWithEmployees(employees);
        System.out.println("Łączne wynagrodzenie: " + employeeBuilder.calculator.totalSalary(employees));
    }
}
