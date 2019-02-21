package cse360assign2;

public class cse360assign2 {
	 public static void main(String[] args) {
	        Calculator Calc = new Calculator();
	        Calculator myCalculator = new Calculator();
	        System.out.println("Initial Value: " + Calc.getTotal());
	        Calc.add(3);
	        System.out.println("Add 3: " + Calc.getTotal());
	        Calc.divide(0);
	        System.out.println("Divide by 0: " + Calc.getTotal());
	        Calc.subtract(3);
	        System.out.println("Subtract 3: " + Calc.getTotal());
	        Calc.divide(0);
	        System.out.println("Divide by 0: " + Calc.getTotal());
	        System.out.println(Calc.getHistory());

	        myCalculator.add(4);
	        myCalculator.subtract(2);
	        myCalculator.multiply(2);
	        myCalculator.add(5);
	        System.out.println(myCalculator.getHistory());
	 }
}
