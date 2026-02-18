import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer dos numeros y deducir si estan en orden creciente. a <= b
        int a = 0, b = 0;
        System.out.print("Digite a: "); // Solicitamos por teclado el valor de 'a'
        a = sc.nextInt(); // capturamos por teclado el valor de 'a'
        System.out.print("Digite b: ");
        b = sc.nextInt();
        // Condicional para deducir si están en orden creciente o decreciente.
        if (a <= b) {
            System.out.println("Orden creciente");
        } else {
            System.out.println("Orden decreciente");
        }
        sc.close();
    }
}
