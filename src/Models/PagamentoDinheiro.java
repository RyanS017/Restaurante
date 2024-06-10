package Models;

import java.util.Scanner;

public class PagamentoDinheiro implements Pagamento{

    @Override
    public void pagar(Mesa mesa){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que você está entregando: ");
        double dinheiro =sc.nextDouble();
        do{
            System.out.println("O dinehrio não é o suficiente, porfavor digite novamente: ");
            dinheiro = sc.nextDouble();
        }while(dinheiro < mesa.getConta());
        if(dinheiro > mesa.getConta()) {
            double troco = dinheiro - mesa.getConta();
            System.out.println("Aqui está o seu troco de R$" + troco + ". Muito obrigado, tenha um bom dia.");
        }
    }
}
