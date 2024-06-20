package loja.produtos;

public class Hidratantes extends Produtos{

	public Hidratantes(String nome, double preco) {
		super(nome, preco);
	}
	
	 @Override
	    public void mostrarDetalhes() {
	        System.out.println("Hidratante: " + nome +", Preço: R$" + preco);
	    }
}
