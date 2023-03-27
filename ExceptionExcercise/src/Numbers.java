import java.util.Scanner;

public class Numbers {
	private int firstNumber;
	private int secondNumber;
	private double result;
	
	Numbers(int firstNumber,int secondNumber){
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public void add() {
		this.result = this.firstNumber + this.secondNumber;
	}
	
	public void sub() {
		this.result = this.firstNumber - this.secondNumber;
	}
	
	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void mul() {
		this.result = this.firstNumber * this.secondNumber;
	}
	
	public void div() throws ArithmeticException{
		if(this.secondNumber == 0) {
			throw new ArithmeticException();
		}
		else {
			this.result = this.firstNumber / this.secondNumber;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your first number?");
		int firstNum = in.nextInt();
		System.out.println("What is your second number");
		int secondNum = in.nextInt();
		Numbers n = new Numbers(firstNum, secondNum);
		int choice;
		
		
		do {
			System.out.println("Which operation? ");
			System.out.println("1- add, 2- subtract, 3- multiply, 4- divide, 5- exit");
			choice = in.nextInt();
			
			switch(choice) {
			case 1:
				n.add();
				System.out.println("The sum of the numbers are " + n.getResult());
				break;
			
			case 2:
				n.sub();
				System.out.println("The difference of the numbers are " + n.getResult());
				break;
				
			case 3: 
				n.mul();
				System.out.println("The product of the numbers are " + n.getResult());
				break;
			case 4:
				try {
					n.div();
					System.out.println("The quotient of the numbers are " + n.getResult());	
				}
				catch(ArithmeticException e) {
					System.out.println("Cannot divide by 0 ");
				}
				break;
				
			case 5:
				System.exit(0);
			}
		}
		while(choice != 5);
		
		
	}
}
