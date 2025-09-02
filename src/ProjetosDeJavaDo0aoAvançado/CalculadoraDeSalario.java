package ProjetosDeJavaDo0aoAvançado;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class CalculadoraDeSalario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NumberFormat formatadorDeMoedaBr = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Seja Bem vindo ao Calculador De Salário");
        System.out.println("--------------------------------------------");

        System.out.print("Digite o nome do funcionário: ");
        String UsuarioInsereNome = scanner.nextLine().toUpperCase();

        System.out.printf("Dias trabalhados de %s: ", UsuarioInsereNome);
        int DiasTrabalhados = scanner.nextInt(); scanner.nextLine();

        System.out.printf("Quantas Horas por dia %s Trabalha: ", UsuarioInsereNome);
        int horasTrabalhadas = scanner.nextInt(); scanner.nextLine();

        // total de horas no mês
        double horasTrabalhadasMensais = DiasTrabalhados * horasTrabalhadas;

        // salário por hora
        System.out.printf("Digite Quanto o %s ganha por hora:",UsuarioInsereNome);
        double ganhoPorHora = scanner.nextDouble(); scanner.nextLine();

        double ValorParaReceber = ganhoPorHora * horasTrabalhadasMensais;
        System.out.printf("o funcionário %s tem a receber "+ formatadorDeMoedaBr.format((ValorParaReceber)),UsuarioInsereNome);



    }
}





