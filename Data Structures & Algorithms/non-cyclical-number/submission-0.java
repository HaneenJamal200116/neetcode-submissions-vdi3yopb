class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            if(n==1)return true;
            set.add(n);
            n=getSum(n);
        }
        return false;
    }
    public int getSum(int num){
        int res=0;
        while(num>0){
            int digit=num%10;
            digit=digit*digit;
            res+=digit;
            num/=10;
        }
        return res;
    }
}
