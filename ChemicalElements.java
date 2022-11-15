package com.tree;

public class ChemicalElements implements Comparable<ChemicalElements> {

	int atomicNumber;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	
	ChemicalElements left;
	
	ChemicalElements right;
	
	public ChemicalElements(int atomicNumber, String atomicName, String atomicFormula, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}


	public ChemicalElements() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "ChemicalElements [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}


	@Override
	public int compareTo(ChemicalElements o) {
		// TODO Auto-generated method stub
		
		System.out.println("Comparing"+ atomicName+" with "+o.atomicName );
		return atomicName.compareTo(o.atomicName);
	}

}
