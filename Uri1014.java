import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int distancia;
        double litros, media;
        
        distancia = teclado.nextInt();
        litros = teclado.nextDouble();

        media = distancia / litros;

        System.out.printf("%.3f km/l\n", media);
        teclado.close();   
    }
}