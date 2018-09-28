
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemp;
import java.util.Scanner; // scanner is a class, util is package 
/**
 *
 * @author admin
 */
public class ConvertTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //args means accepts strings
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // input is the scanner variable(name)
       //input has own value we use value in program abd input value into a new 
       //variable
        // print out the welcome message
        
        System.out.println("Please enter the temperature degree in Celsius");
        double tempC = input.nextDouble(); //gets the input from user and runs through code
           // formula tempf = (9.0/5.0) * tempc + 32.0
       // c = ()
       // double cTemp;
       
       double tempF = (9.0/5.0) * tempC + 32.0;
       System.out.println(tempC + "c is eqaul to " + tempF + "f");
        
        
    }

}
