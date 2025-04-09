import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("Resultado: " + Recursividad.sumaConsecutivos(n));

        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();
        System.out.println("Resultado: " + Recursividad.potencia(base, exponente));

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        System.out.println("Resultado: " + Recursividad.sumaDigitos(numero));

    }
}
