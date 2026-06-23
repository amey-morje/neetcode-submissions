class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int highest = maxArray(piles);
        int l=1;
        int r=highest;
        int ans = 0;

        while(l <= r){
            int mid = l + (r-l)/2;
            int hours = calculateHours(piles, mid);
            if(hours <= h){
                 ans = mid;
                r = mid -1;
            } else {
                l = mid+1;
            }
        }
        return ans;
    }

    public int maxArray(int[] piles) {
        int max = 0;
        for(int i =0; i < piles.length; i++){
            if (piles[i] > max){
                max = piles[i];
            }
        }
        return max;
    }

    public int calculateHours(int[] piles, int rate){
        int hours = 0;
        for(int i=0; i< piles.length; i++){
            hours += (piles[i]+rate-1)/rate;
        }
        return hours;
    }
}
