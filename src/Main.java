import java.time.*;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2024, Month.JANUARY, 2);
        System.out.println(date);

        LocalTime time = LocalTime.of(13, 20);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(2024, Month.JANUARY, 2, 13, 20);
        System.out.println(dateTime);

        ZoneId zone = ZoneId.of("America/Chicago");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zone);
        System.out.println(zonedDateTime);

        zonedDateTime = zonedDateTime.plusDays(1);
        zonedDateTime = zonedDateTime.plusWeeks(1);
        zonedDateTime = zonedDateTime.plusMonths(1);
        zonedDateTime = zonedDateTime.plusYears(1);
        System.out.println(zonedDateTime);
    }
}