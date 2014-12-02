/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author YazGruno
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        integerTest();
        mathTest();
        incrementAndModulus();
        compoundAssignmentTest();
        toggleValue();
        toggleValueTest();
    }

    private static void integerTest() {
//<editor-fold defaultstate="collapsed" desc="Integer Test">
        int radius = 2;
        double pi = 3.141592653;
        double d;
        int i;
        
        d = pi;
        System.out.println("d = " + d);
        
        d = radius;
        System.out.println("radius = " + d);
        
        i = (int) pi;
        System.out.println("d = " + i);
        
    }
//</editor-fold>
    
    private static void mathTest() {
        double dfive = 5.0;
        int five = 5;
        int two = 2;
        int result;
        double dresult;
        
        System.out.println(" 5 x 2 = " + (five * two));
        System.out.println(" 5 / 2 =" + (five / two));

        result = five / two;
//        dresult = dfive / two;
        dresult = (double) five / 2;
        
        System.out.println(" 5 / 2 = " + result);
        System.out.println(" 5 / 2 = " + dresult);
        
        result = 1 + 2 * 3;
        
        System.out.println("result = " + result);
    }
    
    private static void incrementAndModulus() {
        int i = 10;
        int n = i++%5;
       
        System.out.println("n = " + n);
        System.out.println("i = " + i);

        i = 10;
        int m = ++i%5;
        System.out.println("m = " + m);
        System.out.println("i = " + i);
        
//        Prediction: n will be 0 (because there is no remainder of 10/5), i will be 11; m will be 1 (because 11/5
//        has a remainder of 1), i will be 11 again.
    }
    
    
     public static void compoundAssignmentTest (){
          
          int result = 1 + 2; // result is now 3
          System.out.println(result);

          result -= 1; // result is now 2
          System.out.println(result);

          result *= 2; // result is now 4
          System.out.println(result);

          result /= 2; // result is now 2
          System.out.println(result);

          result += 8; // result is now 10
          System.out.println(result);
          
          result %= 7; // result is now 3
          System.out.println(result);
     }

       public static boolean toggleValue (boolean myValue){
         
           return myValue;
     }
     
       public static void toggleValueTest (){
          boolean bValue = false;
           System.out.println("bValue = " + bValue);
     
         
          //call the toggleValue method using "bValue" as the parameter, and assign the result back into "bValue" 
 
          //print out the value of "bValue" (note: this should now be "true")

          //again call the toggleValue method using "bValue" as the parameter, and assign the result back into "bValue" 
 
          //print out the value of "bValue" (note: this should now be "false")
 
 
     }
}
