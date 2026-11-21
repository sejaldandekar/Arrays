public class EvenOddCount {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ans[]=evenOddCount(arr);
        System.out.println("Even numbers count-:"+ans[0]);
        System.out.println("Odd numbers count-:"+ans[1]);
    }
    public static int[] evenOddCount(int arr[])
    {
        int evenCount=0,oddCount=0;
        for(int i:arr){
            if(i%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        return new int[]{evenCount,oddCount};
    }
}
