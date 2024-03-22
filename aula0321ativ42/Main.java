package aula0321ativ42;

public class Main {
    public static void main(String[] args) {

        Colaborador colab1 = new Colaborador("Erica", "Suguimoto", 5000.00);
        Colaborador colab2 = new Colaborador("Luíz", "da Silva", 7000.00);

        System.out.println("Primeiro colab: " + colab1.getFirstName() + " " + colab1.getLastName());
        System.out.println("Ele recebe ao mês: R$ " + colab1.getSalary());
        colab1.salaryIncrease();
        colab1.setLastName("Daikawa");
        System.out.println("Ela se casou, agora ela se chama: " + colab1.getFirstName() + " " + colab1.getLastName() );
        System.out.println("\n==========\n");
        System.out.println("Segundo colab: " + colab2.getFirstName()+ " " + colab2.getLastName() );
        System.out.println("Ele recebe ao mês: R$ " + colab2.getSalary());
        colab2.salaryIncrease();
    }
}
