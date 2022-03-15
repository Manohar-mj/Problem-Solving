import java.util.Arrays;
class Main
{
   public static void countFreq(int arr[], int n)
   {
         boolean visited[] = new boolean[n];
         Arrays.fill(visited, false);
         for (int i = 0; i < n; i++) {
            if (visited[i] == true)
             continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                   visited[j] = true;
                   count++; }}
            System.out.println(arr[i] + "  " + count );}}
   public static void main(String []args){
      int arr[] = new int[]{10, 80, 70, 60, 60, 10, 90, 30};
      int n = arr.length;
      countFreq(arr, n);
   }
}
