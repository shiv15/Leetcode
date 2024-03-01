public class ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < s.length/2; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        rs.reverseString(s);
        System.out.println(s);
    }
}
