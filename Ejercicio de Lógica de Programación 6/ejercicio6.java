package ejercicio6;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String str = sc.nextLine();
        String reversed = reverseString(str);
        System.out.println("Texto invertido: " + reversed);
        sc.close();
    }
    
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}