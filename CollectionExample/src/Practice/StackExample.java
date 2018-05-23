package Practice;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<Object> s = new Stack<>();

		for (int i = 1; i <= 10; i++) {
			s.push(i);
		}
		while (!s.isEmpty()) {
			System.out.print(s.pop() + ", ");
		}
	}
}
