package com.tree;

import java.util.Scanner;

public class MyTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChemicalElements gold = new ChemicalElements(79,"Gold","Au",196.97f); //R
		
		ChemicalElements silver = new ChemicalElements(47,"Silver","Ag",107.87f); //L
		ChemicalElements radium = new ChemicalElements(88,"Radium","Ra",226.03f); //R
		
		ChemicalElements calcium = new ChemicalElements(20,"Calcium","Ca",40.08f); // L L
		ChemicalElements tin  = new ChemicalElements(50,"Tin","Sn",118.711f);// L R
		
		ChemicalElements lead = new ChemicalElements(82,"Lead","Pb",207.2f); // R L
		ChemicalElements uranium  = new ChemicalElements(92,"Uranium","U",238.29f);
		
		Scanner sc = new Scanner(System.in);
		
		MyTreeSet myTreeSet = new MyTreeSet();
		
		int choice = 0;
		do
		{
			System.out.println("1. Insert an Element ");
			System.out.println("2. Delete an Element ");
			System.out.println("3. InOrder Traversal");
			System.out.println("4. PreOrder Traversal");
			System.out.println("5. PostOrder Traversal");
			System.out.println("6. Exit");
			System.out.println("Enter choice : ");
			choice = sc.nextInt();
			
				switch(choice) {
					case 1: 
						myTreeSet.insert(); break; 
					case 3:
						myTreeSet.inOrder(myTreeSet.root); break;
					case 6: break;
				}
		}
 while(choice!=6);
		
	}	
		
		
		
		
//		gold.left = silver;
//		gold.left.left = calcium;
//		gold.left.right = tin;
//		
//		gold.right = radium;
//		gold.right.right = uranium;
//		gold.right.left = lead;
	}



class MyTreeSet{
	
	ChemicalElements root = null , temp;
	
	void insert() {
		Create();
		
		if (root == null)
			root = temp;
		else 
			search(root);
	}
		
	
	void Create() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter atomic no :");
		int tempAtomicNumber = sc.nextInt();
		System.out.println("enter name :");
		String tempAtomicName = sc.next();
		
		temp = new ChemicalElements();
		temp.atomicNumber = tempAtomicNumber;
		temp.atomicName = tempAtomicName;
		
		temp.left = null;
		temp.right = null;
		
		
	}
	
	void search(ChemicalElements ce) {
		
		if((temp.atomicNumber > ce.atomicNumber) && (ce.right!=null))
			search(ce.right); //recursive call
		else if((temp.atomicNumber > ce.atomicNumber) && (ce.right==null))
			ce.right=temp; // assing the node

		else if((temp.atomicNumber < ce.atomicNumber) && (ce.left!=null)) 
			search(ce.left); //recursive call
		else if((temp.atomicNumber < ce.atomicNumber) && (ce.left==null)) 
			ce.left=temp; // assing the node
	}
	
	void inOrder(ChemicalElements ce) {
		if(root == null) {
			System.out.println("No elements to show in the tree");
			return ;
		}
		
		if(ce.left !=null) 
			inOrder(ce.left);
		
		System.out.println("DATA :"+ce);
		
		if(ce.right !=null) 
			inOrder(ce.right);
	}
	
}
