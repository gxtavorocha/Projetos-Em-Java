package ProjetosIniciais;

import java.util.Scanner;

public class ValidadorDeCnh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String leitorNome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        if (idade >= 18) {
            System.out.print("Tem Carteira de motorista? [Sim ou Não] ");
            String temCarteira = scanner.nextLine().toUpperCase();

            if (temCarteira.equals("SIM")) {
                System.out.print("Qual a categoria da sua carteira? ");
                String categoria = scanner.nextLine().toUpperCase();

                verificarCategoria(categoria);

            } else if (temCarteira.equals("NAO")) {
                System.out.printf("Sinto muito %s, você terá que andar a pé ou de ônibus por não possuir habilitação.%n", leitorNome);
            } else {
                System.out.println("Resposta inválida. Digite apenas 'Sim' ou 'Não'.");
            }
        } else {
            System.out.printf("Sinto muito %s, você ainda é menor de idade para ter CNH.%n", leitorNome);
        }

        scanner.close();
    }

    // Metodo separado para verificar a categoria da carteira
    private static void verificarCategoria(String categoria) {
        switch (categoria) {
            case "A":
                System.out.println("Você só pode andar de moto.");
                break;
            case "B":
                System.out.println("Você só pode andar de carro.");
                break;
            case "C":
                System.out.println("Pode dirigir Carros, Caminhões e Caminhonetes.");
                break;
            case "D":
                System.out.println("Pode dirigir Carros, Caminhões, Caminhonetes e Ônibus.");
                break;
            case "E":
                System.out.println("Pode dirigir Carros, Caminhões, Caminhonetes, Ônibus e realizar transporte de cargas.");
                break;
            default:
                System.out.println("Categoria inválida.");
        }
    }
}

