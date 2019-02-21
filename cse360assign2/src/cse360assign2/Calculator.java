package cse360assign2;
/**
*
* @author Tim
* @date 2/20/2019
* @purpose: Calculator class to perform certain calculations.
*/
public class Calculator {

   private int total;
   private String history;

   /**
    * Description: Creates a calculator object with total of 0.
    */
   public Calculator() {
       total = 0;
       history = "0";
   }

   /**
    * Description: Returns the total of the calculator
    *
    * @return total;
    */
   public int getTotal() {
       return total;
   }

   /**
    * Description: Adds the parameter value to the total
    *
    * @param value
    */
   public void add(int value) {
       total = total + value;
       history += " + " + value;
   }

   /**
    * Description: Subtracts the parameter value to the total
    *
    * @param value
    */
   public void subtract(int value) {
       total = total - value;
       history += " - " + value;
   }

   /**
    * Description: Multiplies the parameter value to the total
    *
    * @param value
    */
   public void multiply(int value) {
       total = total * value;
       history += " * " + value;
   }

   /**
    * Description: Divides the parameter value to the total
    *
    * @param value
    */
   public void divide(int value) {
       if (value != 0) {
           total = total / value;
           history += " / " + value;
       } else {
           total = 0;
           history += " / " + value;
       }
   }

   /**
    * Description: Returns the computational history of the calculator.
    *
    * @return history
    */
   public String getHistory() {
       return history;
   }
}
