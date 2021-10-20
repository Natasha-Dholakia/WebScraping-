import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
​
public class WeatherData {
    public static void main(String[] args) {
        In in = new In(args[0]);
        String text = in.readAll();
​
        // Prints Run Date
        String runDate = text.substring(0, 10);
        StdOut.print(runDate);
        StdOut.print(" ");
​
        // Prints Run Time
        String runTime = text.substring(14, 26);
        StdOut.print(runTime);
        StdOut.print(" ");
​
        // Prints As of Time
        int start = text.indexOf("1SWy5\"", 0);
        int from = text.indexOf(">", start);
        int to = text.indexOf("<", from);
        String asOfTime = text.substring(from + 7, to);
        StdOut.print(asOfTime);
        StdOut.print(" ");
​
        // Prints Temperature
        start = text.indexOf("3KcTQ\"", 0);
        from = text.indexOf(">", start);
        to = text.indexOf("<", from);
        String temp = text.substring(from + 1, to - 1);
        StdOut.print(temp);
        StdOut.print(" ");
​
        // Prints Condition
        start = text.indexOf("2xXSr\"", 0);
        from = text.indexOf(">", start);
        to = text.indexOf("<", from);
        String condition = text.substring(from + 1, to);
        StdOut.print(condition);
        StdOut.print(" ");
​
        // Prints Humidity
        start = text.indexOf("PercentageValue\"", 0);
        from = text.indexOf(">", start);
        to = text.indexOf("<", from);
        String humidity = text.substring(from + 1, to);
        StdOut.print(humidity);
        StdOut.print(" ");
​
        // Prints Visibility
        start = text.indexOf("VisibilityValue\"", 0);
        from = text.indexOf(">", start);
        to = text.indexOf("<", from);
        String visibility = text.substring(from + 1, to);
        StdOut.print(visibility);
        StdOut.print(" ");
​
        // Prints Wind Speed
        start = text.indexOf("Wind Direction", 0);
        from = text.indexOf("</svg>", start);
        to = text.indexOf("</span>", from);
        String wind = text.substring(from + 6, to);
        StdOut.print(wind);
        StdOut.print(" ");
​
        // Prints Sunrise
        start = text.indexOf("2nwgx\"", 0);
        from = text.indexOf(">", start);
        to = text.indexOf("<", from);
        String sunrise = text.substring(from + 1, to);
        StdOut.print(sunrise);
        StdOut.print(" ");
​
        // Prints Sunrise
        start = text.indexOf("2nwgx\"", to);
        from = text.indexOf(">", start);
        to = text.indexOf("<", from);
        String sunset = text.substring(from + 1, to);
        StdOut.print(sunset);
        StdOut.print(" ");
        StdOut.println();
    }
}






















