package ejercicio7;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;



public class ejercicio7 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        LocalDateTime now = LocalDateTime.now();

	        // Obtener el siguiente viernes a las 15:00 hrs
	        LocalDateTime nextFriday = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)).with(LocalTime.of(15, 0));

	        // Obtener input de día de la semana
	        DayOfWeek dayOfWeek = null;
	        do {
	            System.out.println("Ingresa un día de la semana (Lunes - Viernes):");
	            String inputDayOfWeek = scanner.nextLine().toLowerCase();
	            try {
	                dayOfWeek = DayOfWeek.valueOf(inputDayOfWeek.toUpperCase());
	            } catch (IllegalArgumentException e) {
	                System.out.println("Error: día de la semana no válido.");
	            }
	        } while (dayOfWeek == null);

	        // Obtener input de hora
	        LocalTime time = null;
	        do {
	            System.out.println("Ingresa una hora (HH:MM):");
	            String inputTime = scanner.nextLine();
	            try {
	                time = LocalTime.parse(inputTime, DateTimeFormatter.ofPattern("HH:mm"));
	            } catch (DateTimeParseException e) {
	                System.out.println("Error: hora no válida.");
	            }
	        } while (time == null);

	        // Obtener el tiempo restante
	        LocalDateTime inputDateTime = LocalDateTime.of(now.toLocalDate(), time);
	        long minutesRemaining = Duration.between(inputDateTime, nextFriday).toMinutes();
	        if (minutesRemaining < 0) {
	            minutesRemaining += 7 * 24 * 60; // Agregar una semana completa si ya pasó el próximo viernes
	        }

	        // Mostrar resultado
	        System.out.println("Faltan " + minutesRemaining + " minutos para el fin de semana.");
	    }
	}
