package produto;

import app.Console;
import java.util.ArrayList;

public class Pizza implements Console {
    private String nome;
    private int tamanho;
    private double preco;
    private String tipo_sabor;
    private ArrayList <String> ingredientes =  new ArrayList();

    public Pizza() {
    }

    public Pizza(String nome, double preco, String tipo_sabor,String e) {
        this.nome = nome;
        this.tamanho = 35;
        this.preco = preco;
        this.tipo_sabor = tipo_sabor;
        this.ingredientes.add(e);
    }

    public String getNome() {
        return nome;
    }

    public float getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo_sabor() {
        return tipo_sabor;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipo_sabor(String tipo_sabor) {
        this.tipo_sabor = tipo_sabor;
    }

    public void setIngredientes(String i) {
        this.ingredientes.add(i);
    }

    @Override
    public void imprimir() {
        System.out.println("\nPizza");
        System.out.println("\nNome:" + this.nome 
                + "\nTamanho:" + this.tamanho  + " cm" 
                + "\nPreço:" + this.preco 
                + "\nTipo de sabor:" + this.tipo_sabor);
        for(int i = 0;i < this.ingredientes.size();i++){
            System.out.println("Igredientes:" +  this.ingredientes.get(i));
        }
    }   
}
