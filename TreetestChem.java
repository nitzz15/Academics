package com.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreetestChem {

	public static void main(String[] args) {
		
		ChemicalElements gold = new ChemicalElements(79,"Gold","Au",196.97f); //R
		
		ChemicalElements silver = new ChemicalElements(47,"Silver","Ag",107.87f); //L
		ChemicalElements radium = new ChemicalElements(88,"Radium","Ra",226.03f); //R
		
		ChemicalElements calcium = new ChemicalElements(20,"Calcium","Ca",40.08f); // L L
		ChemicalElements tin  = new ChemicalElements(50,"Tin","Sn",118.711f);// L R
		
		ChemicalElements lead = new ChemicalElements(82,"Lead","Pb",207.2f); // R L
		ChemicalElements uranium  = new ChemicalElements(92,"Uranium","U",238.29f);
		
		TreeSet<ChemicalElements> PeriodicTable = new TreeSet<ChemicalElements>();
		
		System.out.println("adding 1st value...");
		PeriodicTable.add(silver);
		
		System.out.println("adding 2nd value...");
		PeriodicTable.add(gold);
		
		
		System.out.println("adding 3rd value...");
		PeriodicTable.add(radium);
		
		
		System.out.println("adding 4th value...");
		PeriodicTable.add(lead);
		
		
		System.out.println("adding 5th value...");
		PeriodicTable.add(uranium);
		
		System.out.println("adding 6th value...");
		PeriodicTable.add(tin);
		
		System.out.println("adding 7th value...");
		PeriodicTable.add(calcium);
		
		Iterator<ChemicalElements>PeriodicTableIt = PeriodicTable.iterator();
		
		while(PeriodicTableIt.hasNext()) {
			ChemicalElements pt = PeriodicTableIt.next();
			System.out.println(pt);
			
		}
		
		
	}

}
