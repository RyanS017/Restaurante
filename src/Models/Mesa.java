package Models;

import java.util.ArrayList;

public class Mesa {
    private ArrayList<Pedido> pedidos;
    private double conta;
    private int id;
    private int lugares;
    private int pessoas;

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mesa(int id, int lugares) {
        this.id = id;
        this.lugares = lugares;
        this.conta = 0.0;
        pedidos = new ArrayList<Pedido>();
    }

    public void adicionaPedido(Pedido pedido){
        this.conta += pedido.getItem().getPreco();
        pedidos.add(pedido);
    }

    public void adicionaPessoas(int p){
        this.pessoas = p;
    }
}
