package array;

public class Maxnumber {

	public static void main(String[] args) {
		 int[] arr = {10, 4, 6, 20, 3};

	        int max = arr[0]; // assume first element is max

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i]; // update max if bigger value found
	            }
	        }

	        System.out.println("Maximum number is: " + max);

	}

}
