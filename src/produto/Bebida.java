package produto;

import app.Console;

public class Bebida  implements Console {
    private String nome;
    private double ml;
    private double preco;

    public Bebida() {
    }

    public Bebida(String nome, double ml, double preco) {
        this.nome = nome;
        this.ml = ml;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getMl() {
        return ml;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMl(double ml) {
        this.ml = ml;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void imprimir() {
        System.out.println("\nBebida");
        System.out.println("\nNome:" + this.nome 
                + "\nQuantidade:" + this.ml  + " ml" 
                + "\nPreço:" + this.preco);
    }    
}
