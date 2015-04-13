package uk.co.stest.queues;

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

		this.productCode = tokens[2];
		this.quantity = Integer.parseInt(tokens[3]);
		this.uom = Integer.parseInt(tokens[4]);
		this.timeStamp = tokens[5];

	}

	private void validateInstructionType(String instructionType)
			throws Exception {
		
		if ( !instructionType.equals("A") && !instructionType.equals("B") && !instructionType.equals("C") && !instructionType.equals("D") ){
			throw new Exception("Invalid Instruction Type");
		}
			
		this.instructionType = instructionType.charAt(0);

	}

	private void validateProductCode(String string) {
		// TODO Auto-generated method stub

	}

	private void validateQuantity(String string) {
		// TODO Auto-generated method stub

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
