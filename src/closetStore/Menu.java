package closetStore;

import closet.model.SapatoSocial;
import closet.model.TenisDeCorrida;
import closetController.Controller;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao, numero, tipo;
        String nome;
        float preco;

        Controller shoes = new Controller();

        System.out.println("\nCriar produto Tênis\n");

        TenisDeCorrida Tc1 = new TenisDeCorrida(1,"Nike",450f, "Air Max");
        shoes.cadastrar(Tc1);

        TenisDeCorrida Tc2 = new TenisDeCorrida(2,"Adidas",250f,54,1, "SuperStar");
        shoes.cadastrar(Tc2);

        SapatoSocial Ss1 = new SapatoSocial(3,"Lacoste",850f,75, "SuperCasual");
        shoes.cadastrar(Ss1);

        SapatoSocial Ss2 = new SapatoSocial(4,"Tommy Hilfiger",600f,85, "ModeloPaly");
        shoes.cadastrar(Ss2);

        shoes.listarTodas();

        while(true) {
            System.out.println("**********************************************");
            System.out.println("                                              ");
            System.out.println("       Seja bem vindo a Closet Brasil!!!"      );
            System.out.println("                                              ");
            System.out.println("**********************************************");
            System.out.println("          Selecione a opção desejada:         ");
            System.out.println("**********************************************");
            System.out.println("        1 - Cadastrar produto"                 );
            System.out.println("        2 - Exibir todos os produtos"          );
            System.out.println("        3 - Encontrar produto por número"      );
            System.out.println("        4 - Atualizar produto"                 );
            System.out.println("        5 - Apagar produto"                    );
            System.out.println("        6 - Sair"                              );
            System.out.println("**********************************************");

            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                sc.nextLine();
                opcao = 0;
            }

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
                    System.out.println("Criar Conta\n\n");

                    System.out.println("Digite o numero do produto: ");
                    numero = sc.nextInt();
                    System.out.println("Digite a marca do produto: ");
                    sc.skip("\\R?");
                    nome = sc.nextLine();

                    do {
                        System.out.println("Digite o Tipo do produto (1-Tênis de Corrida ou 2-Sapato Social): ");
                        tipo = sc.nextInt();
                    } while (tipo < 1 && tipo > 2);

                    System.out.println("Digite o valor do produto (R$): ");
                    preco = sc.nextFloat();

                    switch (tipo) {
                        case 1 -> {
                            System.out.println("Digite");
                            shoes.cadastrar(new TenisDeCorrida(shoes.gerarNumero(), numero, nome, preco, tipo));
                        }
                    }
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
