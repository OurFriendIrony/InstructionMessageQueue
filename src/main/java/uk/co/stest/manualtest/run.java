package uk.co.stest.manualtest;

import uk.co.stest.queues.InstructionMessage;
import uk.co.stest.queues.InstructionQueue;

public class run {
	public static void main(String[] args) {
		InstructionQueue queue = new InstructionQueue();
		InstructionMessage message1 = new InstructionMessage(23);

		
		System.out.println("is empty " + queue.isEmpty());
		System.out.println("count " + queue.count());
		
		System.out.println("add in");
		queue.enqueue(message1);
		
		System.out.println("is empty" + queue.isEmpty());
		System.out.println("count " + queue.count());
		
		System.out.println("peek top " + queue.peek().toString());
	
		System.out.println("is empty " + queue.isEmpty());
		System.out.println("count " + queue.count());
		
		System.out.println("pop top " + queue.dequeue());

		System.out.println("is empty " + queue.isEmpty());
		System.out.println("count " + queue.count());
	}
}
