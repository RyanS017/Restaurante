package Models;

import java.util.Scanner;

public class CartaoDebito implements Pagamento{

    @Override
    public void pagar(Mesa mesa){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pode inserir o cartão, e digite a senha:");
        sc.nextLine();
        System.out.println("O pagamento de R$" + mesa.getConta() + " Foi realizado com sucesso!");
    }
}
