public class Bin_dec{
    public static void bindec(int binNum){
         int myNum=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastDigit=binNum%2;
            decNum=decNum+(lastDigit*(int)Math.pow(10,pow));
            pow++;
            binNum=binNum/2;
        }
        System.out.println("decimal of "+myNum+"="+decNum);
    }
    public static void main(String args[]){
        bindec(10);
    }
}