import java.util.*;

public class array {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // 1D Array
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int xx = sc.nextInt();

        //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == xx){
                System.out.print(" the number found " + xx);
            }
        }

        // 2D Array 
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] newArray = new int[rows][cols];
        

        //input 
        for(int i=0; i<rows; i++){
            //cols
            for(int j=0; j<cols; j++){
                newArray[i][j] = sc.nextInt();
                
            }
            System.out.println();
        }

        // getting what number we want from array
        int x = sc.nextInt();
        // output 
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if( newArray[i][j] == x){
                     System.out.print(" x Found " + i +" "+ j);
                }
            }
        }
        
    }
}
