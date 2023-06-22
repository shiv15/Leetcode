import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> result = new ArrayList<>();
       Arrays.sort(candidates);
       backtrack(result, new ArrayList<>(), candidates, target, 0);
       System.out.println(result);
       return result;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] candidates, int target, int idx) {
        if (target < 0) return;
        if (target == 0) {
            list.add(new ArrayList<>(temp));
        } else {
            for (int i =idx; i < candidates.length; i++) {
                temp.add(candidates[i]);
                backtrack(list, temp, candidates, target - candidates[i], i);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        CombinationSum obj = new CombinationSum();
		obj.combinationSum(candidates, 7);
	}
}