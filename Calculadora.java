import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    int opcao;
    do{
        System.out.println("\nEscolha uma opção");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.println("[5] Potência");
        System.out.println("[6] Raiz quadrada");
        System.out.println("[7] Média");
        System.out.println("[0] Sair do sistema");

        opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                somar(sc);
                break;

            case 2:
                subtrair(sc);
                break;

            case 3:
                multiplicar(sc);
                break;

            case 4:
                dividir(sc);
                break;

            case 5:
                potencia(sc);
                break;

            case 6:
                raiz(sc);
                break;

            case 7:
                media(sc);
                break;

            case 0:
                System.out.println("Encerrando o sistema...\nAté logo...");
                break;

            default:
                System.out.println("Opção inválida,\nTente novamente");
        }   
    } while(opcao !=0);

        sc.close();
    }

    static void somar(Scanner sc) {
        double n1 = lernumero(sc, "Digite um número: ");
        double n2 = lernumero(sc, "Digite outro número: ");

        System.out.println("O resultado é: " + (n1 + n2));
    }

    static void subtrair(Scanner sc) {
        double n1 = lernumero(sc, "Digite um número: ");
        double n2 = lernumero(sc, "Digite outro número: ");

        System.out.println("O resultado é: " + (n1 - n2));
    }

    static void multiplicar(Scanner sc) {
        double n1 = lernumero(sc, "Digite um número: ");
        double n2 = lernumero(sc, "Digite outro número: ");

        System.out.println("O resultado é: " + (n1 * n2));
    }

    static void dividir(Scanner sc) {
        double n1 = lernumero(sc, "Digite um número: ");
        double n2 = lernumero(sc, "Digite outro número: ");

        if (n2 != 0) {
            System.out.println("O resultado é: " + (n1 / n2));
        } else {
            System.out.println("Não é possível dividir por zero!");
        }
    }

    static void potencia(Scanner sc) {
        double n1 = lernumero(sc, "Digite um número: ");
        double n2 = lernumero(sc, "Digite outro número: ");

        System.out.println("O resultado é: " + Math.pow(n1, n2));
    }

    static void raiz(Scanner sc) {
        double n1 = lernumero(sc, "Digite um número: ");

        System.out.println("O resultado é: " + Math.sqrt(n1));
    }

    static void media(Scanner sc) {

        System.out.println("Quantos números deseja calcular?");
        int quantidade = sc.nextInt();

        if (quantidade <= 0) {
            System.out.println("Digite uma quantidade válida!");
            return;
        }

        double soma = 0;

        for (int i = 1; i <= quantidade; i++) {

            System.out.println("Digite o número " + i + ":");
            double numero = sc.nextDouble();

            soma += numero;
        }

        double media = soma / quantidade;

        System.out.println("A média é: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
            
    }
    static double lernumero(Scanner sc, String mensagem){

        System.out.println(mensagem);
        while(!sc.hasNextDouble()){
            System.out.println("Valor Inválido\nTente novamente");
            sc.next();
        }
            return sc.nextDouble();
        }
}