class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int condition = nums.length / 2;

        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }else{
                hm.put(nums[i], 1);
            }
        }

        for(Integer key : hm.keySet()){
            if(hm.get(key) > condition){
                return key;
            }
        }

        return -1;
    }
}




