public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        EmployeeFinanceCalculator calculator = new EmployeeFinanceCalculator();
        company.addEmployee();
        System.out.println(company.getIndexOfEmployee(2).toString());
        System.out.println("Suma wynagrodzeń: " + calculator.totalSalary(company.getEmployees()));

    }
}
