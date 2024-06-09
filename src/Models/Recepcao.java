package Models;
import java.util.Scanner;
public class Recepcao extends Funcionario {

    public Recepcao(String nome, int identificador){
        super(nome, identificador);
    }




    public int Recepciona(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, bem-vindo ao restaurante restaurante, o restaurante!\n Irá ser uma mesa para quantas pessoas?");
        int n = sc.nextInt();
        return n;
    }
}
