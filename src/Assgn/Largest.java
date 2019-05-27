package Assgn;

public class Largest {
int i,j;
    void sort(int arr[])
    {
        int n = arr.length;
        for (i = 0; i < n-1; i++)
        {
            for ( j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
       
    } 
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
        {
            System.out.print(arr[i] + " ");
        System.out.println();
        }
        System.out.println("largest no. is :"+arr[n-1]);
    }
    public static void main(String args[])
    {
        Largest ob = new Largest();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
       ob.sort(arr);
       ob.printArray(arr);
    }
}


