public class SortingArr {
    public static void Sorting(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minNum=i;
            for(int j =i+1; j < arr.length;j++){
                if (arr[minNum]>arr[j]) {
                    minNum=j;
                }
            }
            int temp=arr[minNum];
            arr[minNum]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,2,50,6,9,1};
        Sorting(arr);
        
        //System.out.print(ans+" ");
    }
    
}
