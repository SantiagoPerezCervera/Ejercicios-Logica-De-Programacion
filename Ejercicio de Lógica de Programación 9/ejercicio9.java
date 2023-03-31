package ejercicio9;
import java.util.HashMap;
import java.util.Scanner;

public class ejercicio9 {
	  public static void main(String[] args) {
	        // Crear el diccionario español-inglés utilizando un HashMap
	        HashMap<String, String> diccionario = new HashMap<>();
	        diccionario.put("gato", "cat");
	        diccionario.put("perro", "dog");
	        diccionario.put("casa", "house");
	        diccionario.put("coche", "car");
	        diccionario.put("libro", "book");
	        diccionario.put("computadora", "computer");
	        diccionario.put("amigo", "friend");
	        diccionario.put("ciudad", "city");
	        diccionario.put("bosque", "forest");
	        diccionario.put("jardín", "garden");
	        diccionario.put("caballo", "horse");
	        diccionario.put("trabajo", "job");
	        diccionario.put("lenguaje", "language");
	        diccionario.put("amor", "love");
	        diccionario.put("música", "music");
	        diccionario.put("nombre", "name");
	        diccionario.put("naturaleza", "nature");
	        diccionario.put("oficina", "office");
	        diccionario.put("persona", "person");
	        diccionario.put("tiempo", "time");

	        // Pedir al usuario una palabra en español
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese una palabra en español:");
	        String palabra = scanner.nextLine();

	        // Buscar la traducción de la palabra en el diccionario
	        String traduccion = diccionario.get(palabra);

	        // Mostrar la traducción o un mensaje indicando que la palabra no se encuentra en el diccionario
	        if (traduccion != null) {
	            System.out.println("La traducción de \"" + palabra + "\" es \"" + traduccion + "\"");
	        } else {
	            System.out.println("La palabra \"" + palabra + "\" no se encuentra en el diccionario");
	        }
	    }
	}