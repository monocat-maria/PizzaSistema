package atendimento;

import app.Console;
import produto.*;

public class Pedido {
    private String mesa;
    private Pizza pizza_pedido;
    private Bebida bebida_pedido;

    public Pedido() {
    }

    public Pedido(String mesa, Pizza pizza_pedido, Bebida bebida_pedido) {
        this.mesa = mesa;
        this.pizza_pedido = pizza_pedido;
        this.bebida_pedido = bebida_pedido;
    }

    public String getMesa() {
        return mesa;
    }

    public Pizza getPizza_pedido() {
        return pizza_pedido;
    }

    public Bebida getBebida_pedido() {
        return bebida_pedido;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public void setPizza_pedido(Pizza pizza_pedido) {
        this.pizza_pedido = pizza_pedido;
    }

    public void setBebida_pedido(Bebida bebida_pedido) {
        this.bebida_pedido = bebida_pedido;
    }
    
    public double totalPedido(double totalPedido, double valor_pizza,double valor_bebida){
        valor_pizza = this.pizza_pedido.getPreco();
        valor_bebida = this.bebida_pedido.getPreco();
        totalPedido  = valor_pizza + valor_bebida;
        return totalPedido;
    }

    public void imprimir(Pedido p) {
        System.out.println("\t--Pedido mesa " + this.mesa + "--");
        System.out.println("\nPizza: " +  this.pizza_pedido.getNome() + " (R$" + this.pizza_pedido.getPreco() + ")" 
                + "\nBebida:" + this.bebida_pedido.getNome() + " (R$" + this.bebida_pedido.getPreco() + ")" 
                +  "--------------------------------------------------------------" 
                + "\nValor Total: R$" + p.totalPedido(0, this.pizza_pedido.getPreco(), this.bebida_pedido.getPreco()));               
    }
}
