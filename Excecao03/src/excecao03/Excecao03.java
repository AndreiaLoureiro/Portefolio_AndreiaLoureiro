
package excecao03;

      
import java.util.Scanner;
public class Excecao03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um número: ");
            String input = scanner.nextLine();
            
            // Tentativa de conversão
            int numero = Integer.parseInt(input);
            System.out.println("O número introduzido é: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Não introduziu um número válido.");
        }
    }
}

    
    

