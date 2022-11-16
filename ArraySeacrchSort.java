package Com.searchSort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySeacrchSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Arr[]  = {10,26,47,66,98,106,65,76};
		Arrays.sort(Arr);
		int data = MyIo.getData();
		for(int i=0; i<Arr.length; i++) {
			System.out.println(Arr[i]);	
		}
		
		int f = 0;
		int l = Arr.length-1;
		int m = (f+l)/2;
		
		while(f <= l) {
			if(Arr[m] == data) {
				System.out.println("data found " +Arr[m]+" at "+m);
				break;
			}
			else if (Arr[m]<data) {
				f = m+1;
			}  
			else {
				l = m-1;
			}
			m = (f+l)/2;
		}
		if(f>l) {
			System.out.println("data not present");
		}
	}

}


class MyIo {
	
	public static int getData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data to search ");
		int data = sc.nextInt();
		return data;
	}

	
	
}