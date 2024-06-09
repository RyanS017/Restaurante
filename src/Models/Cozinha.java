package Models;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Cozinha extends Funcionario {
    private Queue<Pedido> pedidos;

    public Cozinha(String nome, int indentificador) {
        super(nome, indentificador);
        this.pedidos = new ConcurrentLinkedQueue<Pedido>();
    }

    public void RecebePedidos(ArrayList<Pedido> p){
        p.forEach(x ->{
            x.setEstado(EstadoPedido.FAZENDO);
            pedidos.add(x);
        });
        System.out.println("Os pedidos estão sendo feitos!");
    }

    public void entregaPedido(){
        if(!pedidos.isEmpty()) {
            pedidos.poll().setEstado(EstadoPedido.FEITO);
        }
    }

}
