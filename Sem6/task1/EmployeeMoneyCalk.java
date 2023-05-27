package Sem6.task1;

public class EmployeeMoneyCalk {
    private int baseSalary;

    public EmployeeMoneyCalk(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
}