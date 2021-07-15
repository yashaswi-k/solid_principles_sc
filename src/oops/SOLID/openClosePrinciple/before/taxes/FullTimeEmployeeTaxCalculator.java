package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

class FullTimeEmployeeTaxCalculator implements TaxCalculator{

    private final static int INCOME_TAX_PERCENTAGE = 30;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 2;
    private final static int EDUCATIONAL_CESS = 1;


    public double calculate(Employee employee) {
        return 
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100 +
                 (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
                (employee.getMonthlyIncome() * EDUCATIONAL_CESS) / 100;

    }
}