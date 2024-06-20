package loja.produtos;

public class Perfumes extends Produtos{

    public Perfumes(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Perfume: " + nome +", Preço: R$" + preco);
    }
	
}
