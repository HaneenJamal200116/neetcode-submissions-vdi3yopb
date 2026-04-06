class Solution {
    public boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        s=s.toLowerCase();
        while(i<=j){
             while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            // Skip non-alphanumeric from right
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
