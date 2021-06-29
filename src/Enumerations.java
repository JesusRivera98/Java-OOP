public class Enumerations {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day day;
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are good.");
                break;
            case FRIDAY:
                System.out.println("Fridays are nice");
                break;
            case SATURDAY: case: SUNDAY:
            System.out.println("Weekends are the best");
                break;
            default:
                System.out.println("Midweek are so-so");
                break;

        }
        Day.MONDAY;
        Day.FRIDAY;
        Day.SATURDAY;
    }
}
