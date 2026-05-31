class Solution {
    public int lengthOfLastWord(String s) {
     s=s.trim();
     String[] sen=s.split("\\s+");

     return sen[sen.length-1].length(); 
    }
}