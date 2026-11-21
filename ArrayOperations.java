public class ArrayOperations {
    public static void main(String[] args) {
        int a[]={20,40,30,50,10};
        int ans=0;
        for(int i:a){
             ans=ans+i;
        }
        System.out.println(ans);
        System.out.println(a.length);
        System.out.println("average of array:"+ans/a.length);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:a){
            if(max<i){
                max=i;
            }
            else{
                min=i;
            }
        }
        System.out.println("maximum no of an array-:"+max);
        System.out.println("minimum no of an array-:"+min);
        
    }
}
