package gfg_160.arrays;

public class NextPermutation {

    void nextPermutation(int[] arr) {
        int pivot = -1;
        for (int i=arr.length-1;i>=1;i--){
            if(arr[i] > arr[i-1]){
                pivot=i-1; break;
            }
        }

        if(pivot == -1){
            reverse(arr, 0, arr.length-1);
            return;
        }

        for(int i=arr.length-1;i>pivot;i--){
            if(arr[pivot] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }
        reverse(arr,pivot+1,arr.length-1);
    }

    static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;j--;
        }
    }
}
