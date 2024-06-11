package Models;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Garcom extends Funcionario {

    private ArrayList<Item> cardapio = new ArrayList<Item>();
    private ArrayList<Pedido> pedidos;
    public Garcom(String nome, int indentificador){
        super(nome,indentificador);
        cardapio = new ArrayList<Item>();
        pedidos = new ArrayList<Pedido>();
        inserirCardapio();
    }

    private void inserirCardapio(){
        this.cardapio.add(new Item("Contra-file", 25.00,"Arroz, feijão, fritas, contra-file grelhado"));
        this.cardapio.add(new Item("Filé de Frango", 22.00,"Arroz, feijão, fritas, Filé de frango grelhado"));
        this.cardapio.add(new Item("Calabresa", 20.00,"Arroz, feijão, fritas, calabresa"));
        this.cardapio.add(new Item("File de Merluza", 23.00,"Arroz, feijão, fritas, Filé de Merluza grelhado"));
        this.cardapio.add(new Item("Strogonoff de Frango", 27.00,"Arroz, batsta palha, Strogonoff de Frango"));
        this.cardapio.add(new Item("Coca-Cola 2L", 15.00,"Coca-Cola 2L"));
        this.cardapio.add(new Item("Guaraná 2L", 14.00,"Guaraná 2L"));
        this.cardapio.add(new Item("Água 500mL", 5.00,"Água 500mL"));
        this.cardapio.add(new Item("Suco de Maracujá", 15.00,"Suco de Maracujá 1L"));
        this.cardapio.add(new Item("Salada de Fruta", 11.00,"Salada com banana, maçã, melão e uva"));
        this.cardapio.add(new Item("Pudim", 10.00,"1 fatia de pudim"));
        this.cardapio.add(new Item("Bolo de Chocolate", 15.00,"1 fatia de bolo de chocolate"));
    }

    public void mostraCardapio(){
        cardapio.forEach(x ->{
            System.out.println("\u001B[31m" + x.getNome() + "\u001B[0m" + "      Descrição: " + x.getDescricao() + "\u001B[34m" + "\n  Preço: " + x.getPreco() + "\u001B[0m");
        });
    }

    public int anotaPedido(Mesa mesa){
        int n = pedidos.size();
        System.out.println("\nQual vai ser o pedido, por favor escreva o nome do item.");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        if(nome.equalsIgnoreCase("1")) return 1;
        cardapio.forEach(x -> {
            if(nome.equalsIgnoreCase(x.getNome())){
                Pedido p = new Pedido(x, mesa);
                pedidos.add(p);
                mesa.adicionaPedido(p);
                System.out.println("Pedido feito.");
            }
        });
        if(pedidos.size() == n){
            System.out.println("Esse item não existe");
        }
        return 0;
    }

    public ArrayList<Pedido> entregaPedidoCozinha(){
        return pedidos;
    }

    public void entregaPedidoMesa(){
        System.out.println("Aqui está o pedido");
    }

}
