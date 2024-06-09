package Models;

public class Pedido {
    private Item item;
    private Mesa mesa;
    private EstadoPedido estado;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Pedido(Item item, Mesa mesa) {
        this.item = item;
        this.mesa = mesa;
        this.estado = EstadoPedido.ENVIADO;
    }
}
