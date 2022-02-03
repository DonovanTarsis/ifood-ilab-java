import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int valorI;
        double valorD;

        System.out.print("Digite um valor inteiro:  ");
        valorI = teclado.nextInt();
        System.out.println("Voce digitou o valor " + valorI);

        System.out.println("Agora digite um valor Real: ");

        valorD = teclado.nextDouble();
        System.out.println("Você digitou o valor real: " + valorD);

        teclado.close();
    }
}