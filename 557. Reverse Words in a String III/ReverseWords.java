import java.io.IOException;

class ReverseWords {
	public String reverseWords(String s) {
		String result = "";
		int count = 0;
		char[] sArray = s.toCharArray();
		for (int i = 0; i < sArray.length; i++) {
			while (i < sArray.length - 1 && sArray[i] != ' ') {
				i++;
			}
			for (int j = i; j >= count; j--) {
				if (sArray[j] != ' ')
					result += String.valueOf(sArray[j]);
			}
			count = i + 1;
			if (i < sArray.length - 1)
				result += " ";

		}

		return result;
	}

	public static void main(String[] args) throws IOException {
		String s = "Let's take LeetCode contest";

		String ret = new ReverseWords().reverseWords(s);

		String out = String.valueOf(ret);

		System.out.print(out);
	}

}