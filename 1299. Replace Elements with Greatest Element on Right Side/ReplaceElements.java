import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


class ReplaceElements {
	    public int[] replaceElements(int[] arr) {
	    	int max = arr[arr.length - 1];
	        for (int i = arr.length - 2; i >= 0; i--) {
	            int pivot = arr[i];
	            arr[i] = max;
	            max = Math.max(arr[i], pivot);
	        }

	        arr[arr.length - 1] = -1;

	        return arr;
	    }
	    

	public static void main(String[] args) throws IOException {
		int[] s = {17,18,5,4,6,1};

		int[] ret = new ReplaceElements().replaceElements(s);

		String out = String.valueOf(ret);

		System.out.print(out);
	}

}