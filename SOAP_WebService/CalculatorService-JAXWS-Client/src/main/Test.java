package main;
import com.CalculatorService;
import com.Calculator;
public class Test {

	public static void main(String[] args) {
	CalculatorService cs=new CalculatorService();
    Calculator c=cs.getCalculatorServicePort();
    System.out.println("Addition : "+c.add(17, 895));
    System.out.println("Substraction : "+c.sub(654, 52));
    System.out.println("Multoplication : "+c.mul(45, 9));
    System.out.println("Division : "+c.div(800, 0));
	}

}
