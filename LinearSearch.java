import java.util.*;

public class LinearSearch {

    public static int search(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be found: ");
        int target = sc.nextInt();

        int result = search(arr, target);

        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}