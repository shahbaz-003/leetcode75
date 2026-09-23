class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int copy=num;
        int digit=num-1;
        while(digit>0){
            if(num%digit==0){
                sum=sum+digit;
            }
            digit--;
        }
        if(sum==copy){
            return true;
        }
        else {
            return false;
        }
    }
}