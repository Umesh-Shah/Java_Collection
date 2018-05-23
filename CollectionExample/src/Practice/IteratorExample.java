package Practice;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {

		Collection<String> c = Arrays.asList("Red", "Orange", "Yellow", "Green",
				"Blue", "Indigo", "Violet");

		Iterator<String> ite = c.iterator();

		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}
}
