
public class MaxSubArray {
    public static void MaxSubArray(int numbers[]){
        int ts= 0;
        int currsum= 0;
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j=1;j<numbers.length;j++){
                int end = j;
                currsum=0;
                for(int k = start;k<end;k++){
                    currsum+=numbers[k];
                }
                System.out.println(currsum);
                if (maxsum<currsum) {
                    
                }
            }
        }
        System.out.print(maxsum);
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        MaxSubArray(numbers);

    }
}