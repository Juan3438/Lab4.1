public class Runner {
    public static void main(String args)
    {
        int LIMIT = 50;
        int LENGTH = 50;

        InPlaceSorts.insertionSort(randomIntArray(LIMIT,LENGTH));
        InPlaceSorts.selectionSort(randomDoubleArray(LIMIT,LENGTH));
        InPlaceSorts.bubbleSort(randomStringArr(LIMIT,LENGTH));
    }
    public static int[] randomIntArray(int lim,int length)
    {
        int[] arr = new int[length];
        for(int i =0; i < length;i++)
        {
            int num = (int)(Math.random()*lim);
            arr[i] = num;
        }
        return arr;
    }
    public static double[] randomDoubleArray(int lim,int length)
    {
        double[] arr = new double[length];
        for(int i =0; i < length;i++)
        {
            double num = (Math.random()*lim);
            arr[i] = num;
        }
        return arr;
    }
    public static String[] randomStringArr(int num,int length)
    {
        String[] arr = new String [num];
        while(num > 0)
        {
            int i = 0;
            String s = "";
            while (i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
}
