package Practice;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> states = new LinkedList<String>();

		states.add("Arizona");
		states.add("California");
		states.add("Colarado");
		states.add("New York");

		states.addFirst("Alabama");

		System.out.println(states);
		System.out.println("Last state is the list : " + states.getLast());

		ListIterator<String> ite = states.listIterator(states.size());

		while (ite.hasPrevious()) {
			System.out.println(ite.previous());
		}

	}
}
