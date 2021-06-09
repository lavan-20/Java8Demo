import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		int[] arr1 = {1,2,3,4};
		Arrays.sort(arr1);
		System.out.println(arr1);
		
		int[] stringCop = new int[3];
		System.arraycopy(arr1, 1, stringCop, 0, 3);
		System.out.println(stringCop);
		
		int[] copycopy = Arrays.copyOf(stringCop, 2);
		System.out.println(copycopy);
		
		//Multidimensional
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		System.out.println(arr);

		for(int i=0 ; i<3; i++) {
			for(int j=0 ; j<3; j++) {
				System.out.println(arr[i][j]);
			}
		}

		//for(int i=0; i<=)44
		String val = Olives.ABC.getValueFromKey();
		System.out.println(val);

}
}