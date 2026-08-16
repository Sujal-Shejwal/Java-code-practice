// Selection Sort

public class Sor2 {
    public static void selectionSort(int arr[]){
        for (int i=0 ; i<arr.length-1;i++){
            int minPos=i;
            for (int j=i;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={0,2,3,1,-1};
        selectionSort(arr);
        printArr(arr);
    }
}
