class Solution {
    public int lengthOfLongestSubstring(String s) {
       int l=0;
       int maxLength = 0;
       char[] chars = s.toCharArray();
       HashSet<Character> set = new HashSet<>();
       for(int r=0; r < chars.length; r++){
            while(set.contains(chars[r])){
                set.remove(chars[l]);
                l++;
            }
            set.add(chars[r]);
            maxLength = Math.max(maxLength, r-l+1);
       }
       return maxLength;
    }
}
