package Aplicação;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        while(true) {

            System.out.println("Seja bem vindo a Closet Brasil!!!");
            System.out.println("Selecione o produto desejado: ");
            System.out.println("**********************************************");
            System.out.println("        1 - Cadastrar produto");
            System.out.println("        2 - Exibir produto");
            System.out.println("        3 - Encontrar produto por número");
            System.out.println("        4 - Atualizar produto");
            System.out.println("        5 - Apagar prduto");
            System.out.println("        6 - Sair");
            System.out.println("**********************************************");

            opcao = sc.nextInt();

            if (opcao == 6) {
                System.out.println("***************************************************");
                System.out.println("\nCloset Brasil - Obrigado pela preferência!");
                sobre();
                sc.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    // Cadastrar

                    keyPress();
                    break;
                case 2:
                    // Exibir Produto

                    keyPress();
                    break;
                case 3:
                    // Econtrar produto

                    keyPress();
                    break;
                case 4:
                    // Atualizar produto

                    keyPress();
                    break;
                case 5:
                    // Apagar um produto

                    keyPress();
                    break;
                default:
                    System.out.println("\nOpção Inválida!");
            }
        }


    }

    public static void sobre() {
        System.out.println("\n*****************************************************");
        System.out.println("Projeto Desenvolvido por: ");
        System.out.println("Lucas Carlos Batista - lucassscarlosss54@gmail.com");
        System.out.println("github.com/lucascarl011");
        System.out.println("*******************************************************");
    }

    private static void keyPress() {
        try {
            System.out.println("\nPressione Enter para Seguir...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você não pressionou Enter!");
        }
    }
}
