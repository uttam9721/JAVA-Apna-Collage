public class updateArray {
    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={9,19,29,39,49,59,69,79,89,99};
        update(marks);
        System.out.println("Updated Marks");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}