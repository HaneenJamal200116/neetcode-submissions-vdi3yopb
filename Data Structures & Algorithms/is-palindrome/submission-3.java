class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        int i=0,j=s.length()-1;
        while(j>i){
            if(s.charAt(j)!=s.charAt(i)) return false;
            i++;
            j--;
        }
        return true;
    }
}
