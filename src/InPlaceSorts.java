public class InPlaceSorts {
    public static void insertionSort(int[] arr)
    {
        for(int i =1; i<arr.length;i++)
        {
            for(int j = i; j > 0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    swapint(arr,j-1,j);
                }
            }
        }
    }
    public static void selectionSort(double[] arr)
    {
        int swap = 0;
        double min = 0.0;
        for(int i =0; i <arr.length;i++)
        {
            swap = i;
            min = arr[i];
            for(int j = i;j<arr.length;j++)
            {
                if(arr[j]<min)
                {
                    swap = j;
                    min = arr[j];
                }
            }
            swapdouble(arr,i,swap);
        }
    }
    public static void bubbleSort(String[] list1)
    {
         boolean done = false;
         while(!done){
             done = true;for(int i =0; i<list1.length; i++) {
                 if (list1[i].length() > list1[i+1].length()) {
                     done = false;
                     swapString(list1, i , i+1);
                 }
             }
         }
    }
    public static void swapint(int[] arr ,int pos1, int pos2)
    {
        int obj1 = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = obj1;
    }
    public static void swapdouble(double[] arr ,int pos1, int pos2)
    {
        double obj1 = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = obj1;
    }
    public static void swapString(String[] arr ,int pos1, int pos2)
    {
        String obj1 = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = obj1;
    }
 }