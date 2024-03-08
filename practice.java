/**
 * practice
 */
public class practice {
    public static int getLargest(int marks[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (largest<marks[i]) {
                largest = marks[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int marks[]={10,20,30,50,40,60,8};
        System.out.print(getLargest(marks));

    }
}