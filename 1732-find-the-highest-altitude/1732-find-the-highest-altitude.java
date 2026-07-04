class Solution {
    public int largestAltitude(int[] gain) {
        int currentaltitude=0;
        int maximumaltitude=0;
        
         for(int i=0;i<gain.length;i++){
                 currentaltitude=currentaltitude+gain[i];
           
            if(currentaltitude>maximumaltitude){
                maximumaltitude=currentaltitude;
            }
        }
        return maximumaltitude;
        
    }
}