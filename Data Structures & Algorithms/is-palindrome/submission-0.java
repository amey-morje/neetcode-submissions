class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] res = s1.toCharArray();
        System.out.println(s1);

        int i = 0;
        int j = res.length -1;

        while (i < j){
            if(res[i] == res[j]){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
