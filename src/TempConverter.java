import javax.swing.JOptionPane;

/**
 * Created by christopherorlik on 9/7/16.
 */

/*  Hwk 2.1a 110110 in binary =     1x2^5 + 1x2^4 + 0x2^3 + 1x2^2 + 1x2 + 0 = 54

    Hwk 2.1b 1010011001 in binary = 1x2^9 + 0x2^8 + 1x2^7 + 0x2^6 + 0x2^5 + 1x2^4 +
                                    1x2^3 + 0x2^2 + 0x2 + 1 = 665

    Hwk 2.2a 101 in decimal =   101/2 r1 50/2 r0 25/2 r1 12/2 r0 6/2 r0 3/2 r1 1/2 r1= 1100101

    Hwk 2.2b 4001 in decimal =  4001/2 r1 2000/2 r0 1000/2 r0 500/2 r0 250/2 r0
                                125/2 r1 62/2 r0 31/2 r1 15/2 r1 7/2 r1
                                3/2 r1 1/2 r1 = 111110100001
 */
public class TempConverter {

    public static double fahrenheit;
    public static double celsius = 35;

    public static void main(String[] args) {
        fahrenheit = (9.0/5)* celsius + 32 ;
        JOptionPane.showMessageDialog(null,
                celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit ",
                "Temp Converter",
                JOptionPane.INFORMATION_MESSAGE);

    }




}
