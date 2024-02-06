public class linearSearch{

    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String args[]){
        int numbers[]={1,2,4,3,5,6,7,8};
        int key=7;
        int index=linearSearch(numbers,key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Element found at "+index);
        }
    }
}