public class EmployeeFinanceCalculator {
    public double totalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary = totalSalary + employees[i].getSalary();
        }
        return totalSalary;
    }

}
