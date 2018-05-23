package Practice;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i <= 10; i++) {
			q.add(i);
		}
		System.out.println("Elements in the queue: " + q);

		int removed = q.remove();
		System.out.println("Removed " + removed);

		int top = q.peek();
		System.out.println("Top elements is: " + top);

		System.out.println(q);
	}
}
