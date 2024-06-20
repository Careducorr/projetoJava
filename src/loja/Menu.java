package loja;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import loja.produtos.Hidratantes;
import loja.produtos.Perfumes;
import loja.produtos.Produtos;

public class Menu {

    private static List<Produtos> listaProdutos = new ArrayList<>();
    private static List<Produtos> carrinho = new ArrayList<>();

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        listaProdutos.add(new Perfumes("Malbec", 199.00));
        listaProdutos.add(new Perfumes("Egeo", 159.00));
        listaProdutos.add(new Perfumes("Kaiak", 99.00));
        listaProdutos.add(new Perfumes("Quasar", 199.00));
        listaProdutos.add(new Hidratantes("Hidratante Coporal", 40.00));
        listaProdutos.add(new Hidratantes("Hidratante para Mãos", 30.00));
        listaProdutos.add(new Hidratantes("Hidratante para Pés", 10.00));

        while (true) {
            exibirMenu();

            try {
                int opcao = leia.nextInt();
                switch (opcao) {
                    case 1:
                        listarProdutos();
                        break;
                    case 2:
                        adicionarAoCarrinho(leia);
                        break;
                    case 3:
                        verProdutosAdicionados();
                        break;
                    case 4:
                        removerItemDoCarrinho(leia);
                        break;
                    case 5:
                        finalizarCompra();
                        break;
                    case 6:
                        System.out.println("\nPrograma encerrado!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nOpção inválida!!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nErro: Opção inválida. Digite um número válido.");
                leia.nextLine(); // Limpar o buffer do scanner
            }
        }
    }

    private static void exibirMenu() {
        System.out.println(" ");
        System.out.println("                O BOOTCÁRIO                          ");
        System.out.println(" ");
        System.out.println("*****************************************************");
        System.out.println(" ");
        System.out.println("            1 - LISTA DE PRODUTOS                    ");
        System.out.println("            2 - ADICIONAR AO CARRINHO                ");
        System.out.println("            3 - VER PRODUTOS ADICIONADOS AO CARRINHO ");
        System.out.println("            4 - REMOVER UM ITEM DO CARRINHO          ");
        System.out.println("            5 - FINALIZAR COMPRA                     ");
        System.out.println("            6 - SAIR                                 ");
        System.out.println("Entre com a opção desejada:                          ");
    }

    private static void listarProdutos() {
        System.out.println(" ");
        System.out.println("Lista de Produtos Disponíveis:");
        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.print((i + 1) + " - ");
            listaProdutos.get(i).mostrarDetalhes();
        }
    }

    private static void adicionarAoCarrinho(Scanner leia) {
        listarProdutos();
        System.out.print("\nEscolha o número do produto que deseja adicionar ao carrinho: ");
        try {
            int escolha = leia.nextInt();
            if (escolha > 0 && escolha <= listaProdutos.size()) {
                carrinho.add(listaProdutos.get(escolha - 1));
                System.out.println("Produto adicionado ao carrinho!");
            } else {
                System.out.println("Opção inválida!");
            }
        } catch (InputMismatchException e) {
            System.out.println("\nErro: Opção inválida. Digite um número válido.");
            leia.nextLine();
        }
    }

    private static void verProdutosAdicionados() {
        System.out.println(" ");
        System.out.println("Produtos no Carrinho:");
        for (int i = 0; i < carrinho.size(); i++) {
            System.out.print((i + 1) + " - ");
            carrinho.get(i).mostrarDetalhes();
        }
    }

    private static void removerItemDoCarrinho(Scanner leia) {
        verProdutosAdicionados();
        System.out.print("\nEscolha o número do produto que deseja remover do carrinho: ");
        try {
            int escolha = leia.nextInt();
            if (escolha > 0 && escolha <= carrinho.size()) {
                carrinho.remove(escolha - 1);
                System.out.println("Produto removido do carrinho!");
            } else {
                System.out.println("Opção inválida!");
            }
        } catch (InputMismatchException e) {
            System.out.println("\nErro: Opção inválida. Digite um número válido.");
            leia.nextLine();
        }
    }

    private static void finalizarCompra() {
        System.out.println("Compra finalizada!");
        carrinho.clear();
    }
}