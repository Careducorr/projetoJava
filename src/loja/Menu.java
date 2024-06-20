package loja;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

		while(true) {
			System.out.println("                                                     ");
			System.out.println("                O BOOTCÁRIO                          ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - LISTA DE PRODUTOS                    ");
			System.out.println("            2 - ADICIONAR AO CARRINHO                ");
			System.out.println("            3 - VER PRODUTOS ADICIONADOS AO CARRINHO ");
			System.out.println("            4 - REMOVER UM ITEM DO CARRINHO          ");
			System.out.println("            5 - FINALIZAR COMPRA                     ");
			System.out.println("            6 - SAIR                                 ");
			System.out.println("Entre com a opção desejada:                          ");
			int opcao = leia.nextInt();
			
			if (opcao ==6){
				System.out.println("\nPrograma encerrado!");
				System.exit(0);
			}
			
			switch(opcao){
				case 1 -> System.out.println(" ");
				case 2 -> System.out.println(" ");
				case 4 -> System.out.println(" ");
				case 5 -> System.out.println(" ");
				default -> System.out.println("\nOpção inválida!!");
			}
		}
		
	}

}
