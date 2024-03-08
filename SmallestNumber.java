public class SmallestNumber {
    public static int smallest(int numbers[]){
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (small>numbers[i]) {
                small = numbers[i]; 
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int numbers[]= {10,20,5,6,30,80,40,8,9};
        System.out.print(smallest(numbers));
    }
}
