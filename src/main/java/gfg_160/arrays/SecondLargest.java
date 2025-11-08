package gfg_160.arrays;

public class SecondLargest {

    public int getSecondLargest(int[] arr) {
        int second=-1, temp=arr[0];
        for(int i=1; i<arr.length;i++){
            if (temp == arr[i]) continue;
            else if(temp<arr[i]){
                second=temp;
                temp=arr[i];
            }else if(second<arr[i] && temp != arr[i]){
                second=arr[i];
            }
        }
        return second;
    }

}
