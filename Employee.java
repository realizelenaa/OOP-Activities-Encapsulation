import java.time.LocalDate;
    
    class Employee {
        
        private final String name;
        private final double salary;
        private final LocalDate hireDate;
        
        protected Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
        final String getName() {
            return name;
        }
        final double getSalary() {
            return salary;
        }
        final LocalDate getHireDate() {
            return hireDate;
        }
}