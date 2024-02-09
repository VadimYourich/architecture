public class Main {
    public static void main(String[] args) {
        Emploee teacher = new Emploee("Teacher", 2);
        CalculateSalary calculateSalary = new CalculateSalary(100000);
        System.out.println("Salary of " + teacher.name + " = " + calculateSalary.calculateSalary(teacher) + " RUB");
    }
}