package com.tree;

import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(10);
		ts.add(50);

		ts.add(1);

		ts.add(155);

		
		ts.add(18);

		ts.add(15);

		ts.add(102);

		ts.add(55);

		ts.add(155);

		ts.add(10);

		Iterator<Integer> i = ts.iterator() ;
		System.out.println("Retriving iterator");
		
		while(i.hasNext()) {
			
	Integer value = i.next();
		System.out.println(value);
		}


	}

}
