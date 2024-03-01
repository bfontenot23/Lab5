package II;

import java.util.ArrayList;

public class Recursion {

    public static int recursiveBinarySearch(ArrayList<Integer> inList, int target)
    {
        int min = 0, max = inList.size()-1, mid;
        do {
            mid = (min+max)/2;
            if(inList.get(mid)==target) return mid;
            else if(inList.get(mid)>target) max = mid-1;
            else if(inList.get(mid)<target) min = mid+1;
        } while(min<=max);

        return -1;
    }


    public static void main(String[] args)
    {
        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.add(5);
        sortedList.add(10);
        sortedList.add(20);
        sortedList.add(30);
        sortedList.add(40);
        int target = 20;
        int result = recursiveBinarySearch(sortedList, target);
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the list");
        }
    }
}
