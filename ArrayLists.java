import java.util.*;

class ArrayLists{
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        List<Integer> small_list=new ArrayList<>();
        //add
        arraylist.add(10);
        arraylist.add(11);
        arraylist.add(13);
        //adding at index
        arraylist.add(1,75);
        System.out.println(arraylist);
        small_list.add(10);
        small_list.add(1000);
        //aading a whole list to the another list
        arraylist.addAll(small_list);

        System.out.println(arraylist);  
        //adding  a whole list to another list at a specifica index
        arraylist.addAll(1, small_list);
        System.out.println(arraylist);
        System.out.println(arraylist.removeIf(n -> n%2==0));
        System.out.println(arraylist);
        //get and set
        
        arraylist.get(2);
        arraylist.set(1,31);
        System.out.println(arraylist);

    }
   
    
}