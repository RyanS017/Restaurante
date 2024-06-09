package Models;

public class PagamentoPix implements Pagamento{

    @Override
    public void pagar(Mesa mesa){
        System.out.println("O pix é o cnpj: 12.456.254/0001-02  \nO pix de R$" + mesa.getConta() + " foi realizado com sucesso");
    }
}
