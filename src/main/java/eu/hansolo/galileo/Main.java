package eu.hansolo.galileo;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;


/**
 * User: hansolo
 * Date: 04.05.14
 * Time: 14:28
 */
public class Main {

    public Main() throws UnsupportedEncodingException {
        GalileoIO galileoIO = new GalileoIO();                    
        double    voltage   = galileoIO.getAnalog(Analog.A0);
        double    temp      = (voltage - 500d) / 10d;        
        PrintStream out     = new PrintStream(System.out, true, "UTF-8");
        out.println("Temperature: " + temp + "\u00B0C (" + voltage + " [mV])");                
        System.exit(0);                   
    }
   
    public static void main(String[] args) throws UnsupportedEncodingException {
        new Main();
    }
}
