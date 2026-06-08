package TakeUForward;

public class NextPermutation  {
    public static void main(String[] args){
        int[] arr = {1, 3, 2};

        // STEP 1 — Find pivot
        int pivot = -1;
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }

        // STEP 2 — Find smallest number greater than pivot
        // scan from right, find first number > arr[pivot]
        int swapIndex = -1;
        for(int i = arr.length - 1; i > pivot; i--){
            if(arr[i] > arr[pivot]){
                swapIndex = i;
                break;
            }
        }

        // STEP 3 — Swap pivot with swapIndex
        int temp = arr[pivot];
        arr[pivot] = arr[swapIndex];
        arr[swapIndex] = temp;

        // STEP 4 — Reverse everything after pivot
        int left = pivot + 1;
        int right = arr.length - 1;
        while(left < right){
            int temp2 = arr[left];
            arr[left] = arr[right];
            arr[right] = temp2;
            left++;
            right--;
        }

        // Print result
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}