abstract class Employee {  // Abstract class: cannot create Employee directly, meant to be a base class

    private String name;   // Employee name (encapsulated)
    private int id;        // Employee ID (encapsulated)

    public Employee(String name, int id) {   // Constructor to initialize name and id
        this.name = name;
        this.id = id;
    }

    public String getName() {   // Getter to access private name
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double calculateSalary();  // Abstract method: each subclass must define salary calculation

    @Override
    public String toString() {                // Provides readable string representation of Employee including salary
        return "Employee[name = " + name + ", id = " + id + ", salary = " + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {  // Subclass representing a full-time employee

    private double monthlySalary;           // Specific field for monthly salary

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);                    // Call parent constructor to initialize name and id
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {       // Implementation of abstract method for full-time salary
        return monthlySalary;
    }
}

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee("Chandan", 101, 50000);
        System.out.println(emp);  // Should print: Employee[name = Chandan, id = 101, salary = 50000.0]
    }
}
