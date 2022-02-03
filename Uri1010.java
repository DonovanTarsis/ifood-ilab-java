import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo, quantidade;
        double valor, total;
        
        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();
        valor = teclado.nextDouble();
        total = quantidade * valor;

        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();
        valor = teclado.nextDouble();
        total += quantidade * valor;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        teclado.close();   
    }
}