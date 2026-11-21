import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
    System.out.println(Arrays.toString(moveZerosAtLast(arr)));
    }
    public static int[] moveZerosAtLast(int arr[]){
        int ans[]=new int[arr.length];
        for(int i=0,j=0;i<arr.length;i++){
            if(arr[i]!=0){
                ans[j]=arr[i];
                j++;
            }
        }
        return ans;
    }
}
