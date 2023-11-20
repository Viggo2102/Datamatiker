
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        // Create a list to store date-time combinations
        List<LocalDateTime> dateTimes = new ArrayList<>();

        // Initialize the date and starting time
        LocalDate currentDate = LocalDate.now(); // Use the current date as a starting point
        LocalTime startTime = LocalTime.of(9, 0); // Starting time (e.g., 9:00 AM)

        for (int i = 0; i < 8; i++) {
            LocalDateTime dateTime = LocalDateTime.of(currentDate, startTime.plusHours(i));
            dateTimes.add(dateTime);
        }

        // Simulate booking by removing a timeslot
        if (dateTimes.size() > 0) {
            // Assuming you want to remove the first available timeslot
            dateTimes.remove(0);
            dateTimes.remove(1);
            dateTimes.remove(2);
            dateTimes.remove(3);
        }

        // Print the remaining date-time combinations
        for (LocalDateTime dateTime : dateTimes) {
            System.out.println(dateTime);
        }
    }
}


