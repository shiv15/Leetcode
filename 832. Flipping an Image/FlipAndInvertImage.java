import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


class FlipAndInvertImage {
	 public int[][] flipAndInvertImage(int[][] A) {
	        for (int i = 0; i < A[0].length; i++) {
	            reverse(A[i]);
	        }
	        for (int i = 0;i < A[0].length;i++) {
	            invertRow(A[i]);
	        }
	        return A;
	    }

	    private void invertRow(int[] arr) {
	        for (int i = 0;i < arr.length;i++) {
	            arr[i] = arr[i] == 0 ? 1 : 0;
	        }
	    }

	    private void reverse(int[] arr) {
	        int startIndex = 0, endIndex = arr.length - 1;
	        while (startIndex < endIndex) {
	            int temp = arr[startIndex];
	            arr[startIndex] = arr[endIndex];
	            arr[endIndex] = temp;
	            startIndex++;
	            endIndex--;
	        }
	    }
	    

	public static void main(String[] args) throws IOException {
		int[][] s = {{1,1,0},{1,0,1},{0,0,0}};

		int[][] ret = new FlipAndInvertImage().flipAndInvertImage(s);

		String out = String.valueOf(ret);

		System.out.print(out);
	}

}