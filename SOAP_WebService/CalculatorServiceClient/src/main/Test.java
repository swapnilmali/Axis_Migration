package main;



import com.CalculatorSoapBindingStub;

import java.net.URL;

import com.CalculatorServiceLocator;
public class Test {

	public static void main(String[] args) throws Exception {
		CalculatorSoapBindingStub st= new CalculatorSoapBindingStub();
		CalculatorServiceLocator lo= new CalculatorServiceLocator();
		st= (CalculatorSoapBindingStub) lo.getCalculator(new URL("http://localhost:8080/CalculatorService/services/Calculator"));
          
		System.out.println("Addition :" +st.add(14, 5));
          System.out.println("Substraction :" + st.sub(100, 50));
          System.out.println("Multiplication :" + st.mul(2, 5));
          System.out.println("Division :" + st.div(80, 1));
	}

}
