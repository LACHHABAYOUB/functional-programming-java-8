package finalexam.part2q1.model;

import java.time.LocalDate;

public class Transaction {

	private LocalDate date;
	private double amount;

	public Transaction(LocalDate date, double amount)
	{
		this.date = date;
		this.amount = amount;
	}

	public LocalDate getDate(){
		return this.date;
	}

	public double getAmount(){
		return this.amount;
	}
	
	public String toString(){
	    return "{Transaction done on: "+this.date+", " +
	           "with value of:" + this.amount +"}\n";
	}
	
}