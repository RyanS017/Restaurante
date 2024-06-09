package Models;

public class Caixa extends Funcionario {

    public Caixa(String nome, int indentificador) {
        super(nome, indentificador);
    }

    public void FinalizaAtendimento(Mesa mesa, Pagamento pagamento){
        pagamento.pagar(mesa);

    }
}
