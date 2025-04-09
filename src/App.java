import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Recursividad rec = new Recursividad();

        System.out.println("-----Ejercicio 1-----");
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("Resultado: " + rec.sumaConsecutivos(n));

        System.out.println("-----Ejercicio 2-----");
        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();
        System.out.println("Resultado: " + rec.potencia(base, exponente)); 

        System.out.println("-----Ejercicio 3-----");
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        System.out.println("Resultado: " + rec.sumaDigitos(numero)); 
    }
}
