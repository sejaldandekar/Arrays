public class ArmstrongNo {
    public static void main(String[] args) {
        System.out.println(isArmstrongNo(153));
    }
    public static boolean isArmstrongNo(int n){
        int original=n,cnt=0,sum=0,pow,temp=n;
        
        while(n!=0){
            cnt++;
            n=n/10;
        }
        for(int i=0;i<cnt;i++){
            int digit=temp%10;
            pow=1;
            for(int j=0;j<cnt;j++){
                pow=pow*digit;
            }
            sum=sum+pow;
            temp=temp/10;
        }
        return original==sum;
    }
}
