public class prime{

    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2; i<=n; i++){
            if(n%2==0){
                isprime=false;
            }
        }
        return isprime;
    }
    public static void main(String args[]){
        System.out.println(isprime(12));
    }
}