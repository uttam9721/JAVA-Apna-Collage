public class MinimumNumber {
    public static int getMinimum(int numbers[]) {
        int MinimumNumber = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(MinimumNumber>numbers[i]){
                MinimumNumber=numbers[i];
        }
    }
    return MinimumNumber;
}
    public static void main(String[] args) {
        int numbers[]={10,20,50,61,53};
        System.out.println(getMinimum(numbers));
    }
}
