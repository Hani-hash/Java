
public class Calculator {
	private double results;
	private double number1;
	private double number2;
	private char signs;
	
	
	public Calculator() {
		
	}
	
	
	public void setOperandOne(double number1) {
		this.number1 = number1;
	}
	
	public void setOperation(char signs) {
		this.signs = signs;
	}
	public void setOperandTwo(double number2) {
		this.number2 = number2;
	}
	public void performOperation() {
		if (this.signs == '+')
			this.results = this.number1 + this.number2;
		if (this.signs == '-')
			this.results = this.number1 - this.number2;
	}
	
	public void getResults() {
		System.out.println(this.results);
	}
	
}

