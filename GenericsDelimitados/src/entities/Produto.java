package entities;
public class Produto implements Comparable<Produto> {

    //A classe produto implementa a interface Comparable para ser possivel ultilizar o metodo compareTo
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + ", " + String.format("%.2f", preco);
    }

    @Override
    public int compareTo(Produto other) {
        return Double.compare(this.preco, other.getPreco());
    }
    

}
