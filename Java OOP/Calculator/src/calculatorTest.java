
public class calculatorTest {

	public static void main(String[] args) {
		Calculator x = new Calculator();
		
		x.setOperandOne(10.5);
		x.setOperandTwo(55.5);
		x.setOperation('+');
		x.performOperation();
		x.getResults();

	}

}