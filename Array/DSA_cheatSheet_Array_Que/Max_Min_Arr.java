public class Max_Min_Arr{

    public static void main(String args[]){
        //create an array with unsorterd
        int arr[]={3,5,4,1,9};
        //next i will intialize max and min with index of array 0
        int max=arr[0];
        int min=arr[0];
        
        //next i will iterate for loop 
        for(int i=0; i<arr.length; i++){
            //then i will check the condition if array of i is greater that max
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            

        }
        System.out.println("the Maximum element in the array"+max);
            System.out.println("the minimum element in the array is"+min);
    }
}