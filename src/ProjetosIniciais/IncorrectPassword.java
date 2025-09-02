package ProjetosIniciais;

import java.util.Scanner;

public class IncorrectPassword {
    public static void main(String[] args) {
    /*
        Esse Programa verifica qual a senha que o usuario digita , e se o numero for diferente de 2022
        o programa exibe senha invalida e pede a senha novamente, caso a senha seja 2022 exibe Acesso permitido
     */
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha:");
        int senha = sc.nextInt();
        sc.nextLine();

        while (senha != 2022) {
            System.out.println("Senha invalida");

            System.out.print("Digite novamente:");
            int senhaDoWHile = sc.nextInt(); sc.nextLine();
            if (senhaDoWHile == 2022) {
                System.out.println("Acesso Permitido");
                break;
            }
        }
    }
}
