class Solution {
    public boolean lemonadeChange(int[] bills) {
        int l=0;
        int five=0;
        int ten=0;
        int twenty=0;
        while(l<bills.length){
            if(bills[l]==5){
                five++;
            }
            else if(bills[l]==10){
                if(five==0) return false;
                five--;
                ten++;
            }
            else if(bills[l]==20){
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }
                else if(five>=3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
            l++;
        }
        return true;
    }
}