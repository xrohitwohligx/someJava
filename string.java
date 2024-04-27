import java.util.*;


public class string {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length()-1;
            if(str.charAt(i) != str.charAt(n-i)){
                return false;
            }

        }
        return true;
    }
    public static void main(String args[]){
         // String builder 
         StringBuilder sb = new StringBuilder("Rohit");

         //reversing a string 
         for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontside = sb.charAt(front);
            char backside = sb.charAt(back);

            sb.setCharAt(front, backside);
            sb.setCharAt(back, frontside);

         }
         System.out.println(sb); // tihoR

         //accessing the char 
         System.out.println(sb.charAt(0));
 
         //set a Alphabet 
         sb.setCharAt(0, 'M');
         System.out.println(sb);  //Mohit
 
         // inserting a alphabet
         sb.insert(4, 't');
         System.out.println(sb); // mohitt
 
         // deleting a char
         sb.delete(3, 4);
         System.out.println(sb);  // Mohit
 
         //appending element to a string 
         sb.append("Dubey");
         System.out.println(sb);  // MohitDubey
 
         // getting a length
         System.out.println(sb.length());

         String str = "A man, a plan, a canal: Panama";
         System.out.println(isPalindrome(str));

         String s1 = "rohit";
         String s2 = new String("rohit");

         // using a method to check if a string is equal
         if(s1.equals(s2)){
            System.out.println("strings are equal");
         }else{
            System.out.println("strings are not equal");
         }

         //comparing strings 
         String fruits [] = {"apple", "mango", "banana"};

         String largest = fruits[0];
         for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
         }
         System.out.println(largest);

    }
}
