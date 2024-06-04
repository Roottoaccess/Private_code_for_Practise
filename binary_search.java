import java.util.Scanner;
import java.lang.Thread;
public class binary_search extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of the array: ");
        int l = sc.nextInt();

        /* Creating the array */
        int a[] = new int[l];

        System.out.println("Insert Element....");
        for(int i = 0; i < l; i++){
            a[i] = sc.nextInt();
        }

        /* We have to sort the array before
         * using the Binary Search Algorithm
         */
        int temp = 0;
        for(int i = 0; i < l - 1; i++){
            for(int j = 0; j < l - 1; j++){
                if(a[j] > a[j + 1]){
                    /* Swapping */
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Your Array is....");

        try{
            for(int i: a){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println();
        System.out.print("Enter the value you want to find for binary search: ");
        int f = sc.nextInt();
        /* Binary Search Algorithm */
        if(Engine(a,l,f) != -1){
            System.out.println("Element found in the index: "+Engine(a,l,f));
        } else {
            System.out.println("Element not found...");
        }
    }
    public static int Engine(int arr[], int lmt, int find){
        
        int low = 0;
        int high = lmt - 1;

        for(int i = 0; i < lmt; i++){
            int middle = (low + high) / 2;

            if(find == arr[middle]){
                return middle;
            } else if(find < arr[middle]){
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
