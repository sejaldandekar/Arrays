public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int search=50;
        System.out.println(linearSearch(arr,search));
    }
    public static int linearSearch(int arr[],int search){
       int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
              return i;
            }
        }
        return -1;
    }
}
