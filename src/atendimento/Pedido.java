package atendimento;

import produto.Bebida;
import produto.Pizza;

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
    
    public double totalPedido(double totalPedido){
        return totalPedido;
    }
}
