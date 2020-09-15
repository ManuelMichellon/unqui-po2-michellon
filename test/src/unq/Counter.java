package unq;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numbers; 

	public Counter() {
		this.numbers = new ArrayList<Integer>();
	}
	
	public void addNumber(Integer i) {
		this.numbers.add(i);
	}

	public int getEvenOcurrences() {
		int even = 0;
		for(Integer i: numbers ) {
			if(i % 2 == 0) {
				even = even + 1;
			}	
		}
		return even;
	}

	public int getNotEvenOcurrences() {
		int notEven = 0;
		for(Integer i: numbers ) {
			if(i % 2 != 0) {
				notEven = notEven + 1;
			}	
		}
		return notEven;
	}
	
	public int getMultiplesOf(int number) {
		int multiple = 0;
		for(Integer i: numbers ) {
			if(i % number == 0) {
				multiple = multiple + 1;
			}	
		}
		return multiple;
	}
	
}
