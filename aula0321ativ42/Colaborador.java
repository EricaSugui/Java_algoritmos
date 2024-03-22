package aula0321ativ42;

public class Colaborador {
    String firstName;
    String lastName;
    double salary;

    public Colaborador(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0.0){
            this.salary = 0.0;
        }
        this.salary = salary;
    }

    public void salaryIncrease(){
        this.salary *= 1.10;
        System.out.println("Você recebeu um aumento de 10%!" +
                "\nSeu salário agora é de " + salary);
    }
}
