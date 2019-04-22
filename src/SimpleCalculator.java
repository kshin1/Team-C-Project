
public class SimpleCalculator {
	
	public int Addition(int...numbers) {
		int total = 0;
		for(int num : numbers) {
			total += num;
		}
		return total;	
		
	}
	
	public int Subtraction(int n1, int n2) {
		
		int result;
		result = n1-n2;
		
		return result;
		
	}

	public int Multiplication(int...numbers) {
		
		int result = 1;
		for(int num : numbers) {
			result *= num;
		}
		
		return result;	
		
	}
	
	public double Divison(double num1, double num2) {
		double result = 0;
		try {
			
			result = num1/num2;
		}
		catch (ArithmeticException e) {
			
			System.out.println("Divide by 0 Exception");
		}
		
		return result;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleCalculator sc = new SimpleCalculator();
		
		int sum = sc.Addition(1,2,3,4);
		System.out.println("Sum of numbers is : " + sum);
		
		int sub = sc.Subtraction(10, -15);
		System.out.println("Subtraction of numbers is : " + sub);
		
		int mul = sc.Multiplication(4, 7, 9);
		System.out.println("Multiplication of numbers is : " + mul);
		
		double div = sc.Divison(7, 10);
		System.out.println("Divison of numbers is : " + div);
		

	}

}
