package closetStore;

import closetModel.SapatoSocial;
import closetModel.Shoes;
import closetModel.TenisDeCorrida;
import closetController.Controller;

import java.io.IOException;
import java.util.InputMismatchException;
import util.Colors;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao, numero, tipo;
        String cliente, marca, modelo;
        double preco;

        Controller shoes = new Controller();

        TenisDeCorrida Tc1 = new TenisDeCorrida(shoes.gerarNumero(), "Lucas", "Nike", 550.0, 1, "Corrida");
        shoes.cadastrar(Tc1);

        TenisDeCorrida Tc2 = new TenisDeCorrida(shoes.gerarNumero(), "Diogo", "Adidas", 350.0, 1, "SuperStar");
        shoes.cadastrar(Tc2);

        SapatoSocial Ss1 = new SapatoSocial(shoes.gerarNumero(), "Carlos", "Lacoste", 850.0, 2, "Casual");
        shoes.cadastrar(Ss1);

        SapatoSocial Ss2 = new SapatoSocial(shoes.gerarNumero(), "Antônio", "TommyHilfiger", 1500.0, 2, "Social");
        shoes.cadastrar(Ss2);

        while (true) {
            System.out.println(Colors.TEXT_YELLOW_BOLD + Colors.ANSI_BLACK_BACKGROUND
                    +"**********************************************");
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
            System.out.println("                                              " + Colors.TEXT_RESET);

            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                sc.nextLine();
                opcao = 0;
            }

            if (opcao == 6) {
                System.out.println(Colors.TEXT_WHITE_BOLD + "***************************************************");
                System.out.println("\nCloset Brasil - Obrigado pela preferência!");
                sobre();
                sc.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    // Cadastrar
                    System.out.println(Colors.TEXT_WHITE_BOLD + "Faça seu Cadastro\n\n");

                    System.out.println("Digite o numero do produto: ");
                    numero = sc.nextInt();
                    System.out.println("Digite o nome do cliente: ");
                    sc.skip("\\R?");
                    cliente = sc.nextLine();
                    System.out.println("Digite a marca que deseja: ");
                    marca = sc.nextLine();

                    do {
                        System.out.println("Digite o Tipo do produto (1-Tênis de Corrida ou 2-Sapato Social): ");
                        tipo = sc.nextInt();
                    } while (tipo < 1 && tipo > 2);

                    System.out.println("Digite o valor do produto (R$): ");
                    preco = sc.nextFloat();

                    switch (tipo) {
                        case 1 -> {
                            System.out.println("Digite o modelo de Corrida:");
                            modelo = sc.nextLine();
                            shoes.cadastrar(new TenisDeCorrida(shoes.gerarNumero(), cliente, marca, preco, tipo, modelo));
                            System.out.println("\nO Tênis: " + modelo + " foi criado com sucesso!");
                        }
                        case 2 -> {
                            System.out.println("Digite o modelo de Sapato Social:");
                            modelo = sc.nextLine();
                            shoes.cadastrar(new SapatoSocial(shoes.gerarNumero(), cliente, marca, preco, tipo, modelo));
                            System.out.println("\nO Tênis: " + modelo + " foi criado com sucesso!");
                        }
                    }
                    keyPress();
                    break;
                case 2:
                    // Exibir Produto
                    System.out.println(Colors.TEXT_WHITE_BOLD + "Listar todos os Tênis\n\n");
                    shoes.listarTodas();

                    keyPress();
                    break;
                case 3:
                    // Econtrar produto
                    System.out.println(Colors.TEXT_WHITE_BOLD + "Consultar dados do produto por número");
                    System.out.println("Digite o número do produto: ");
                    numero = sc.nextInt();
                    shoes.procurarPorNumero(numero);

                    keyPress();
                    break;
                case 4:
                    // Atualizar produto
                    System.out.println(Colors.TEXT_WHITE_BOLD + "Digite o número do Produto que deseja atualizar");
                    System.out.println("Digite o número: ");
                    numero = sc.nextInt();
                    Shoes produtoExistente = shoes.buscarNaCollection(numero);

                    if (produtoExistente != null) {
                        System.out.println("Digite o nome do cliente: ");
                        sc.skip("\\R?");
                        cliente = sc.nextLine();
                        System.out.println("Digite a marca que deseja: ");
                        marca = sc.nextLine();
                        System.out.println("Digite o preço do produto: ");
                        preco = sc.nextDouble();
                        do {
                            System.out.println("Digite o Tipo do produto (1-Tênis de Corrida ou 2-Sapato Social): ");
                            tipo = sc.nextInt();
                        } while (tipo < 1 || tipo > 2);

                        switch (tipo) {
                            case 1 -> {
                                System.out.println("Digite o modelo de Corrida:");
                                sc.skip("\\R?");
                                modelo = sc.nextLine();
                                shoes.atualizar(new TenisDeCorrida(numero, cliente, marca, preco, tipo, modelo));
                            }
                            case 2 -> {
                                System.out.println("Digite o modelo do Sapato Social:");
                                sc.skip("\\R?");
                                modelo = sc.nextLine();
                                shoes.atualizar(new SapatoSocial(numero, cliente, marca, preco, tipo, modelo));
                            }
                        }
                    } else {
                        System.out.println("Produto não encontrado!");
                    }

                    keyPress();
                    break;
                case 5:
                    // Apagar um produto
                    System.out.println(Colors.TEXT_WHITE_BOLD + "Apagar Produto");
                    System.out.println("Digite o número do produto que deseja deletar: ");
                    numero = sc.nextInt();

                    shoes.deletar(numero);

                    keyPress();
                    break;
                default:
                    System.out.println(Colors.TEXT_RED_BOLD + "\nOpção Inválida!" + Colors.TEXT_RESET);

                    keyPress();
                    break;
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
            System.out.println(Colors.TEXT_RESET + "\nPressione Enter para Seguir...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você não pressionou Enter!");
        }
    }
}
