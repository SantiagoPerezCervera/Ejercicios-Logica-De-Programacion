package ejercicio10;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        // Creamos el diccionario
        HashMap<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("ratón", "mouse");
        diccionario.put("caballo", "horse");
        diccionario.put("elefante", "elephant");
        diccionario.put("jirafa", "giraffe");
        diccionario.put("mono", "monkey");
        diccionario.put("tigre", "tiger");
        diccionario.put("oso", "bear");
        diccionario.put("ballena", "whale");
        diccionario.put("tiburón", "shark");
        diccionario.put("pájaro", "bird");
        diccionario.put("pez", "fish");
        diccionario.put("rana", "frog");
        diccionario.put("serpiente", "snake");
        diccionario.put("lagarto", "lizard");
        diccionario.put("águila", "eagle");
        diccionario.put("mosquito", "mosquito");
        diccionario.put("araña", "spider");
        diccionario.put("cocodrilo", "crocodile");

        // Escogemos cinco palabras al azar del diccionario
        String[] palabras = {"perro", "gato", "ratón", "caballo", "elefante"};
        int aciertos = 0;
        int errores = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Traduce al inglés las siguientes palabras:");

        for (String palabra : palabras) {
            System.out.print(palabra + ": ");
            String traduccion = sc.nextLine();

            // Comprobamos si la traducción es correcta
            if (traduccion.equalsIgnoreCase(diccionario.get(palabra))) {
                System.out.println("Correcto!");
                aciertos++;
            } else {
                System.out.println("Incorrecto, la respuesta correcta es: " + diccionario.get(palabra));
                errores++;
            }
        }

        // Mostramos los resultados
        System.out.println("Has acertado " + aciertos + " palabras");
        System.out.println("Has fallado " + errores + " palabras");

        sc.close();
    }
}