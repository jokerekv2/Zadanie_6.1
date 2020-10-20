import java.util.Arrays;

public class Company {
    private static final int MAX_EMPLOYEES = 2;
    private int index = 0;
    private Employee[] employees = new Employee[MAX_EMPLOYEES];
    private EmployeeBuilder employeeBuilder = new EmployeeBuilder();

    public void addEmployee() {
        employeeBuilder.fillWithEmployees(employees);
    }

    public Employee getIndexOfEmployee(int index) {
        return employees[index - 1];
    }

    public Employee[] getEmployees() {
        return employees;
    }
}