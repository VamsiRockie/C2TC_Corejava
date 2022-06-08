package projects;

public class smallest {

	public static int smallest(int[] arr) {
		   int min = 0;
		   min = arr[0];
		   for (int i = 1; i < arr.length; i++) {
		      if (min > arr[i])
		      min = arr[i];
		   }
		   return min;
		}

}
