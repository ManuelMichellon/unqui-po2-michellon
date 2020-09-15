package test;

import unq.Multioperator;

public class test {
	public static void main(String[] args) {
		Multioperator multioperator = new Multioperator();
		multioperator.addElement(1);
		multioperator.addElement(2);
		multioperator.addElement(3);
		multioperator.addElement(4);
		
		System.out.println(multioperator.multiplyNumbers());
	}
}
