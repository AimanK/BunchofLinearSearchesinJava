import java.util.Arrays;

class Main {
  public static void main(String[] args) {

    //Int array test values
    int[] testarr = {24,14,3,1,19,28,38,15,48,79};
    int target = 15;

    int ans = linearSearch(testarr,target);

    System.out.println(ans);


    //String search test values
    String testStr = "Hello";
    char target1 = 'o';

    boolean ans1 = searchString(testStr, target1);

    System.out.println(ans1);


    // Min value search test values
    int ans2 = minSearch(testarr);

    System.out.println(ans2);


    // 2-D array search test values
    int[][] testarr2 = { {3,1,4,5,6,8} , 
                         {0,2,4,7,9,12} };

    int target2 = 12;

    int[] ans3 = twodimenSearch(testarr2, target2);

    System.out.println(Arrays.toString(ans3));




  }


    // Search linearly through an integer array
    static int linearSearch(int[] arr, int target) 
  {
    if (arr.length == 0) 
    {
      return -1;
    }

    for (int index = 0; index < arr.length; index++)
    {
      if (arr[index] == target)
      {
        return index;
      }

    }

    return -1;


  }


  // Linear Search in string
  static boolean searchString(String str, char target1) 
  {
      if (str.length() == 0)
      {
        return false;
      }

      for (int index = 0; index < str.length(); index++)
      {
        if (target1 == str.charAt(index))
        {
          return true;
        }

      }

      return false;

  }



  // Linear Search min value in array
  static int minSearch(int[] arr) 
  {
    if (arr.length == 0)
    {
      return -1;
    }

    int min = arr[0];

    for (int index = 1; index < arr.length; index++)
    {
      
      if (arr[index] < min)
      {
        min = arr[index];
      }

    }

    return min;
  }



  static int[] twodimenSearch(int[][] arr, int target)
  {
      if (arr.length == 0)
      {
        return new int[]{-1, -1};
      }

      for (int row = 0; row < arr.length; row++)
      {
        for (int col = 0; col < arr[row].length; col++)
        {
          if (target == arr[row][col])
          {
            return new int[]{row, col};
          }
        }
      }

      return new int[]{-1, -1};
  }

}