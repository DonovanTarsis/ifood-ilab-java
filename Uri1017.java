import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double media = 12;
        int horas, velocidade, distancia;
        double litros;
        
        horas = teclado.nextInt();
        velocidade = teclado.nextInt();
        distancia = horas * velocidade;
        litros = distancia / media;

        System.out.printf("%.3f\n", litros);
        teclado.close();   
    }
}