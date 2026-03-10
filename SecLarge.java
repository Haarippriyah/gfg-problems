class Solution {

    static int getSecondLargest(int[] arr) {

        int largest = -1;
        int secondLargest = -1;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;

            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        return secondLargest; 
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 8, 20};

        System.out.println(getSecondLargest(arr));  
    }
}