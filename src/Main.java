import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // JAVA Alarm CLOCK
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime;

        System.out.println("Enter an alarm time (HH:MM:SS): ");
        String inputTime = scanner.nextLine();

        alarmTime = LocalTime.parse(inputTime, formatter);
        System.out.println("Alarm set for " + alarmTime);

        scanner.close();
    }
}
