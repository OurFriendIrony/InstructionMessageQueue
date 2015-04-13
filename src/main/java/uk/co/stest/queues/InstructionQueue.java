package uk.co.stest.queues;

import java.util.ArrayList;
import java.util.List;

public class InstructionQueue {
	private List<InstructionMessage> messages;

	public InstructionQueue() {
		messages = new ArrayList<InstructionMessage>();
	}

	public void enqueue(InstructionMessage message) {
		char messagePriority = message.getInstructionType();
		int priorityPosition = getPriorityPosition(messagePriority);
		messages.add(priorityPosition, message);
	}

	private int getPriorityPosition(char messagePriority) {
		char indexedPriority;

		for (int i = 0; i < count(); i++) {
			indexedPriority = messages.get(i).getInstructionType();

			if ((messagePriority < indexedPriority)) {
				return i;
			}
		}

		return count();
	}

	public InstructionMessage dequeue() {
		InstructionMessage popMessage = messages.get(0);
		messages.remove(0);
		return popMessage;
	}

	public InstructionMessage peek() {
		return messages.get(0);
	}

	public int count() {
		return messages.size();
	}

	public boolean isEmpty() {
		return messages.isEmpty();
	}

}
