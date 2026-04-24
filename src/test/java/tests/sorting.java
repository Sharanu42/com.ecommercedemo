package tests;

import java.util.Arrays;

public class sorting {

    public static void main(String[] args) {

        int arr[]={2, 1, 4, 7, 5};
        System.out.println("Array before sorting" + Arrays.toString(arr));
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                if(arr[j]>arr[j+1]);
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting" + Arrays.toString(arr));
    }
}
