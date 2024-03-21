package OO_mar_20;

public class Main {
    public static void main(String[] args) {
        //cria um animal
        Animal animal1 = new Animal("Erica", 10);
        Animal animal2 = new Animal("marcelo", 13);
        Animal animal3 = new Animal("erick", 1);
        // mostrar atributos e métodos
        System.out.println("O nome do animal é: " + animal1.getNome());
        System.out.println("o nome do animal é: " + animal1.getIdade());
        animal1.aniversarioAnimal();
        System.out.println("Ele fez anivérsário, agora ele tem: " + animal1.getIdade());

        System.out.println("=-=-=-=-=-=-=-=-=-=");

        System.out.println("O nome do animal é: " + animal2.getNome());
        System.out.println("o nome do animal é: " + animal2.getIdade());
        animal2.aniversarioAnimal();
        System.out.println("Ele fez anivérsário, agora ele tem: " + animal2.getIdade());

        System.out.println("=-=-=-=-=-=-=-=-=-=");

        System.out.println("O nome do animal é: " + animal3.getNome());
        System.out.println("o nome do animal é: " + animal3.getIdade());
        animal3.aniversarioAnimal();
        System.out.println("Ele fez anivérsário, agora ele tem: " + animal3.getIdade());
        animal3.insereNoBD();

    }
}
