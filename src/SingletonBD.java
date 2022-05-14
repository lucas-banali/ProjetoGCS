import java.util.ArrayList;
import java.util.Scanner;

public class SingletonBD {

    private static ArrayList<Item> listaUsuario = new ArrayList<Item>();

    private SingletonBD() { }

    public static void listarCardapio(){

        System.out.println("**** Cardápio de comida mexicana ****: \n\n\n\n\n\n");
        System.out.println("(1) Guacamole\n");
        System.out.println("(2) Chile\n");
        System.out.println("(3) Tacos\n");
        System.out.println("(4) Sour Cream\n");
        System.out.println("(9) Sair\n");
        
    }

    public static void escolherPedido(){

        int pedido =0;
        while(pedido != 9) {
            Scanner sc = new Scanner(System.in);
            System.out.println("**** Escolha 1 Item ****");
            System.out.println("(1) Guacamole");
            System.out.println("(2) Chile");
            System.out.println("(3) Tacos");
            System.out.println("(4) Sour Cream\n");
            System.out.println("(9) Sair\n");
            System.out.print("Opção: ");
            pedido = sc.nextInt();

            switch (pedido) {
                case 1:
                    System.out.println("Não temos esse item");
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Não temos esse item");
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Não temos esse item");
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("Não temos esse item");
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.println("Saindo");

                    System.out.println("\n\n\n\n\n\n\n\n\n");
                    break;
                default:
                    System.out.println("Não identificado -Saindo");

                    System.out.println("\n\n\n\n\n\n\n\n\n");
                break;
            }
        }
    }

    public static void deletarPedido(){
        System.out.println("Pedido deletado com sucesso!\n");
    }

    public static void lerPedido(){
        System.out.println("Pedimos desculpas, mas volte mais tarde - ERROR 500!\n");
    }

    public static void pagarPedido(){
        int modo_pagamento =0;
        while(modo_pagamento != 9) {
            Scanner sc = new Scanner(System.in);
            System.out.println("**** Escolha modo de pagamento ****");
            System.out.println("(1) Débito");
            System.out.println("(2) Crédito");
            System.out.println("(3) Dinheiro no caixa");
            System.out.println("(9) Sair\n");
            System.out.print("Opção: ");
            modo_pagamento = sc.nextInt();

            switch (modo_pagamento) {
                case 1:
                    System.out.println("Insira o cartão de débito, cofirme o valor e digite sua senha");
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Insira o cartão de crédito, cofirme o valor e digite sua senha");
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Dirija-se ao caixa para pagar");
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.println("Saindo");
                    System.out.println("\n\n\n\n\n\n\n\n\n");
                    break;
                default:
                    System.out.println("Não identificado - Dirija-se ao caixa para pagar");
                    System.out.println("\n\n\n\n\n\n\n\n\n");
                    break;
            }
        }
    }
}