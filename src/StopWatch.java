
import java.util.Arrays;

/**
 * Created by christopherorlik on 11/24/16.
 * CMSC 1513
 * Program creates a stopwatch that keeps time in milliseconds for the time to sort 100K #s in order
 */
public class StopWatch {
        // Create start time and end time methods in milliseconds
        private long startTime = System.currentTimeMillis();
        private long endTime = startTime;

        // Create a constructor for StopWatch
        public StopWatch() {
        }
        // Assigns value to method to clock the start time
        public void start() {
            startTime = System.currentTimeMillis();
        }
        // Assigns value to method to clock the stop time
        public void stop() {
            endTime = System.currentTimeMillis();
        }
        // Finds the time elapsed between start and stop
        public long getElapsedTime(){
            long timePassed = endTime - startTime;
            return timePassed;
        }

    public static void main(String[] args) {
        // Creates variable for the numbers quantity to be sorted
        int listSize = 100000;

        // Randomly generates and assigns number quantity to an array
        double[] numbers = new double[listSize];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Math.random() * numbers.length;
        }
        // Initial the stop watch method, start clock and start sorting the array then stop clock
        StopWatch StopWatch = new StopWatch();
        StopWatch stopWatchPrinter = new StopWatch();
        Arrays.sort(numbers);
        stopWatchPrinter.stop();

        // Print time elapsed from StopWatch class values
        System.out.print("The time elapsed is " + stopWatchPrinter.getElapsedTime());

    }

}



