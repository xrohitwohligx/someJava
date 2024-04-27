import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class recursion {

    public static void recursion1(int n){
        if(n == 5){
            return;
        }
        n += 1;
        System.out.println(n);
        recursion1(n+1);
    }
    // calculate sum of n numbers 
    public static void recursion2(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        recursion2(i+1, n, sum);

    }
    // calculate factorail 
    public static int recursion3(int n){
        if( n == 0  || n ==1){
            return 1;
        }
        int calFactorail = recursion3(n-1);
        int ans = n * calFactorail;
        return ans;
    }
    // print fibonacci series 
    public static void recursion4(int a, int b, int n){
        if( n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        recursion4(b, c, n-1);
    }
    //Tower of hanoi
    public static void hanoi(int n, String src, String help, String dest){
        if(n ==1 ){
            System.out.println("transfer disk " + n + " from " + src +  " to " + dest);
            return;
        }
        hanoi(n-1, src, dest, help);
        System.out.println("transfer disk " + n + " from " + src +  " to " + dest);
        hanoi(n-1, help, src, dest);
    }
    //reverse a string
    public static void reverseString(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx-1);
    }

    // finding occurance 
    public static int first = -1;
    public static int last = -1;
    public static void occurance(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }

        occurance(str, idx+1, element);
    }
    // check increasing array 
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }
    // add x to the string in the end 
    public static void addString(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar == 'x'){
            count++;
            addString(str, idx+1, count, newString);
        }else{
            newString += currentChar;
            addString(str, idx+1, count, newString);
        }
    }
    // removed all duplicates from the string
    public static boolean[] map = new boolean[26];
    public static void duplicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        if(map[currentChar - 'a']){
            duplicates(str, idx+1, newString);
        }else{
            newString += currentChar;
            map[currentChar - 'a'] = true;
            duplicates(str, idx+1, newString);
        }
    }
    // getting subsequence of a string
    public static void subSequence(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);

        subSequence(str, idx+1, newString+currentChar);

        subSequence(str, idx+1, newString);
    }
    // geeting subsequence but unique not duplicate 
    public static void uniqueSubSequence(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currentChar = str.charAt(idx);

        uniqueSubSequence(str, idx+1, newString + currentChar, set);

        uniqueSubSequence(str, idx+1, newString, set);
    }
    //keypad combination
    public static String[] keypad = {"." ,"abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKeypad(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0'];
        for(int i=0; i<mapping.length(); i++){
            printKeypad(str, idx+1, combination+mapping.charAt(i));
        }
    }
    // print permutation of a string
    public static void permutation(String str, String permutedString){
        if(str.length() == 0){
            System.out.println(permutedString);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            permutation(newStr, permutedString+currentChar);
        }
    }
    // count all the possible paths of a matrix 
    public static int pathOfMatrix(int i, int j, int n, int m){
        if( i == n || j == m){
            return 0;
        }
        if( i == n-1 && j == m-1){
            return 1;
        }
        int downPaths = pathOfMatrix(i+1, j, n, m);

        int rightPaths = pathOfMatrix(i, j+1, n, m);

        return downPaths + rightPaths;
    }
    // print all possbile way to placing the tiles in n*m matrix
    public static int tileMatrix(int n, int m){
        if( n == m){
            return 2;
        }
        if( n < m){
            return 1;
        }
        int vertPlacement = tileMatrix(n-m, m);
        int horizPlacement = tileMatrix(n-1, m);

        return vertPlacement + horizPlacement;
    }
    // calling our guest in a party in a pari or single i.e 1 or (1-2)
    public static int totalGuest(int n){
        if(n <= 1){
            return 1;
        }
       int way1 =  totalGuest(n-1);
       int way2 = (n-1) * totalGuest(n-2);

       return way1 + way2;
    }
    // print all subset for (123)
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subset){
        if( n == 0){
            printSubset(subset);
            return;
        }
        subset.add(n);
        findSubset(n-1, subset);

        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }
    // print all permutation of a string using backtracking
    public static void backtrack(String str, String premutatedString, int idx){
        if( str.length() == 0){
            System.out.println(premutatedString);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            backtrack(newStr, premutatedString+currentChar, idx+1);
        }
    }
    public static void main(String args[]){
        // int n = 1;
        // recursion1(n);

        // recursion2(1, 5, 0);

        // int ans = recursion3(5);
        // System.out.println(ans);

        // int a = 0, b = 1, n = 7;
        // System.out.println(a);
        // System.out.println(b);
        // recursion4(a, b, n);

        // int n = 4;
        // hanoi(n, "S", "H", "D");

        // String str = "rohit";
        // reverseString(str, str.length()-1);

        // String str= "abaabbaaccda";
        // occurance(str, 0, 'a');

        // int arr[] = {1,2,3,5};
        // System.out.print(isSorted(arr, 0));

        // String str = "axbxxcxdxx";
        // addString(str, 0, 0, "");

        // String str = "aabbccddddeeee";
        // duplicates(str, 0, "");

        // String Str = "abcd";
        // subSequence(Str, 0, "");

        // String str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // uniqueSubSequence(str, 0, "", set);

        // String str = "23";
        // printKeypad(str, 0, "");

        // String str = "abcde";
        // permutation(str, "");

        // int n = 3, m = 1;
        // int totalPaths = pathOfMatrix(0, 0, n, m);
        // System.out.println(totalPaths);

        // int n =2, m =2;
        // int totalMatrix = tileMatrix(n, m);
        // System.out.println(totalMatrix);

        // int n = 4;
        // int total = totalGuest(n);
        // System.out.println(total);

        // int n =3;
        // ArrayList<Integer> subset = new ArrayList<>();
        // findSubset(n, subset);

        String str = "ABCD";
        backtrack(str, "", 0);
    }
}
