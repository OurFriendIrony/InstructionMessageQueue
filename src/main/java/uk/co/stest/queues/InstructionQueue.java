package uk.co.stest.queues;

import java.util.ArrayList;
import java.util.List;

public class InstructionQueue {
	private List<InstructionMessage> messages;

	public InstructionQueue() {
		messages = new ArrayList<InstructionMessage>();
	}

	public void enqueue(InstructionMessage message) {
		messages.add(message);
	}

	public InstructionMessage dequeue() {
		// Returns the highest-priority message from the queue
		// and returns it.
		InstructionMessage popMessage = messages.get(0);
		messages.remove(0);
		return popMessage;
	}

	public InstructionMessage peek() {
		// Returns the highest-priority message from the queue,
		// without removing it
		return messages.get(0);
	}

	public int count() {
		// Returns the number of messages currently on the queue
		return messages.size();
	}

	public boolean isEmpty() {
		// Returns true if the queue is empty, false otherwise
		return messages.isEmpty();
	}

}
