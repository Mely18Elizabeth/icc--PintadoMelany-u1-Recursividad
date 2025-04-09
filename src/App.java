import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Recursividad rec = new Recursividad();

        System.out.println("Ejercicio 1: Suma ");
        System.out.println("Ejercicio 2: Potencia");
        System.out.println("Ejercicio 3: Suma de Digitos");
        System.out.println("Ejercicio 4: Fibonacci");
        System.out.println("Ingrese el numero del ejercicio: ");
        int ejercicio=sc.nextInt();

        switch (ejercicio){
            case 0:
            sc.close();
            break;
            case 1:
            System.out.println("-----Ejercicio 1-----");
            System.out.print("Ingrese un número: ");
            int n = sc.nextInt();
            System.out.println("Resultado: " + rec.sumaConsecutivos(n));
            break;
            case 2:
            System.out.println("-----Ejercicio 2-----");
            System.out.print("Ingrese la base: ");
            int base = sc.nextInt();
            System.out.print("Ingrese el exponente: ");
            int exponente = sc.nextInt();
            System.out.println("Resultado: " + rec.potencia(base, exponente)); 
            break;
            case 3:
            System.out.println("-----Ejercicio 3-----");
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            System.out.println("Resultado: " + rec.sumaDigitos(numero));
            break;
            case 4:
            System.out.println("----Fibonacci-----");
            System.out.print("Ingrese un número: ");
            int n1 = sc.nextInt();
            rec.fibonacci(n1);
            break;
            default:
            System.out.println("Opción no válida");
            break;
        } 

    }
}
