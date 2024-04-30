import learn.DaysOfWeek;

public class EnumInfo {
    public static void main(String[] args) {
        for(DaysOfWeek daysOfWeek: DaysOfWeek.values()) {
            System.out.println("Day of Week " + daysOfWeek.getDayName());
        }
    }
}
