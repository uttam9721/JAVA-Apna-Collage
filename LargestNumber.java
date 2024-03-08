public class LargestNumber {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(largest<numbers[i]){
                largest=numbers[i];
        }
    }
    return largest;
}
    public static void main(String[] args) {
        int numbers[]={10,20,50,61,53};
        System.out.println(getLargest(numbers));
    }
}
