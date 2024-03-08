public class LinearSearch {
    public static int search(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int key=20;
         int arr[]={10,20,30,40,50,60};
         int index = search(arr,key);  // Function call
         if (index==-1){
            System.out.print("not found");
         }else{
            System.out.print("found");
         }
    }
}
