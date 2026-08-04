class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i< n; i++){
            set.add(nums[i]);
        }
        int maxCount = 0;
        for(Integer ele : set){
            int prevEle = ele - 1;
            if(!set.contains(prevEle)){
                int count = 1;
                int nextEle = ele + 1;
                while(set.contains(nextEle)){
                    count++;
                    nextEle++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }



        return maxCount;
    }
}
