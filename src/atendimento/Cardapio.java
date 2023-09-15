package atendimento;

import app.Console;
import java.util.ArrayList;
import produto.*;


public class Cardapio implements Console {
    private String nome_pizzaria;
    private ArrayList<Pizza> pizzas = new ArrayList();
    private ArrayList<Bebida> bebidas = new ArrayList();

    public Cardapio() {
    }
    
    
    public Cardapio(String nome_pizzaria) {
        this.nome_pizzaria = nome_pizzaria;
    }

    public String getNome_pizzaria() {
        return nome_pizzaria;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setNome_pizzaria(String nome_pizzaria) {
        this.nome_pizzaria = nome_pizzaria;
    }

    public void setPizzas(Pizza p) {
        this.pizzas.add(p);
    }

    public void setBebidas(Bebida b) {
        this.bebidas.add(b);
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
