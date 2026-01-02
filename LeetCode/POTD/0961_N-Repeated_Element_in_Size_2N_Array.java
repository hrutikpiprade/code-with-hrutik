//Time: O(n)
//Space: O(n)
class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>(); // stores unique elements

        for (int i : nums) {               // iterate through array
            if (!set.add(i))               // add() returns false if element already exists
                return i;                  // repeated element
        }
        return nums[nums.length - 1];      // fallback (guaranteed answer)
    }
}
