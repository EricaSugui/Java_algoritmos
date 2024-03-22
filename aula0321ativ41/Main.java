package aula0321ativ41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Suprimentos cafe = new Suprimentos(1, "café do bom!", 0, 15.50);
        System.out.println("Café Java");
        System.out.println("produto id: " + cafe.getItem());
        System.out.println("Descrição: " + cafe.getItemDescription());
        System.out.println("Preço unid: " + cafe.getPreco());

        System.out.println("quantos cafés vc quer comprar?");
        Scanner leitura = new Scanner(System.in);
        int compra = leitura.nextInt();
        cafe.setQuantidade(compra);
        cafe.getInvoiceAmount();
    }
}
