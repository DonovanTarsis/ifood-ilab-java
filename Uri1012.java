import java.util.Scanner;

public class Uri1012{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        triangulo = a * c / 2;
        circulo = (c*c) * 3.14159;
        trapezio = (a + b) * c / 2;
        quadrado =  b*b;
        retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", triangulo, circulo, trapezio, quadrado, retangulo);
        teclado.close();   
    }
}