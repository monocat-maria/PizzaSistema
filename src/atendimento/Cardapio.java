package atendimento;

import app.Console;
import java.util.ArrayList;
import produto.*;


public class Cardapio implements Console {
    private String nome_pizzaria;
    private ArrayList<Pizza> pizzas = new ArrayList();
    private ArrayList<Bebida> bebidas = new ArrayList();
    
    public Cardapio() {
        this.nome_pizzaria = "Pizza Planet";
        this.pizzas.add(mussarela);
        this.pizzas.add(marguerita);
        this.pizzas.add(calabresa);
        this.pizzas.add(frango);
        this.pizzas.add(portuguesa);
        this.pizzas.add(banana);
        this.pizzas.add(chocolate);
        this.bebidas.add(agua);
        this.bebidas.add(coca);
        this.bebidas.add(guarana);
        this.bebidas.add(fanta);
        this.bebidas.add(suco);
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
    
    //Bebidas Disponiveis
    Bebida agua = new Bebida("Água",200,5.00);
    Bebida coca = new Bebida("Coca Cola",350,3.50);
    Bebida guarana = new Bebida("Guaraná Antardida",350,3.50);
    Bebida fanta =  new  Bebida("Fanta Laranja",1000,6.00);
    Bebida suco  =  new Bebida("Suco de Laranja",500,9.00);
    
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
        System.out.println("----Bem Vindo ao " + this.nome_pizzaria  + "!---");
        System.out.println("\n\tCARDÁPIO");
        System.out.println("PIZZAS SALGADAS");
        System.out.println(this.mussarela.getNome() + "     R$" + this.mussarela.getPreco()  
                + "\n" + this.marguerita.getNome() + "    R$" + this.mussarela.getPreco() 
                + "\n" + this.calabresa.getNome() + "     R$" + this.calabresa.getPreco()
                + "\n" + this.frango.getNome() + "        R$" + this.frango.getPreco()
                + "\n" + this.portuguesa.getNome() + "    R$" + this.portuguesa.getPreco()
                + "\n" + this.banana.getNome() + "        R$" + this.banana.getPreco()
                + "\n" + this.chocolate.getNome() + "     R$" + this.chocolate.getPreco());
        System.out.println("\nPIZZAS DOCES");
        System.out.println(this.banana.getNome() + "        R$" + this.banana.getPreco()  
                + "\n" + this.chocolate.getNome() + "     R$" + this.chocolate.getPreco());
        System.out.println("\nBEBIDAS");
        System.out.println(this.agua.getNome() + "                 R$" + this.agua.getPreco()  
                + "\n" + this.coca.getNome() + "            R$" + this.coca.getPreco() 
                + "\n" + this.guarana.getNome() + "    R$" + this.guarana.getPreco()
                + "\n" + this.fanta.getNome() + "        R$" + this.fanta.getPreco()
                + "\n" + this.suco.getNome() + "      R$" + this.suco.getPreco());
    }       
}
