import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
​
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.TimerTask;
​
/*
 
   javac-algs4 WeatherTask.java
 
  java-algs4 WeatherTask
 
 Run WeatherTask.java which will use this code to print the text files
  Should create new text file with corresponding date as filename

  */
​
public class RunWeather extends TimerTask {
    private String nameRW;
​
    public RunWeather(String n) {
        this.nameRW = n;
    }
​
    public void run() {
​
        // Read in web page data from weather.com for Austin,Tx
        String name = "https://weather.com/weather/today/l/7472a7bbd3a7454aadf596f0ba7dc8b08987b1f7581fae69d8817dffffc487c2"; // Austin, TX
        In in = new In(name);
        String text = in.readAll();
​
        // Format and get current date time to print in text file
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        java.util.Date date = new java.util.Date(System.currentTimeMillis());
        String datePrint = formatter.format(date);
​
        // Format and get current date time to print as filename
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd-HH");
        java.util.Date datetime = new java.util.Date(System.currentTimeMillis());
        String filename = "OUTPUT-" + formatDate.format(datetime) + ".txt";
​
        // Test code to show program is running
        StdOut.println(filename);
​
        // Print date and text to .txt file using FileWriter
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write(datePrint);
            fw.write('\r');
            fw.write('\n');
            fw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}