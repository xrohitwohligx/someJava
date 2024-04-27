public class arrayProblems {
    // search elements in an array 
    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if( arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    // reverse an array 
    public static void reverseArray(int num[]){
        int first = 0;
        int last = num.length-1;

        while(first < last){

            //swap 
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }
    // make pairs from the given array 
    public static void pairArray(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int current = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print( "(" + current + ' ' + numbers[j] + " )");
                tp++;
            }
            System.out.println();
        }
        System.out.println("the total pairs is " + tp);
    }
    // make subarrays 
    public static void subarrays(int arrays[]){
        int total = 0;
        int sum = 0;
        for(int i=0; i<arrays.length; i++){
            int start = i;
            for(int j=i; j<arrays.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arrays[k] + " ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the total subarray is " + total);
    }
    // calculaing sum of subarray >> brute force method
    public static void sumArrays(int sumArray[]){
        int maxSum = Integer.MIN_VALUE;
        System.out.println("ths is maxsum black" + maxSum);
        int currentSum = 0;
        for(int i=0; i<sumArray.length; i++){
            int start = i;
            for(int j=i; j<sumArray.length; j++){
                int end = j;
                currentSum = 0;
                for(int k=start; k<end; k++){
                    currentSum += sumArray[k];
                }
                System.out.println( currentSum);
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println(" tha mx sum is " + maxSum);
    }
    //kadane algorithm but max val should be 0 
    public static void kadane(int karray[]){
        int maxNum = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<karray.length; i++){
            cs += karray[i];
            if(cs < 0){
                cs = 0;
            }
            maxNum = Math.max(cs, maxNum);
        }
        System.out.println(maxNum);
    }
    //kadane algorithm with -ve 
    public static void kadaneNegative(int nums[]){
        int mx = nums[0];
        int cs = nums[0];
        for(int i=1; i<nums.length; i++){
            cs = Math.max(nums[i], cs + nums[i]);
            cs = Math.max(cs , mx);
        }
        System.out.println(mx);
    }
    // rotate the array to left by 1
    public static void rotateArray1(int arr[]){
        int temp = arr[0];
        int n = arr.length;
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        //find index in array
        // int arr[] = {12,45,67,20,65,77,88};
        // int key = 20;
        // int ans = linearSearch(arr, key);
        // if(ans == -1){
        //     System.out.println("not found");
        // }else{
        //     System.out.println(ans);
        // }

        // reverse a array
        // int num[] = {12,43,6,44,66,9};
        // reverseArray(num);
        // for(int i=0; i<num.length; i++){
        //     System.out.println(num[i] + " ");
        // }

        // int numbers[] = {2,4,6,8,9};
        // pairArray(numbers);
        
        // int arrays[] = {3,4,6,7};
        // subarrays(arrays);

        // int sumArray[] = {2,4,5,6,7};
        // sumArrays(sumArray);

        int karray[] = {-3,-2,1,4,3,-3};
        kadane(karray);

        int nums[] = {-3,-2,1,4,3,-3};
        kadaneNegative(nums);

        int arr[] = {2,3,4,5,6};
        rotateArray1(arr);
    }
}
