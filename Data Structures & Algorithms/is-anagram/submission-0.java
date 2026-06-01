class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> s1 = new HashMap<Character, Integer>();
        Map<Character, Integer> s2 = new HashMap<Character, Integer>();


        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();


        for (int i = 0; i < charS.length; i++){
            s1.put(charS[i], s1.getOrDefault(charS[i],0) + 1);
            s2.put(charT[i], s2.getOrDefault(charT[i],0) + 1);
        }

        return s1.equals(s2);

    }
}
