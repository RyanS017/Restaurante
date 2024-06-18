package Models;
import java.util.Scanner;
public class Recepcao extends Funcionario {

    public Recepcao(String nome, int identificador){
        super(nome, identificador);
    }




    public int Recepciona(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, bem-vindo ao restaurante OOP, o orientado!\nIrá ser uma mesa para quantas pessoas?");
        int n = sc.nextInt();
        return n;
    }

    public void levaMesa(Mesa mesa){
        System.out.println("Sua mesa será a mesa " + mesa.getId() + " Por aqui, por favor.\nO garçom logo virá atende-los");
    }
}
