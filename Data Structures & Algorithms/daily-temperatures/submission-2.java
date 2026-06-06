class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prevIndex = stack.pop();

                result[prevIndex] = i - prevIndex;
                // System.out.print(i);
                // System.out.println("prev" + prevIndex);
                // System.out.println(result[prevIndex]);

            }

            stack.push(i);
        }

        return result;
    }
}