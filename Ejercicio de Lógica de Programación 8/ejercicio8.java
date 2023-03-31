package ejercicio8;


import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] primes = new int[10];
        int primeIndex = 0;
        int nonPrimeIndex = 0;

        // Solicitar al usuario 10 números por consola y almacenarlos en un array.
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            numbers[i] = sc.nextInt();
        }

        // Ordenar los números primos al inicio y los no primos al final.
        for (int i = 0; i < 10; i++) {
            if (isPrime(numbers[i])) {
                primes[primeIndex] = numbers[i];
                primeIndex++;
            } else {
                primes[9 - nonPrimeIndex] = numbers[i];
                nonPrimeIndex++;
            }
        }

        // Mostrar por consola el array que contiene los números primos al inicio.
        for (int i = 0; i < 10; i++) {
            System.out.println("pos[" + i + "] = " + primes[i]);
        }
    }

    // Función para verificar si un número es primo.
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}