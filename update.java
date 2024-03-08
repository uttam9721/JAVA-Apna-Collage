public class update {
    public static void updateval(int marks[],int  key ){
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int marks[]={10,20,30,40,50};
        int key 20;
        int  index = updateval(marks, key);
        for (int i = 0; i < marks.length; i++) {
            if (index==-1) {
                System.out.print("not matched");
            }else{
                System.out.print(" matched "+index);
            }
        }
    }
}
