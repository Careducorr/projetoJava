package loja.produtos;

public abstract class Produtos {

    protected String nome;
    protected double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void mostrarDetalhes();
	
}
