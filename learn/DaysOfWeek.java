package learn;

public enum DaysOfWeek {
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT;

    public String getDayName() {
        return this + " of Day";
    }
}
