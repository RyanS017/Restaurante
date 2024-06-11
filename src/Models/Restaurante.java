package Models;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {
    private Caixa caixa;
    private Cozinha cozinha;
    private Garcom garcom;
    private Recepcao recepcao;
    private ArrayList<Mesa> mesas;

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
    }

    private ArrayList<Mesa> preencheMesa(){
        ArrayList<Mesa> m = new ArrayList<>();
        for(int i = 1; i <= 7; i++){
            m.add(new Mesa(i, 10));
        }
        return m;
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
    }

    private void garcomPedidos(Mesa m){
        this.garcom.mostraCardapio();
        int s = 0;
        do {
            System.out.println("Caso não queira mais pedir nada, por favor digite 1");
            s = garcom.anotaPedido(m);
        }while(s != 1);
    }
}
