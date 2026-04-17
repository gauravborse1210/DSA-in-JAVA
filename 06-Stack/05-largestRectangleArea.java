class Solution {
    public int largestRectangleArea(int[] heights) {
        int nextSmallerLeft[] = new int[heights.length];
        int nextSmallerRight[] = new int[heights.length];

        // For nextSmallerRight
        Stack<Integer> s = new Stack<>();

            for(int i = heights.length - 1; i >= 0; i--){
                while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                    s.pop();
                }

                if(s.isEmpty()){
                    nextSmallerRight[i] = heights.length;
                }else{
                    nextSmallerRight[i] = s.peek();
                }

                s.push(i);
            }

        // For nextSmallerLeft
        s = new Stack<>();

        for(int i = 0; i < heights.length; i++){
                while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                    s.pop();
                }

                if(s.isEmpty()){
                    nextSmallerLeft[i] = -1;
                }else{
                    nextSmallerLeft[i] = s.peek();
                }

                s.push(i);
            }

        // For max area
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++){
            int height = heights[i];
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1;
            int curArea = height * width;
            maxArea = Math.max(curArea, maxArea);
        }

        return maxArea;

    }
}
