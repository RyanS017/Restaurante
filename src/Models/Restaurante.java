package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Restaurante {
    private Caixa caixa;
    private Cozinha cozinha;
    private Garcom garcom;
    private Recepcao recepcao;
    private ArrayList<Mesa> mesas;
    private Map<String, Pagamento> pagamentos;

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Cozinha getCozinha() {
        return cozinha;
    }

    public void setCozinha(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }

    public Recepcao getRecepcao() {
        return recepcao;
    }

    public void setRecepcao(Recepcao recepcao) {
        this.recepcao = recepcao;
    }


    public Restaurante(){
        this.caixa = new Caixa("Marlene", 1);
        this.cozinha = new Cozinha("Antonio", 2);
        this.garcom = new Garcom("Lorenzo", 3);
        this.recepcao = new Recepcao("Maria", 4);
        this.mesas = preencheMesa();
        this.pagamentos = preenchePagamentos();
    }

    private ArrayList<Mesa> preencheMesa(){
        ArrayList<Mesa> m = new ArrayList<>();
        for(int i = 1; i <= 7; i++){
            m.add(new Mesa(i, 10));
        }
        return m;
    }
    private HashMap<String, Pagamento> preenchePagamentos(){
        HashMap<String, Pagamento> p = new HashMap<String, Pagamento>();
        p.put("debito", new PagamentoDebito());
        p.put("pix", new PagamentoPix());
        p.put("dinheiro", new PagamentoDinheiro());
        return p;
    }

    public  void atendimento(){
        Scanner sc = new Scanner(System.in);
        int p = this.recepcao.Recepciona();
        Mesa m = mesas.get(0);
        m.adicionaPessoas(p);
        this.recepcao.levaMesa(m);
        System.out.println("Pressione enter para continuar!");
        sc.nextLine();
        garcomPedidos(m);
        this.cozinha.RecebePedidos(this.garcom.entregaPedidoCozinha());
        System.out.println("Pressione enter para continuar!");
        sc.nextLine();
        this.cozinha.entregaPedido();
        System.out.println("Pressione enter para continuar!");
        sc.nextLine();
        this.garcom.entregaPedidoMesa();
        System.out.println("Pressione enter se já acabou de comer e deseja ir ao caixa pagar!");
        sc.nextLine();
        caixa.mostraConta(m);
        this.caixa.FinalizaAtendimento(m, escolhePagamento());
    }

    private Pagamento escolhePagamento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a opção de pagamento: debito/pix/dinheiro");
        String p = sc.nextLine();
        if(pagamentos.containsKey(p)) return pagamentos.get(p);
        do{
            System.out.println("por favor escolha uma opção de pagamento válida: debito/pix/dinheiro");
            p = sc.nextLine();
        }while(!this.pagamentos.containsKey(p));
        return this.pagamentos.get(p);
    }

    private void garcomPedidos(Mesa m){
        this.garcom.mostraCardapio();
        int s = 0;
        do {
            System.out.println("\nCaso não queira mais pedir nada, por favor digite 1");
            s = garcom.anotaPedido(m);
        }while(s != 1);
    }
}
