class Solution {
    public int sumFourDivisors(int[] nums) {
        int res =0;
        for(int num : nums){
            int divCount = 0;
            int divSum = 0;
            for(int i =1; i*i<= num; i++){
                if(num%i==0){
                    int d1= i;
                    int d2= num / i;
                    divCount++;
                    divSum+=d1;
                    if(d1!=d2){
                        divCount++;
                        divSum+=d2;
                    }
                    if(divCount>4) break;
                }
            }
            if(divCount==4) res+=divSum;
        }
        return res;
    }
}