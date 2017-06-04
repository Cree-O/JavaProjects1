
import javax.swing.JOptionPane;

/**
 * Created by christopherorlik on 11/11/16.
 * CMSC 1513
 * Program receives user input and computes area of pentagon with the side of the pentagon.
 */
public class PentagonArea {
    // Create main method
    public static void main(String[] args){
        // Receive side input
        String sideString = JOptionPane.showInputDialog(null, "Enter an integer:");
        // parse input string to double
        double side = Double.parseDouble(sideString);
        // execute method below and return double
        double area = area(side);
        JOptionPane.showMessageDialog(null, "The area of the pentagon is: " + (int)((area * 1000)) / 1000.00);
    }
    // computes area of pentagon
    public static double area(double side){

        double area = 0.0;
        area = ((5 * Math.pow(side, 2)) / (4 * (Math.tan(Math.PI / 5))));
        return area;

    }

}
