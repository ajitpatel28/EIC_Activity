package parkingManagement;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class ParkingManagement {

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    System.out.print("Enter the entry time (dd/MM/yyyy HH:mm): ");
    LocalDateTime entryTime = LocalDateTime.parse(sc.nextLine(), formatter);

    LocalDateTime currentTime = LocalDateTime.now();

    if (entryTime.isAfter(currentTime)) {
        System.out.println("Error: The entry time cannot be in the future");
        return;
    }

    Duration duration = Duration.between(entryTime, currentTime);
    long hours = duration.toHours();

    int cost = (int) (hours * 15);
    System.out.println("The parking cost is: Rs." + cost);
		}
	
	}