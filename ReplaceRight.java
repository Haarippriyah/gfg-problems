class ReplaceRight {

    public static int[] replaceElements(int[] arr) {

        int maxRight = -1;   

        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];   
            arr[i] = maxRight;      
            if (current > maxRight) {
                maxRight = current; 
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};

        int[] result = replaceElements(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}