public class Time {
    private final int hours;
    private final int minutes;
    private final int seconds;

    public Time(int timeseconds){
        int lefttime = timeseconds;
        this.hours = (lefttime / 3600) % 24;
        lefttime %= 3600;
        this.minutes = lefttime / 60;
        this.seconds = lefttime % 60;
    }

    public Time(int hours, int minutes, int seconds){
        this.hours = hours % 24;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours(){
        return this.hours;
    }

    public int getMinutes(){
        return this.minutes;
    }

    public int getSeconds(){
        return this.seconds;
    }

    @Override
    public String toString(){
        StringBuilder daytime = new StringBuilder();
        daytime.append(this.hours);
        daytime.append(":");
        daytime.append(String.format("%02d", this.minutes));
        daytime.append(":");
        daytime.append(String.format("%02d", this.seconds));
        return daytime.toString();
    }
}