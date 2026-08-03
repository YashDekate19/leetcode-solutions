class Solution {
    public int mirrorDistance(int n) {
        int temp = n;
        int rev=0;
        int r = 0;
        while(temp>0){
            r = temp % 10;
            rev=rev*10+r;
            temp/=10;
        }
        int result;
        result = n - rev;
        if(result < 0){
            return -1*result;
        }else{
            return result;
        }
        
    }
}