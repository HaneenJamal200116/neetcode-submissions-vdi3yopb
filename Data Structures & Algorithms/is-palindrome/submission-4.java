class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        s=s.toLowerCase();
        while(j>=i){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(s.charAt(j)!=s.charAt(i)) return false;
            i++;
            j--;
        }
        return true;
    }
}
