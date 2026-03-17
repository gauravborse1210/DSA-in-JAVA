class Solution {
    public int largestAltitude(int[] gain) {

        int max = 0;
        int[] result = new int[gain.length + 1];
        result[0] = 0;

        for(int i = 1; i <= gain.length; i++){
            result[i] = result[i-1] + gain[i-1];
        }

        for(int i = 0; i < result.length; i++){
            if(max < result[i]){
                max = result[i];
            }
        }

        return max;
    }
}
