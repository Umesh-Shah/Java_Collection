package Practice;

import java.util.ArrayList;

public class GroceryList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Milk");
		list.add("Bread");

		System.out.println(list);

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Eggs");
		list2.add("Vegetables");

		System.out.println(list2);

		list.addAll(list2);

		System.out.println(list);

		if (list.contains("Milk")) {
			list.remove("Milk");
		}

		System.out.println(list);

	}

}
