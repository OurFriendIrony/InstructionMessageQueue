package uk.co.stest.manualtest;

import uk.co.stest.queues.InstructionMessage;
import uk.co.stest.queues.InstructionQueue;

public class run {
	public static void main(String[] args) {
		InstructionQueue queue = new InstructionQueue();

		System.out.println("add in 1|");
		InstructionMessage message1 = new InstructionMessage();
		message1.receive("InstructionMessage B MZ89 5678 50 2015-03-05'T'10:04:56.012'Z'");
		queue.enqueue(message1);

		System.out.println("add in 2|");
		InstructionMessage message2 = new InstructionMessage();
		message2.receive("InstructionMessage A MZ11 1111 11 2015-03-05'T'10:04:56.012'Z'");
		queue.enqueue(message2);

		System.out.println("add in 3|");
		InstructionMessage message3 = new InstructionMessage();
		message3.receive("InstructionMessage C MZ11 1111 11 2015-03-05'T'10:04:56.012'Z'");
		queue.enqueue(message3);

		System.out.println("add in 4|");
		InstructionMessage message4 = new InstructionMessage();
		message4.receive("InstructionMessage A AA22 2222 2 2015-03-05'T'10:04:56.012'Z'");
		queue.enqueue(message4);

		System.out.println("is empty: " + queue.isEmpty());
		System.out.println("count   : " + queue.count());
		System.out.println();

		while (!queue.isEmpty()) {
			System.out.println("pop top : " + queue.dequeue());

			System.out.println("is empty: " + queue.isEmpty());
			System.out.println("count   : " + queue.count());
			System.out.println();
		}

	}
}
