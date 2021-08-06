package finalexam.part2q2;


import java.util.Arrays;
import java.util.Comparator;

import finalexam.part2q2.model.Product;

public class ProductMgmtApp {

	public static void main(String[] args) {
		Product[] products = { new Product(9801264, "Banana", 1.98f), new Product(9801262, "Carrot", 0.25f),
				new Product(9801263, "Pear", 2.42f), new Product(9801261, "Apple", 1.57f),
				new Product(9801265, "Banana", 1.99f) };
		sortProducts(products);
		Arrays.asList(products).forEach(System.out::println);
	}

	/**
	 * Sorts the array of Products in descending order by name and then in ascending
	 * order by their unitPrices; by using a Comparator implemented and passed-in as
	 * an anonymous inner class or a lambda expression, to the Arrays.sort(...)
	 * method.
	 * 
	 * @param products
	 */
	private static void sortProducts(Product[] products) {

		Arrays.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				if (p1.getName().compareTo(p2.getName()) != 0)
					return p1.getName().compareTo(p2.getName());

				return -(int) (p1.getUnitPrice() - p2.getUnitPrice());

			}
		});

	}
}
