import java.util.Timer;
​
public class WeatherTask {
    public static void main(String[] args) {
        // Runs RunWeather.java
        RunWeather rw = new RunWeather("Task");
​
        // Create Timer
        Timer t = new Timer();
        // Schedule to run at fixed rate of 1 hour(60 (minutes) * 60 (seconds) * 1000 milliseconds)
        t.scheduleAtFixedRate(rw, 0, 60 * 60 * 1000);
    }
}
​
