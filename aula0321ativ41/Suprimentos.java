package aula0321ativ41;

public class Suprimentos {
    int item;
    String itemDescription;
    int quantidade;
    double preco;
    public Suprimentos(int item, String itemDescription, int quantidade, double preco){
        this.item = item;
        this.itemDescription = itemDescription;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0){
            this.quantidade = 0;
        }
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            this.preco = 0.0;
        }
        this.preco = preco;
    }

    public void getInvoiceAmount(){
         this.preco *= quantidade;
        System.out.println("o valor da fatura é de: " + preco);
    }
}
