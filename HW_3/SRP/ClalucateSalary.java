public class CalculateSalary {
    int baseSalary;

    public CalculateSalary(int rate) {
        this.baseSalary = rate;
    }

    public double calculateSalary(Emploee emploee) {
        return this.baseSalary * emploee.salaryFactor;
    }
}