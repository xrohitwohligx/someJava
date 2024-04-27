import java.util.Scanner;

public class first{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int z = a + b;
        System.out.print(z);

        // Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println("Adult");
        }else if(age < 18 && age >= 5){
            System.out.println("not a adult");
        }else{
            System.out.println("still a child");
        }

        //pattern 1: 

        //      *
        //     **
        //    ***
        //   ****
        int n = 4;
        for(int i=1; i<=n; i++){
            //spaces 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // stars 
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //pattern 2:

        // 12345
        // 1234
        // 123
        // 12
        // 1
        // int n=5;     
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //pattern 3:

        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // int n=5;
        for(int i=1; i<=n; i++){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            } 
            // spaces 
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }

            //stars 
            for(int l=1; l<=i; l++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=n; i>=1; i--){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            } 
            // spaces 
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }

            //stars 
            for(int l=1; l<=i; l++){
                System.out.print("*");
            }

            System.out.println();
        }

        //pattern 4: 

        //      *****
        //     *****
        //    *****
        //   *****
        //  *****
        // int n=5;
        for(int i=0; i<n; i++){
            // spaces 
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }

            // stars 
            for(int k=0; k<5; k++){
                System.out.print("*");
            }

            System.out.println();
        }

        //pattern 5:
        //     1 
        //     2 2 
        //    3 3 3 
        //   4 4 4 4 
        //  5 5 5 5 5 
        // int n=5;
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars 
            for(int k=1; k<=i; k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        
    }
}

