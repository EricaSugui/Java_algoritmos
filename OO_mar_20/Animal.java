package OO_mar_20;

public class Animal {

    private String nome;
    int idade;
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void aniversarioAnimal(){
        idade++;
    }
    public void insereNoBD(){
        System.out.println("inserido no banco com sucesso.");
    }
}
