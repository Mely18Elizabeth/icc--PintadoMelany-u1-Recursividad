public class Recursividad {
    public int sumaConsecutivos(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaConsecutivos(n - 1);
        }
    }

    public int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return (numero % 10) + sumaDigitos(numero / 10);
        }
    }
    public void fibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }
    }
    
    private int fibonacciRecursivo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
}
