class Solution {
    public long coloredCells(int n) {
        long r = n;
        if(n==1){
            return 1;
        }
        else{
            return r*r + (r-1)*(r-1);
        }
    }


            
}
        
       
    