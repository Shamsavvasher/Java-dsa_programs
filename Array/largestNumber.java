public class largestNumber{
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int numbers[]={1,3,4,5,6};
        System.out.println("largest of number in array"+getlargest(numbers));
    }
}