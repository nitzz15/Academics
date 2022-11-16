package Com.searchSort;

import java.util.Arrays;

public class ArraySearchSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[]  = {10,26,47,66,98,106,65,76};
		Arrays.sort(Arr);
		int data = MyIo.getData();
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i]);	
			System.out.print(" ");
		}
		System.out.println();
			boolean found =false;
			for(int i =0; i<Arr.length;i++) {
				if(data == Arr[i]) {
					found  = true;
					System.out.println("data found at " + i);
					break;
				}
			}
			if(found == false)
				System.out.println("data not present");
			
		}
	}


