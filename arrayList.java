import java.util.*;

class arrayList{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add elements 
        list.add(23);
        list.add(11);
        list.add(26);

        System.out.println(list);
        // get elements 
        int element = list.get(1);
        System.out.println(element);

        // adding a element in middle
        list.add(1, 17);
        System.out.println(list);

        //setting a element in middle
        list.set(3, 77);
        System.out.println(list);

        //removing a element 
        list.remove(2);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for(int i=0; i<size; i++){
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);
    }
}

// public class arrayList {
    
// }