package Models;

public class Caixa extends Funcionario {

    public Caixa(String nome, int indentificador) {
        super(nome, indentificador);
    }

    public void FinalizaAtendimento(Mesa mesa, Pagamento pagamento){
        pagamento.pagar(mesa);
    }
    public void mostraConta(Mesa mesa){
        System.out.println("Os itens consumidos foram:");
        for(int i = 0; i< mesa.getPedidos().size(); i++){
            System.out.println(mesa.getPedidos().get(i).getItem().getNome());
        }
        System.out.println("O total deu R$" + mesa.getConta());
    }
}
