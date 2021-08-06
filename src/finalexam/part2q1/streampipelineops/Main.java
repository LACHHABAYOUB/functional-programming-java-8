package finalexam.part2q1.streampipelineops;

import java.util.Comparator;
import java.util.List;

import finalexam.part2q1.model.Customer;
import finalexam.part2q1.model.CustomerTestData;
import finalexam.part2q1.model.Transaction;

/** USE STREAM PIPELINES TO SOLVE THE PROBLEMS GIVEN HERE */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Start...");
				
		prob1();
		prob2();
		prob3();
		prob4();
		prob5();
	}
	
	/* Create a stream pipeline that does the following: */
	
	// Print all Names of Customers whose address is in
	// the state of California, "CA" and whose City is NOT "Santa Monica"
	public static void prob1() {
		List<Customer> customers = CustomerTestData.getCustomers();
		customers.stream()
		.filter(c->c.getAddress().getState().compareTo("CA")==0)
		.filter(c->c.getAddress().getCity().compareTo("Santa Monica")!=0)
		.forEach(c->System.out.println(c));
	}
	
	// Create a stream pipeline that obtains a list of
	// all customer/account pairs extracted from the list of Customers
	// for which there is at least one transaction in the account.
	// Print the list in descending order of Customer names.
	public static void prob2() {
		//use this list 
		List<Customer> customers = CustomerTestData.getCustomers();
		customers.stream()
		.filter(c->c.getAccount().getTrxns().size()>1)
		.sorted(Comparator.comparing(Customer::getName).reversed())
		.forEach(c->System.out.println(c));
	}
	
	// Create a stream pipeline to print all the transactions for all
	// the customers' accounts, displaying them in order from the oldest
	// to the most recent and then by descending order of the transaction amounts.
	// (Note: there is an instance variable "amount" in Transaction)
	public static void prob3() {
		//use this list	
		List<Customer> customers = CustomerTestData.getCustomers();
		// Implement your code here
		customers.stream()
		.flatMap(c->c.getAccount().getTrxns().stream())
		.sorted(Comparator.comparing(Transaction::getDate).thenComparing(Transaction::getAmount).reversed())
		.forEach(t->System.out.println(t));
	}	
	
	//Create a stream pipeline to find all transactions done after year 2000
	//and sort them by amount (from small to high), and print to console.
	//(Note: there is an instance variable "amount" in Transaction)
	public static void prob4() {
		//use this list	
		List<Customer> customers = CustomerTestData.getCustomers();
		customers.stream()
		.flatMap(c->c.getAccount().getTrxns().stream())
		.filter(t->t.getDate().getYear()>2000)
		.sorted(Comparator.comparing(Transaction::getAmount))
		.forEach(t->System.out.println(t));
		}
	
	
	// Create a stream pipeline to find all Accounts with balance, 
	// bigger than $1000 and having at least 1 transaction which was
	// done after the year, 2000.
	// And print the result to console.
	public static void prob5() {
		//Use this list
		List<Customer> customers = CustomerTestData.getCustomers();  
		// Implement your code here
		customers.stream()
		.map(c->c.getAccount())
		.filter(a->a.getBalance()>1000)
		.filter(a->a.getTrxns().stream().filter(t->t.getDate().getYear()>2000).count()>=1)
		.forEach(t->System.out.println(t));
		}
	}

