public class CountPrime {
    public static void main(String[] args) {
       int count=0;
        for(int i=0;i<=100;i++){
        if(countIsPrimeNo(i)){
            count++;
        }
        }
        System.out.println("Count of prime numbers between 1 to 100-: "+count);
    }
    public static boolean countIsPrimeNo(int n) {
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
