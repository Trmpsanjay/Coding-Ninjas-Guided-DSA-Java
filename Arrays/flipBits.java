public class Solution {
	public static int flipBits(int[] arr,int n) {
        
        // count first number of ones andd then apply kadanes algorithm
        //Write your code here
        int count = 0;
        int arrNew[] = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arrNew[i] = 1;
                
            }else{
                arrNew[i] = -1;
                count++;
            }
        }
        int sum =0;
        int maxSum =0;
        for(int i=0;i<arrNew.length;i++){
           sum = sum+arrNew[i];
            if(sum>=maxSum)
                maxSum = sum;
            if(sum<0)
                sum = 0;
        
            
        }
        return maxSum+count;
	}
}
