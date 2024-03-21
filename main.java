import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int i, aux;

        System.out.println("\n1 - Contagem regressiva: ");
        for(i = 10; i > 0; i--){
            System.out.println(i);
        }


        System.out.println("\n2 - Digite um número, vamos fazer a tabuada: ");
        int tabuada = leitura.nextInt();
        for(i = 1; i <= 10; i++){
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }


        System.out.println("\n3 - Algoritmo que soma os números pares de 1 a 100:");
        aux = 0;
        for(i = 2; i <= 100; i ++){
            if(i % 2 == 0) aux = aux + i;
        }
        System.out.println("A soma calculada foi de: " + aux);


        System.out.println("\n4 - Verificar se o número é primo: ");
        int numero = leitura.nextInt();
        if ((numero % 2 != 0) && (numero % 3 != 0)) {
            System.out.println("Este número é primo");
        } else {
            System.out.println("Este número não é primo");
        }


        System.out.println("\n5 - Implemente um algoritmo que exiba os primeiros 20 números da sequência de Fibonacci. ");
        int n1 = 0, n2 = 1, x= 20;
        for (int qtd = x; qtd > 0; qtd--) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("Fim");


        System.out.println("\n6 - Faça um programa que solicite ao usuário números inteiros positivos. " +
                "Quando o usuário digitar um número negativo, o programa deve exibir a média dos números " +
                "inseridos até aquele momento.");
        int inteiro = 0, soma = 0, items = 0,media = 0;

       do{
           System.out.println("Digite um número inteiro positivo: ");
           inteiro = leitura.nextInt();
           if(inteiro < 0) break;
           soma += inteiro;
           items++;
           System.out.println("soma: " + soma + " items: " + items);
       } while(inteiro > 0);
        media = soma / items;
        System.out.println("A média dos números digitados até o momento é: " + media);


        System.out.println("\n7 - Crie uma calculadora simples que permita ao usuário realizar operações de soma," +
                " subtração, multiplicação e divisão entre dois números, utilizando um laço de repetição " +
                "para continuar operando até que o usuário decida sair.");

        System.out.println("\ndigite o primeiro número: \n");
        int num1 = leitura.nextInt();
        System.out.println("\ndigite o segundo numero: \n");
        int num2 = leitura.nextInt();
        System.out.println("você quer somar, subtrair, multiplicar ou dividir? ");
        String operacao = leitura.next();
        operacao += leitura.nextLine();

        switch(operacao) {
            case "somar":
                System.out.println("\nSomando " + num1 + " + " + num2 + " = " +( num1 + num2));
                break;
            case "subtrair":
                System.out.println("\nSubtraindo " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "multiplicar":
                System.out.println("\nMultiplicando " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "dividir":
                System.out.println("\nDividindo " + num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Desculpe, não entendi qual a operação.");
        }


        System.out.println("\n8 - Implemente um jogo no qual o programa escolhe um número aleatório " +
                "entre 1 e 100, e o jogador deve tentar adivinhá-lo. " +
                "O programa deve fornecer dicas do tipo \"maior\" ou \"menor\" conforme necessário.");
        int random = (int)(Math.random() * 100 + 1);
        int adivinha;
        do{
            System.out.println("Tente adivinhar o número: ");
            adivinha = leitura.nextInt();
            if(adivinha < random) System.out.println("O número é um pouco maior");
            if(adivinha > random) System.out.println("O número é um pouco menor");
            if(adivinha == random) break;
        } while(adivinha != random);
        System.out.println("Que legal, vc acertou!");


        System.out.println("\n9 - Escreva um programa que converta a temperatura de " +
                "Celsius para Fahrenheit ou vice-versa, solicitando ao usuário qual conversão deseja fazer. " +
                "O programa deve continuar executando até que o usuário decida sair.");
        System.out.println("Você precisa converter para Celsius ou para Fahrenheit? Digite C ou F: ");
        String medida = leitura.nextLine();
        System.out.println("Digite agora qual a temperatura: ");
        int temp = leitura.nextInt();
        int res = 0;
        switch (medida) {
            case "F":
                res = temp * (9/5) + 32;
                System.out.println(temp + " graus Celsius equivale a " + res + " Fahrenheit");
                break;
            case "C":
                res = (temp - 32) * (5/9);
                System.out.println(temp + "graus F equivale a " + res + " Celsius");
                break;
            default:
                System.out.println("Não entendi, tente outra vez.");
        }


        System.out.println("\n10 - Desenvolva um programa que permita ao usuário inserir itens " +
                "em uma lista de compras. O programa deve exibir a lista de compras atualizada após " +
                "cada inserção e perguntar se o usuário deseja adicionar mais itens. " +
                "O programa deve continuar executando até que o usuário decida sair.\n");
        System.out.println("Comprinhas");

        String[] listaDeCompras = new String[1];
        int tam = 0;

        while (true) {
            System.out.println("Digite o nome do item, digite '0' para sair");
            String item = leitura.nextLine();

            if (item.equals("0")) {
                break;
            } else {
                if (tam == listaDeCompras.length) {
                    String[] novoVetor = new String[2 * listaDeCompras.length];
                    for ( i = 0; i < listaDeCompras.length; i++) {
                        novoVetor[i] = listaDeCompras[i];
                    }
                    listaDeCompras = novoVetor;
                }
                listaDeCompras[tam] = item;
                tam++;

                System.out.println("\nSua lista de compras atualizada:");
                for ( i = 0; i < tam; i++) {
                    System.out.println((i + 1) + ". " + listaDeCompras[i]);
                }
            }
        }

        System.out.println("\nSua lista de compras final:");
        for ( i = 0; i < tam; i++) {
            System.out.println((i + 1) + ". " + listaDeCompras[i]);
        }
    }
}

