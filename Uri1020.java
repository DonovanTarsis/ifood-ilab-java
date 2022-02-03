import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int entradaDias, anos, meses, dias, resto;
        
        entradaDias = teclado.nextInt();
        resto = entradaDias;
        anos = resto / 365;
        resto = resto % 365;
        meses = resto / 30;
        dias = resto % 30;


        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);
        teclado.close();   
    }
}