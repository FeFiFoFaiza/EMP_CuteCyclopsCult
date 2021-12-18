public class SearchDriver {


  //populate array
  public static void populate(Comparable[] a){
    for (int i = 0; i < a.length; i++){
      a[i] = i;
    }

  }

  //record time for Binary Search
  public static long binTime(Comparable[] a, int target){
    long beforeS, afterS;
    long diff;

    beforeS = System.currentTimeMillis();
    BinSearch.binSearch(a, target);
    afterS = System.currentTimeMillis();

    diff = afterS - beforeS;
    return diff;
  }


  //record time for Linear Search
  public static long linTime(Comparable[] a, int target){
    long beforeS, afterS;
    long diff;

    beforeS = System.currentTimeMillis();
    LinSearch.linSearch(a, target);
    afterS = System.currentTimeMillis();

    diff = afterS - beforeS;
    return diff;
  }

  //compare the two Search methods
  public static void compare(Comparable[] arr, int target){
    long linT, binT, timeDiff;
    linT = linTime(arr, target);
    binT = binTime(arr, target);
    System.out.println("linT: " + linT);
    System.out.println("binT: " + binT);
    System.out.println("Testing with dataset size: " + arr.length);

    if (linT < binT) {
      timeDiff = binT - linT;
      System.out.println("LinearSearch is faster by " +
                         timeDiff + " milliseconds.");
    } else if (linT == binT) {
      System.out.println("Took the same time.");
    } else if (linT > binT) {
      timeDiff = linT - binT;
      System.out.println("BinarySearch is faster by " +
                         timeDiff + " milliseconds.");
    }

  }



  //store multiple test cases?
  /*
  public static linResults( long a);

  public static binResults( long a);
  */


  public static void main(String[] args){
    long beforeS, afterS;

    //test case with 10000000
    Comparable[] test1 = new Comparable[10000000];
    populate(test1);

    compare(test1, 99999);
    compare(test1, -6);



  } //end of main
} //end of class
