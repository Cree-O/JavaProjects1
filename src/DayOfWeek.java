import java.util.Scanner;

/**
 * Created by christopherorlik on 10/3/16.
 * CMSC 1513 Project 5 Day of Week
 * Program determines day of week for an inputted date
 * 10/5/2016
 */
public class DayOfWeek {
    public static void main(String[] args){

        // Initiate Scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user inputs
        System.out.print("Enter year (e.g., 2015): ");

        // Define year
        int year = scanner.nextInt();

        System.out.print("Enter month (e.g., 1-12): ");

        // Define month
        int month = scanner.nextInt();

        System.out.print("Enter day of the month (e.g., 1-31): ");

        // Define day
        int day = scanner.nextInt();

        int m = month;

            if (m == 1) {

                m = 13;

                // For January year value needs to be previous year
                int yearTemp = (year - 1);
                int j = (yearTemp / 100);
                int k = (yearTemp % 100);
                int q = (day);

                // Perform equation
                int h = ((q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7);

                // Assign day to number value
                if (h == 0) {
                    System.out.println("The day of the week is Saturday");
                } else if (h == 1) {
                    System.out.println("The day of the week is Sunday");
                } else if (h == 2) {
                    System.out.println("The day of the week is Monday");
                } else if (h == 3) {
                    System.out.println("The day of the week is Tuesday");
                } else if (h == 4) {
                    System.out.println("The day of the week is Wednesday");
                } else if (h == 5) {
                    System.out.println("The day of the week is Thursday");
                } else if (h == 6) {
                    System.out.println("The day of the week is Friday");


                }
            }
            else if (m == 2) {

                    m = 14;

                    // For January year value needs to be previous year
                    int yearTemp2 = (year - 1);
                    int j = (yearTemp2 / 100);
                    int k = (yearTemp2 % 100);
                    int q = (day);

                    // Perform equation
                    int h = ((q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7);

                    // Assign day to number value
                    if (h == 0) {
                        System.out.println("The day of the week is Saturday");
                    } else if (h == 1) {
                        System.out.println("The day of the week is Sunday");
                    } else if (h == 2) {
                        System.out.println("The day of the week is Monday");
                    } else if (h == 3) {
                        System.out.println("The day of the week is Tuesday");
                    } else if (h == 4) {
                        System.out.println("The day of the week is Wednesday");
                    } else if (h == 5) {
                        System.out.println("The day of the week is Thursday");
                    } else if (h == 6) {
                        System.out.println("The day of the week is Friday");

                    }
                }
            else {
                        m = m;
                        int j = (year / 100);
                        int k = (year % 100);
                        int q = (day);

                        int h = (( q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7);

                        // Assign day to number value
                        ;
                        if (h == 0) {
                            System.out.println("The day of the week is Saturday");
                        }
                        else if (h == 1) {
                            System.out.println("The day of the week is Sunday");
                        }
                        else if (h == 2){
                            System.out.println("The day of the week is Monday");
                        }
                        else if (h == 3){
                            System.out.println("The day of the week is Tuesday");
                        }
                        else if (h == 4){
                            System.out.println("The day of the week is Wednesday");
                        }
                        else if (h == 5){
                            System.out.println("The day of the week is Thursday");
                        }
                        else if (h == 6){
                            System.out.println("The day of the week is Friday");
                    }


            }


        }
    }

