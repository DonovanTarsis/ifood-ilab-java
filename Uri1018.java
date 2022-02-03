import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valorInicial, cem, cinquenta, vinte, dez, cinco, dois, um, resto;
        
        valorInicial = teclado.nextInt();
        resto = valorInicial;
        cem = resto / 100;
        resto = resto % 100;
        cinquenta = resto / 50;
        resto = resto % 50;
        vinte = resto / 20;
        resto = resto % 20;
        dez = resto / 10;
        resto = resto % 10;
        cinco = resto / 5;
        resto = resto % 5;
        dois = resto / 2;
        resto = resto % 2;
        um = resto / 1;
        resto = resto % 1;


        System.out.printf("%d\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n", valorInicial, cem, cinquenta, vinte, dez, cinco, dois, um);
        teclado.close();   
    }
}