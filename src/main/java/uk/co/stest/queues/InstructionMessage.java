package uk.co.stest.queues;

public class InstructionMessage {
	private int num;

	public InstructionMessage(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

public String toString(){
	return num+"";
}
	
}
