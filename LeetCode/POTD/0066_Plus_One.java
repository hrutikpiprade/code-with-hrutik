class Solution {
    public int[] plusOne(int[] digits) {
        // start from last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++; // add one for last digit or add caryy 1
            if(digits[i]<10) return digits; // no carry, return directly
            digits[i]=0; // set zero, and carry over
        }
        // now all digits are 9, we need new array for extra digit
        int[] result = new int[digits.length + 1];
        result[0] = 1; // all remaining is already default 0 
        return result;
    }
}
