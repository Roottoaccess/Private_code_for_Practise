import java.util.Scanner;
import java.lang.Thread;
public class insertion_sort extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of the array: ");
        int l = sc.nextInt();

        int a[] = new int[l];

        /* Enter the value */
        System.out.println("Enter Elements....");
        for(int i = 0; i < l; i++){
            a[i] = sc.nextInt();
        }

        /* Display the array */
        System.out.println();
        System.out.println("Array before sorting....");
        try{
            for(int i: a){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println();
        }

        /* Insertion Sort Algorithm */
        Engine(a, l);


        System.out.println();
        System.out.println("Array after sorting....");
        try{
            for(int i: a){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println();
        }
        System.out.println();
    }
    public static void Engine(int arr[], int lmt){
        /* Algorithm Logic */
        int i; int j; int key;

        for(i = 1;i < lmt; i++){
            key = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j] > key){
                /* Shifting the value */
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }   
}
