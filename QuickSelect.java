import java.io.*;
import java.util.*;
public class QuickSelect
{
  public static void main(String []args)throws Exception
  {
    Scanner s= new Scanner(System.in);
    int n = s.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    int k=s.nextInt();
    quickselect(arr, 0, arr.length-1, k-1);
  }
  public static void Swap(int []arr, int i, int j)
  {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp= arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
  public static void print(int []arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static int  paritition (int []arr, int low, int high, int pi)
  {
    int i= low;
    int j= low;
    while(i<=high)
    {
      if(arr[i]<=pi)
      {
        swap(arr,i,j);
        i++;
        j++;
      }else
      {
        i++;
      }
    }
    System.out.println("pi ->"+(j-1));
    return (j-1);
  }
  public static int quickselect(int []arr,int low, int high, int k)
  {
    int pivot= arr[high];
    int pivotindex= partition(arr,low,high,pivot);
    if(k<pivotindex)
    {
      return quickselect(arr,low, pivotindex-1, k);
    }else if(k>pivotindex) 
    {
      return quickselect(arr, pi+1, high, k);
    }
    else
    {
      return pivot;
    }
      
  }
}
