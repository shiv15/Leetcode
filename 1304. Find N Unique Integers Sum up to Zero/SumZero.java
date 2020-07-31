import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


class SumZero {
	public int[] sumZero(int n) {
        int[] result = new int[n];
        for(int i=0, j=n-1;i<n/2;i++, j--){
            result[i] = i+1;
            result[j] = -(i+1);
        }
        return result;
    }
	    

	public static void main(String[] args) throws IOException {
		int s = 5;

		int[] ret = new SumZero().sumZero(s);

		String out = String.valueOf(ret);

		System.out.print(out);
	}

}