
//Practica Recursividad #3 - Alan Enmanuel Jimenez / 1015-9162
//Remember: solo lib estandar no terceros...

public class Main {

    public static void main(String[] args) {

        System.out.println(factorial_iteracion(5));

    }

    //Primer punto inciso 4
    public static long factorial_iteracion(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    //Primer punto inciso 5
    public static long factorial_tail(int n, long acumulador) {
        if (n <= 1) {
            return acumulador;
        }
        return factorial_tail(n - 1, n * acumulador);
    }

    public static long factorial(int n) {
        return factorial_tail(n, 1);
    }

    //FRAGMENTO 20

    public static int potencia(int x, int n) {
        if (n == 0) return 1;

        int mitad = potencia(x, n / 2);

        if (n % 2 == 0) {
            return mitad * mitad;
        } else {
            return x * mitad * mitad;
        }
    }

    //FRAGMENTO 21
    public static void invertirOpt(char[] arr, int inicio, int fin) {
        if (inicio >= fin) return;
        char temp = arr[inicio];
        arr[inicio] = arr[fin];
        arr[fin] = temp;
        invertirOpt(arr, inicio + 1, fin - 1);
    }

    public static String invertir(String s) {
        char[] arr = s.toCharArray();
        invertirOpt(arr, 0, arr.length - 1);
        return new String(arr);
    }
}
