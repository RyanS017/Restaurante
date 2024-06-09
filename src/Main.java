import Models.Garcom;
import Models.Mesa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Garcom g1 = new Garcom("João", 201);

        g1.mostraCardapio();
        g1.anotaPedido(new Mesa(1,3));

        }
}
