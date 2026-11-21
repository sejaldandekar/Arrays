public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {10, 20, 50, 40, 30, 60};
        int max=secondLargest(arr);
        System.out.println(max);
    }
    public static int secondLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                ans=max;
                max=arr[i];
            }
            else if(arr[i]<max&&arr[i]>ans){
                ans=max;
            }
        }
        return ans;
    }
}
