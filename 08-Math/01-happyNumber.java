class Solution {
    public boolean isHappy(int n) {
      if(n == 1 || n == 7) return true;
      
      while(n>9)
      {
        int sum = 0;
        while(n>0)
        {
        int last = n % 10;
        int prod = last * last;
        sum += prod;
        n/=10;
        }
        if(sum == 1 || sum == 7){
            return true;
        }

        n = sum;
      }
      return false;
    }
}
