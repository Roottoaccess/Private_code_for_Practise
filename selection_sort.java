import java.util.Scanner;
import java.lang.Thread;
public class selection_sort extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Take the limit of the array */
        System.out.print("Enter the limit of the array: ");
        int l = sc.nextInt();

        int a[] = new int[l];

        System.out.println("Enter elements....");
        for(int i = 0; i < l; i++){
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Array before Sorting....");
        try{
            for(int i: a){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        /* Now the selection Sort Algorithm */
        Sel_sort(a, l);

        System.out.println();
        System.out.println("Array after Sorting....");
        try{
            for(int i: a){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void Sel_sort(int arr[], int lmt){
        int temp = 0;
        for(int i = 0; i < lmt - 1; i++){
            int min = arr[i];
            int min_index = i;

            for(int j = i + 1; j < lmt - 1; j++){
                if(arr[j] < min){
                    min = arr[j];
                    min_index = j;
                }
            }
            /* Swipping */
            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}
