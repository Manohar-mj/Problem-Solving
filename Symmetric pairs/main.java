class Main{
    
   public static void main(String arg[])
   {
       int arr[][] = new int[5][2];
       
       arr[0][0] = 8;
       arr[0][1] = 2;
       arr[1][0] = 3;
       arr[1][1] = 2;
       arr[2][0] = 3;
       arr[2][1] = 8;
       arr[3][0] = 2;
       arr[3][1] = 3;
       arr[4][0] = 8;
       arr[4][1] = 3;

       for (int i = 0; i < 5; i++){
           for (int j = i + 1; j < 5; j++){
              if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0])
                  System.out.println("(" + arr[i][0] + ", " + arr[i][1] + ")");
          }
       }

   }
}
