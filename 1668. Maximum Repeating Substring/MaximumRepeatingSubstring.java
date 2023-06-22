class MaximumRepeatingSubstring {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String add = word;
        while (sequence.contains(word)) {
            count++;
            word = word + add;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        MaximumRepeatingSubstring obj = new MaximumRepeatingSubstring();
        obj.maxRepeating("ababc", "ab");
    }
}