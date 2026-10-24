class Solution {
    public int reverse(int x) {
        long rev = 0;
        for(int i=x; i!=0; i/=10)
        {
            rev = rev * 10 + i%10;
        }

        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;

        return (int)rev;
    }
}
