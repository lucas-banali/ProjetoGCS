/* Atividade de Gestão e configuração de software
* Lucas Banalli
* Daniel Oleinik
* Nicolas Mulder
* Thiago Vicente
* */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        while(opcao != 9) {

            System.out.println("**** MENU ****");
            System.out.println("(1) Listar cardápio");
            System.out.println("(2) Escolher item do pedido");
            System.out.println("(3) Deletar item do pedido");
            System.out.println("(4) Ler pedido\n");
            System.out.println("(5) Concluir pedido\n");
            System.out.println("(6) Pagar pedido\n");
            System.out.println("(9) Sair\n");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            if(opcao == 1) {
                SingletonBD.listarCardapio();
            }
            else if(opcao == 2) {
                SingletonBD.escolherPedido();
            }
            else if(opcao == 3) {
                SingletonBD.deletarPedido();
            }
            else if(opcao == 4) {
                SingletonBD.lerPedido();
            }
            else if(opcao == 5) {
                SingletonBD.concluirPedido();
            }
            else if(opcao == 6) {
                SingletonBD.pagarPedido();
            }
            else if(opcao == 9) {
                System.exit(0);
            }
            else{
                System.out.println("\n\n\n\n\n\n\n\n\n");
            }
        }
    }
}