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
        this.nome_pizzaria = "Pizza Planet";
        this.pizzas.add(mussarela);
        this.pizzas.add(marguerita);
        this.pizzas.add(calabresa);
        this.pizzas.add(frango);
        this.pizzas.add(portuguesa);
        this.pizzas.add(banana);
        this.pizzas.add(chocolate);
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
    
    //Pizzas Disponiveis
    Pizza mussarela = new Pizza("Mussarela",24.90,"salgada","mussarela,orégano e azeitona");
    Pizza marguerita = new Pizza("Marguerita",24.90,"salgada","mussarela,tomate, orégano e manjerição");
    Pizza calabresa = new Pizza("Calabresa",24.90,"salgada","mussarela,calabresa,azeitona preta e oregano");
    Pizza frango = new Pizza("Frango",29.90,"salgada","mussarela,frango,catupiry,tomate e orégano");
    Pizza portuguesa = new Pizza("Portuguesa",29.90,"salgada","mussarela,presunto,ervilha,ovo,tomate,cebola e orégano");
    Pizza banana  = new Pizza("Banana",31.90,"doce","mussarela,creme de leite,banana e canela");
    Pizza chocolate = new Pizza("Chocolate",32.90,"doce","nutella,morango e brigadeiro");
     
    @Override
    public void imprimir() {       
    }   
    
}
