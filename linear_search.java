import java.util.Scanner;
import java.lang.Thread;
public class linear_search extends Thread
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of the array: ");
        int l = sc.nextInt();

        System.out.println("Enter the elements....");
        int a[] = new int[l];
        for(int i = 0; i < l; i++){
            a[i] = sc.nextInt();
        }
        /* Displaying the array */
        System.out.println();
        System.out.println("ARRAY ELEMENTS--");

        try{
            for(int i: a){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println();
        System.out.print("Enter the value you want to find: ");
        int f = sc.nextInt();

        /* Linear Search Algorithm */
        Engine(a, l, f);
    }

    public static void Engine(int arr[], int lmt, int find){
        int count = 0;
        int count_index = 0;

        for(int i= 0; i < lmt; i++){
            
            if(arr[i] == find){
                count ++;
                count_index = i;
            }
        }
        System.out.println();
        if(count > 0){
            System.out.println("Element found "+count+" times in the position: "+count_index);
        }
        else{
            System.out.println("Element not found !");
        }
    }
}