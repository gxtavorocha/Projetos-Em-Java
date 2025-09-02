package ProjetosDeJavaDo0aoAvançado;

import java.util.Scanner;

public class SomaDeDoisNumerosInteiros {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero:");
        int numero1 = scanner.nextInt();
        System.out.print("Digite um outro numero:");
        int numero2 = scanner.nextInt();
        int calculoDaSoma = numero1 + numero2;
        System.out.println("O 1° Numero digitado foi: " + numero1);
        System.out.println("O 2° Numero digitado foi: " + numero2);
        System.out.println("A Soma desses dois numeros é " +calculoDaSoma);




    }



 }