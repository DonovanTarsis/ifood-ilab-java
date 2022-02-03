import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int entradaSegundos, horas, minutos, segundos, resto;
        
        entradaSegundos = teclado.nextInt();
        resto = entradaSegundos;
        horas = resto / 3600;
        resto = resto % 3600;
        minutos = resto / 60;
        segundos = resto % 60;


        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        teclado.close();   
    }
}