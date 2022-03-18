class Main {
    static void leftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++) leftRotatebyOne(arr, n);
    }
    static void leftRotatebyOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++) arr[i] = arr[i + 1];
        arr[n - 1] = temp;
    }
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 1};
        leftRotate(arr, 2, 5);
        printArray(arr, 5);
    }
}
