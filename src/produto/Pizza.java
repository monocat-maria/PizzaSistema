package produto;

import java.util.ArrayList;

public class Pizza {
    private String nome;
    private float tamanho;
    private double preço;
    private String tipo_sabor;
    private ArrayList <String> ingredientes =  new ArrayList();

    public Pizza() {
    }

    public Pizza(String nome, float tamanho, double preço, String tipo_sabor) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.preço = preço;
        this.tipo_sabor = tipo_sabor;
    }

    public String getNome() {
        return nome;
    }

    public float getTamanho() {
        return tamanho;
    }

    public double getPreço() {
        return preço;
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

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void setTipo_sabor(String tipo_sabor) {
        this.tipo_sabor = tipo_sabor;
    }

    public void setIngredientes(String i) {
        this.ingredientes.add(i);
    }
    
    
    
    
}
