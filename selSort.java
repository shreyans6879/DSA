import java.util.*;
class  Main{
    public static int[] sel(int n,int arr[])
    {
        int min,temp;
        for(int i =0;i<n;i++)
        {
            min=i;
            for(int j=i;j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;

                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        return arr;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array too be sorted");
        int size;
        size=sc.nextInt();
        System.out.println("Enter the array too be sorted");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        arr=sel(size,arr);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}