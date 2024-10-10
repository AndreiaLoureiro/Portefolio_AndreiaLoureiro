
package excecao01;

public class Excecao01 {

    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println("Aceder a posição 3 :" + a[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceção capturada: " + e);
        }
        System.out.println("Fim do Programa");
    }
}
