package excecao02;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class Excecao02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            try{
            System.out.print("Digite o numerador: ");
            int numerador = scanner.nextInt();
            
            System.out.print("Digite o denominador: ");
            int denominador = scanner.nextInt();
            
            // Divisão
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
            }catch(ArithmeticException e){
             System.out.println("Erro: Não é possível dividir por zero.");
            } finally {
            System.out.println("Operação finalizada.");
        }
    }
}

 

    

