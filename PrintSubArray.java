public class PrintSubArray {
    public static void printSubArray(int numbers[]){
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = 1; j < numbers.length; j++) {
                int end = j;
                for(int k = start; k < end; k++) {
                    System.out.print(numbers[k]+" ");
                }
             System.out.println();
            }
           // System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubArray(numbers);
    }
}
