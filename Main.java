import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
   String[] foo = {"abc", "123", "def"}
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0;
    for (int i =0; i < arr.length; i++) 
    {
      String elem = arr[i];
      if(targetLength == elem.length())
      {
        count++;
      }

    }       return 0;
  }

  public static int indexOf(double[] arr, double target)
  {
    for (int i=0; i < arr.length; i++)
    {
      double elem = arr[i]
      if (target == hai)
      {
        return i
      }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
for (int i = 0; i < arr.length; i++)    
{
  int target = arr[i];
  for (int j = 0; j < arr.length; j++)
  {
    int elem = arr[j];
    if (target == elem && i !=j)
    {
      return false;
    }
  }
}

  }

  public static String findMode(String[] arr)
  {
    String count = 0;
    String mode = arr[0];
    String max_count = 0;
    for (int i = 0; i < arr.length; i++)
    {
      String target = arr [i];
      count = 0;
      for (int j = 0; j < arr.length; j++)
      {
        if(arr[j].equals(target))
        {
          count++;
        }
      }
      if (count > max_count)
      {
        max_count = count;
        mode = arr[i];
      }

    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    return null;
  }
}
