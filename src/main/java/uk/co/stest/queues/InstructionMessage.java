package uk.co.stest.queues;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import uk.co.stest.interfaces.InstructionReceiver;

public class InstructionMessage implements InstructionReceiver {

	private String productCode, timeStamp;
	private int quantity, uom;
	private char instructionType;

	@Override
	public void receive(String message) throws Exception {
		String delims = "[ ]+";
		String[] tokens = message.split(delims);

		validateInstructionType(tokens[1]);
		validateProductCode(tokens[2]);
		validateQuantity(tokens[3]);
		validateUOM(tokens[4]);
		validateTimeStamp(tokens[5]);

		this.uom = Integer.parseInt(tokens[4]);
		this.timeStamp = tokens[5];

	}

	private void validateInstructionType(String instructionType)
			throws Exception {

		if (!instructionType.equals("A") && !instructionType.equals("B")
				&& !instructionType.equals("C") && !instructionType.equals("D")) {
			throw new Exception("Invalid Instruction Type: " + instructionType);
		}

		this.instructionType = instructionType.charAt(0);
	}

	private void validateProductCode(String productCode) throws Exception {
		Pattern productCodePattern = Pattern.compile("[A-Z]{2}[0-9]{2}");
		boolean validProductPattern = productCodePattern.matcher(productCode)
				.matches();
		if (validProductPattern) {
			this.productCode = productCode;
		} else {
			throw new Exception("Invalid Product Code: " + productCode);
		}
	}

	private void validateQuantity(String quantity) throws Exception {
		int tmpQuantity = Integer.parseInt(quantity);
		if (tmpQuantity > 0) {
			this.quantity = tmpQuantity;
		} else {
			throw new Exception("Invalid Quantity: " + tmpQuantity);
		}
	}

	private void validateUOM(String string) {
		// TODO Auto-generated method stub

	}

	private void validateTimeStamp(String string) {
		// TODO Auto-generated method stub

	}

	public char getInstructionType() {
		return instructionType;
	}

	public String toString() {
		return instructionType + " " + productCode + " " + quantity + " " + uom
				+ " " + timeStamp;
	}

}
