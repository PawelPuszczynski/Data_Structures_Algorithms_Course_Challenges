import java.util.Arrays;

// MY WORKING SOLUTION
public class Solution {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
             firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            recursiveInsert(firstUnsortedIndex,intArray,newElement);
//            System.out.println("Got out");
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void recursiveInsert ( int i, int [] arr, int newElement) {
        if (i==0 || arr[i-1]< newElement) {
            return;
        }
//        System.out.println(Arrays.toString(arr));
        arr[i]=arr[i-1];
        arr[i-1]=newElement;
        i--;

        System.out.println(Arrays.toString(arr));
        recursiveInsert(i, arr,newElement);

    }
}
