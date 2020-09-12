import java.io.IOException;


class ReplaceElements {
	    public boolean containsPattern(int[] arr, int m, int k) {
	        int n=arr.length;
	        String s = "";
	        for(int i=0;i<n;i++) {
	            s+=arr[i];
	        }
	        if(n<k) return false;
	        for(int i=1;i<=m-1;i++) {
	            boolean result=check(s,m,k,i);
	            if(result)
	                return true;
	        }
	        return check(s,m,k,0);
	        
	    }
	    public static boolean check(String s, int m ,int k,int start) {
	        int n=s.length();
	        String last = s.substring(start,m+start);
	        int count=1;
	        
	        for(int i=m+start;i+m<=n;i+=m) {
	            if(last.equals(s.substring(i,i+m))) {
	                count++;
	                if(count>=k) return true;
	            } else {
	                last = s.substring(i,i+m);
	                count=1;
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) throws IOException {
		int[] s = {1,2,4,4,4,4};

		boolean ret = new ReplaceElements().containsPattern(s, 1, 3);

		String out = String.valueOf(ret);

		System.out.print(out);
	}

}