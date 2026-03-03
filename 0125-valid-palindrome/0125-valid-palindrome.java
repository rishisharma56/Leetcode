class Solution {
    public boolean isPalindrome(String s) {
       String c = s.toLowerCase().replaceAll("[^a-z0-9]", ""); 
        int a = 0;
        int b = c.length() -1;
        while(a < b){
            if(c.charAt(a) != c.charAt(b)){
               return false;
            }
            a++;
            b--;
            
        }
        return true;
    }
}