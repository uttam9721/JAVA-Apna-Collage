import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        System.out.println("enter a number ");
    Scanner sc= new Scanner(System.in);
    int age=sc.nextInt();
    if(age<=12){
        System.out.println("child");
    }
    else if(age>12 && age<81){
        System.out.println("teneser ");
    }

    }
}
