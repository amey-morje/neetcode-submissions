class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        int[] days = new int[temperatures.length];
        
        for(int i=1; i< temperatures.length; i++){    
            while(!stack.isEmpty() && (temperatures[i] > temperatures[stack.peek()])){
                int ele = stack.pop();
                days[ele] = i - ele;
            }
            stack.push(i);
        }
    return days;
    }
}
