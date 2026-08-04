class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
    List<int[]> cars = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        cars.add(new int[]{position[i], speed[i]});
    }

    // Sort by position descending — closest to target first
    cars.sort((a, b) -> b[0] - a[0]);

    Stack<Double> stack = new Stack<>();

    for (int[] car : cars) {
        double time = (double) (target - car[0]) / car[1];

        // If this car's time is greater than the fleet ahead (top of stack),
        // it can't catch up — it forms its own new fleet
        if (stack.isEmpty() || time > stack.peek()) {
            stack.push(time);
        }
        // else: this car catches up to the fleet ahead, absorbed into it — do nothing
    }

    return stack.size();
    }
}
