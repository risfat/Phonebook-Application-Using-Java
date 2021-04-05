package phoneBookApplication;

import java.util.ArrayList;

public class Functions {

    // Function to partition the array on the basis of pivot element
    int partition(ArrayList<Person> arr, int low, int high) {

        // Select the pivot element
        String pivot = arr.get(high).getFirstName();
        int i = (low - 1);

        // Put the elements smaller than pivot on the left and
        // greater than pivot on the right of pivot
        for (int j = low; j < high; j++) {
            if (arr.get(j).getFirstName().compareTo(pivot) <= 0) {
                i++;
                Person temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        Person temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return (i + 1);
    }

    void quickSort(ArrayList<Person> arr, int low, int high) {
        if (low < high) {

            // Select pivot position and put all the elements smaller
            // than pivot on left and greater than pivot on right
            int pi = partition(arr, low, high);

            // Sort the elements on the left of pivot
            quickSort(arr, low, pi - 1);

            // Sort the elements on the right of pivot
            quickSort(arr, pi + 1, high);
        }

    }




    // returns if x is present
    // else return -1
    // 1,2,3,4,5,6,7,8,9,10

    int firstName_bs(ArrayList<Person> arr, String x) {

        x = x.toLowerCase();

        int left = 0, right = arr.size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr.get(mid).getFirstName().toLowerCase().equals(x))
                return mid;

            // If x greater, ignore left half
            if (arr.get(mid).getFirstName().toLowerCase().compareTo(x) < 0)
                left = mid + 1;

                // If x is smaller, ignore right half
            else
                right = mid - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }


    int lastName_bs(ArrayList<Person> arr, String x) {

        x = x.toLowerCase();

        int left = 0, right = arr.size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr.get(mid).getLastName().trim().toLowerCase().equals(x))
                return mid;

            // If x greater, ignore left half
            if (arr.get(mid).getLastName().trim().toLowerCase().compareTo(x) < 0)
                left = mid + 1;

                // If x is smaller, ignore right half
            else
                right = mid - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }


    int number_bs(ArrayList<Person> arr, String x) {


        int left = 0, right = arr.size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr.get(mid).getContactNumber().equals(x))
                return mid;

            // If x greater, ignore left half
            if (arr.get(mid).getContactNumber().compareTo(x) < 0)
                left = mid + 1;

                // If x is smaller, ignore right half
            else
                right = mid - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }








}
