package uk.co.stest.queues;

import uk.co.stest.interfaces.InstructionReceiver;

public class InstructionMessage implements InstructionReceiver {

	private String  productCode, timeStamp;
	private int quantity, uom;
	private char instructionType;

	@Override
	public void receive(String message) {
		String delims = "[ ]+";
		String[] tokens = message.split(delims);

		this.instructionType = tokens[1].charAt(0);
		this.productCode = tokens[2];
		this.quantity = Integer.parseInt(tokens[3]);
		this.uom = Integer.parseInt(tokens[4]);
		this.timeStamp = tokens[5];

	}

	public char getInstructionType() {
		return instructionType;
	}

	public String toString() {
		return instructionType + " " + productCode + " " + quantity + " " + uom
				+ " " + timeStamp;
	}

}
