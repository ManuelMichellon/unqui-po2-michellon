package unq;

import java.util.ArrayList;

public class Multioperator {
	
	private ArrayList<Integer> numbers;

	public Multioperator() {
		super();
		this.numbers = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}

	public int sumNumbers() {
		Integer result = 0;
		for (Integer integer : numbers) {
			result = result + integer;
		}
		
		return result;	
	}
	
	public int subtractNumbers() {
		Integer result = 0;
		for (Integer integer : numbers) {
			result = integer - result;
		}
		
		return result;	
	} 
	
	public int multiplyNumbers() {
		Integer result = 1;
		for (Integer integer : numbers) {
			result = result * integer;
		}
		
		return result;	
	}

	public void addElement(Integer i) {
		this.numbers.add(i);
	} 
}
