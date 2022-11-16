package Com.searchSort;

public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[]  = {10,26,47,66,98,106,65,76};
		int temp;
		for(int i = 0; i<Arr.length;i++) {
			for (int j = i+1; j<Arr.length; j++) {
				if(Arr[i]>Arr[j]) {
				temp = Arr[i];
				Arr[i]=Arr[j];
				Arr[j]=temp;
				
			}
			}
			System.out.println(Arr[i]);
		}
	
		
		
		
	}

}
