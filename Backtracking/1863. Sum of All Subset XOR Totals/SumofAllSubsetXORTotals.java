class SumofAllSubsetXORTotals {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    private int helper(int[] nums, int currXor, int idx) {
        if (idx == nums.length) {
            return currXor;
        }

        int withElement = helper(nums, currXor ^ nums[idx], idx + 1);
        int withoutElement = helper(nums, currXor, idx + 1);

        return withElement + withoutElement;
    }

    public static void main(String[] args) {
        int[] nums = {5,1,6};
        SumofAllSubsetXORTotals sumofAllSubsetXORTotals = new SumofAllSubsetXORTotals();
        int sum = sumofAllSubsetXORTotals.subsetXORSum(nums);
        System.out.println(sum);
    }
}