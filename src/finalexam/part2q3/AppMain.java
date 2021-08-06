package finalexam.part2q3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import finalexam.part2q3.model.Account;


public class AppMain {
	

	
	public static <T extends Comparable<? super T>> T findSmallest(List<T> list) {
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if(smallest.compareTo(secondSmallest)>0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for(int i = 2; i < list.size(); ++i) {
			T next = list.get(i);
			if(next.compareTo(smallest)<0) {
				secondSmallest = smallest;
				smallest = next;
			}
			else if(next.compareTo(secondSmallest)<0) {
				secondSmallest = next;
			}
			
		}
		return smallest;
	}

		public int compare(Account e1, Account e2) {
			
			return e1.getBalance() < e2.getBalance() ? -1 : e1.getBalance() == e2.getBalance() ? 0 : 1;
		}
	

	
	
    public static void main(String[] args) {
        List<Long> numbers = Arrays.asList(9810231946L, 1734530935L, 8744511009L);
        System.out.printf("The smallest of the numbers, %s is: %d\n", numbers,findSmallest(numbers));

        List<String> names = Arrays.asList("Joseph", "Zachariah", "Hernandez");
        System.out.printf("The smallest of the names, %s is: %s\n", names,findSmallest(names));

        List<LocalDate> dates = Arrays.asList(
            LocalDate.of(1974,1,31),
            LocalDate.of(1945,12,18),
            LocalDate.of(1945,6,24)
        );
        System.out.printf("The smallest of the dates, %s is: %s\n", dates,findSmallest(dates));

        List<Account> accounts = Arrays.asList(
            new Account(101L, 9875400.52),
            new Account(102L, 10399840.18),
            new Account(103L, 54098005.01)
        );
  //     System.out.print("The account with the smallest balance is: %s\n", findSmallest(accounts));
    }

    //INSTRUCTIONS: Implement code here for a method named, findSmallest,
    // which takes as input, a list of objects of any type, T, and
    // it finds and returns the smallest item in the list.
    // Then, uncomment the code provided in the main method above and
    // execute it to test your implementation of the findSmallest.
    // Expected output is the following:
    //The smallest of the numbers, [9810231946, 1734530935, 8744511009] is: 1734530935
    //The smallest of the names, [Joseph, Zachariah, Hernandez] is: Hernandez
    //The smallest of the dates, [1974-01-31, 1945-12-18, 1945-06-24] is: 1945-06-24
    //The account with the smallest balance is: {accountNumber=101, balance=9875400.52}


}
