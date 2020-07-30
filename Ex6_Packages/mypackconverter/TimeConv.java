package mypackconverter;

public class TimeConv{
    public static float hoursToMinutes(float hours){
        return (hours * 60);
    }

    public static float minutesToSeconds(float minutes){
        return (minutes * 60);
    }

    public static float minutesToHours(float minutes){
        return (minutes * 0.0167f);
    }

    public static float secondsToMinutes(float seconds){
        return (seconds * 0.0167f);
    }
}