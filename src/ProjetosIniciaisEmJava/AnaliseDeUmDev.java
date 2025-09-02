package ProjetosIniciaisEmJava;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AnaliseDeUmDev {
    public  static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         NumberFormat formatadorDeMoedaBr = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
         System.out.println("======= seja bem vindo dev =======".toUpperCase());
         System.out.print("Qual Seu nome?");

         String nomeDoUsuario = scanner.nextLine();
         System.out.print("Qual sua idade?");
         int idadeDoUsuario = scanner.nextInt(); scanner.nextLine();

         System.out.print("Qual sua senioriade?");
         String Senioridade = scanner.nextLine();
         System.out.print("Qual sua faixa salarial R$ " );
         double faixaDeSalario = scanner.nextDouble();
         System.out.println("Sua senioridade é " + Senioridade);
         double calculoAnualDeSalarioDev = faixaDeSalario * 12;
         if (faixaDeSalario >= 15000 && faixaDeSalario < 18000){
             System.out.println("Dev Classe Alta , Enriqueceu !!!, ganha  por ano " +formatadorDeMoedaBr.format(calculoAnualDeSalarioDev) );

        }else if (faixaDeSalario >= 4500 && faixaDeSalario < 8000) {
             System.out.println("Dev Classe Média, Estude se quiser ser rico, Voce ganha por ano: " +formatadorDeMoedaBr.format(calculoAnualDeSalarioDev));
         }else{
             System.out.println(("Dev Classe Baixa, Estude e mais para alcançar coisas maiores na sua vida não se acomode,Voce ganha aproximadamente por ano: " +formatadorDeMoedaBr.format(calculoAnualDeSalarioDev)));









         }







    }

}