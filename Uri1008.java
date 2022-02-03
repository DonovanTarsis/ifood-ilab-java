import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero,horas;
        float valor, salario;
        
        numero = teclado.nextInt();
        horas = teclado.nextInt();
        valor = teclado.nextFloat();
        
        salario = horas * valor;

        System.out.printf("NUMERO = %d\nSALARY = U$ %.2f", numero, salario);
        teclado.close();   
    }
}