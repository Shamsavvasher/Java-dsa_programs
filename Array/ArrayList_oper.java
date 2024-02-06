import java.util.ArrayList;
public class ArrayList_oper{
    public static void main(String args[]){
        //className objectName=new className
        ArrayList<Integer> list=new ArrayList<>();


        //add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // System.out.println(list.size());

        // //Get operation
        // int element=list.get(2);
        // System.out.println(element);
        
        // //Remove element
        // list.remove(2);
        // System.out.println(list);

        // //set Element at index
        // list.set(1,5);
        // System.out.println(list);

        // //contain
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(4));

        //Reverse print
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        //Find maximum value of arraylist
        int max=Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            max=Math.max(max,list.get(i));

            }
            System.out.println("max element="+max);
        
    }
}