package Challenges.example.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("bhavya",24,45000);
        System.out.println(emp.getEmployeeDetails());
        emp.setAge(25);
        emp.setName("Bhavu");
        emp.setSalary(100000);
        System.out.println(emp.getEmployeeDetails());
        System.out.println(emp.toString());
    }
}
