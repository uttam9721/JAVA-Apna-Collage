import java.util.Scanner;

class sum{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter a no r ");
          float r = sc.nextFloat(); 
          float rad = r*r;
          float area = 3.14*rad;
          System.out.println(area);
    }
}