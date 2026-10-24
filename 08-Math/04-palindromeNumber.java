class Solution {
    public boolean isPalindrome(int x) {
        if(x <0) return false;

        String st = x + "";
        int i = 0;
        int j = st.length() - 1;

        while(i<j)
        {
            if(st.charAt(i) != st.charAt(j))
            {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
