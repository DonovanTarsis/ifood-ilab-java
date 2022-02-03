import java.util.Scanner;

public class Uri1009{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String nome;
        Double valorFixo, vendas, salario;
        
        nome = teclado.next();
        valorFixo = teclado.nextDouble();
        vendas = teclado.nextDouble();
        
        salario = valorFixo + (0.15 * vendas);

        System.out.printf("TOTAL = R$ %.2f\n", salario);
        teclado.close();   
    }
}