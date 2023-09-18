package app;

import java.util.ArrayList;
import java.util.Scanner;
import atendimento.*;
import produto.*;

public class Main {

    public static void main(String[] args) {
        String confirmacao = "s";
        char opcao;
        ArrayList<Pedido> pedidos_cozinha = new ArrayList();

        Scanner input = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();

        System.out.println("\t---Bem vindo ao " + cardapio.getNome_pizzaria() + "!---");

        do {
            System.out.println("Selecione uma opção");
            System.out.println("1 - Cadastrar Pedido(com Cardápio) / 2 - Cadastrar uma Pizza / 3 - Cadastrar Bebida / 4 - Mostrar pedido em preparamento cozinha 5 - Sair");
            opcao = input.next().charAt(0);

            switch (opcao) {
                case '1':
                    do {
                        confirmacao = "s";

                        Pedido pedido = new Pedido();

                        System.out.println("\n1. Cadastre um Pedido");
                        System.out.println("Número da mesa:");
                        pedido.setMesa(input.next());
                        cardapio.imprimir();
                        System.out.println("\nSelecione o sabor da pizza pelo índice:");
                        pedido.setPizza_pedido(cardapio.getPizzas().get(input.nextInt()));
                        System.out.println("Selecione a bebida pelo índice:");
                        pedido.setBebida_pedido(cardapio.getBebidas().get(input.nextInt()));

                        System.out.println("Pedido Feito com sucesso!");
                        //parametro para receber e calcular os valores da pizza e bebida
                        pedido.imprimir(pedido);
                        //Adicionando fila de pedidos
                        pedidos_cozinha.add(pedido);

                        System.out.println("Cadastrar novo pedido? s/n");
                        confirmacao = input.next();

                    } while (confirmacao.equals("s"));
                    break;
                case '2':
                    do {
                        confirmacao = "s";

                        Pizza pizza = new Pizza();

                        System.out.println("\n2. Cadastre uma pizza");
                        System.out.println("Nome da pizza:");
                        pizza.setNome(input.next());
                        System.out.println("Tamanho de pizza:");
                        pizza.setTamanho(input.nextInt());
                        System.out.println("Preço da pizza:");
                        pizza.setPreco(input.nextDouble());
                        System.out.println("Tipo de sabor da pizza:");
                        pizza.setTipo_sabor(input.next());
                        System.out.println("Igredientes da pizza:");
                        //peggar texto com espaço
                        input.nextLine();
                        String g = input.nextLine();
                        pizza.setIngredientes(g);

                        cardapio.addPizzas(pizza);

                        System.out.println("Cadastrar nova pizza? s/n");
                        confirmacao = input.next();

                    } while (confirmacao.equals("s"));
                    break;
                case '3':
                    do {
                        confirmacao = "s";

                        Bebida bebida = new Bebida();

                        System.out.println("\n3. Cadastre uma bebida");
                        System.out.println("Nome da bebida:");
                        //peggar texto com espaço
                        input.nextLine();
                        String m = input.nextLine();
                        bebida.setNome(m);
                        System.out.println("Quantidade da bebida(ml):");
                        bebida.setMl(input.nextDouble());
                        System.out.println("Preço da bebida:");
                        bebida.setPreco(input.nextDouble());

                        cardapio.addBebidas(bebida);

                        System.out.println("Cadastrar nova bebida? s/n");
                        confirmacao = input.next();

                    } while (confirmacao.equals("s"));
                    break;
                case '4':

                    System.out.println("COZINHA");
                    System.out.println("Sendo preparado no momento:\n"
                            + "\nPEDIDO MESA " + pedidos_cozinha.get(0).getMesa()
                            + "\nPizza:" + pedidos_cozinha.get(0).getPizza_pedido().getNome()
                            + "\nIgredientes:" + pedidos_cozinha.get(0).getPizza_pedido().getIngredientes().get(0)
                            + "\nBebida:" + pedidos_cozinha.get(0).getBebida_pedido().getNome()
                            + "\nValor Total:R$" + pedidos_cozinha.get(0).totalPedido(0, pedidos_cozinha.get(0).getPizza_pedido().getPreco(), pedidos_cozinha.get(0).getBebida_pedido().getPreco()));
                    System.out.println();

                    break;
                default:
                    System.out.println("Opção Inválida.");
            }

        } while (opcao != '5');

    }

}
