public class SortAlgorithms {

    public static void bubbleSort(Item arr[], int n){

        for(int i = 0; i < n-1; i++){

            for(int j = 0; j < n-i-1; j++){

                // Sort by ID in ascending order
                if(arr[j].id > arr[j+1].id){

                    Item temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Items sorted by ID.");
    }
}