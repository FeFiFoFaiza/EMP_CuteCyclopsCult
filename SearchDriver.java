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

/*
  //compare the two Search methods
  public static void compare(Comparable[] arr, int target){
    long linT, binT, timeDiff;
    linT = linTime(arr, target);
    binT = binTime(arr, target);
    timeDiff = Math.abs(binT - linT);

    System.out.println("linT: " + linT);
    System.out.println("binT: " + binT);
    System.out.println("Testing with dataset size: " + arr.length);

    if (linT < binT) {
      System.out.println("LinearSearch is faster by " +
                         timeDiff + " milliseconds.");
    } else if (linT == binT) {
      System.out.println("Took the same time.");
    } else if (linT > binT) {
      System.out.println("BinarySearch is faster by " +
                         timeDiff + " milliseconds.");
    }

  }
*/

  //compare the two Search methods with multiple trials
  public static void compareAvg(Comparable[] arr){
    int trials = 100; //set to 100 trials now
    int target;
    long linAvg, binAvg, linSum, binSum;
    long timeDiff;
    linSum = 0;
    binSum = 0;

    System.out.println("Testing with dataset size: " + arr.length);

    //take avg of linearSearch trials
    for (int i = 0; i < trials; i++){
      target = (int)(Math.random()*arr.length);
      linSum += linTime(arr, target);
    }
    linAvg = linSum / trials;

    //take avg of binarySeach trials
    for (int i = 0; i < trials; i++){
      target = (int)(Math.random()*arr.length);
      binSum += binTime(arr, target);
    }
    binAvg = binSum / trials;



    timeDiff = Math.abs(linAvg - binAvg);
    //compare averages
    if (linAvg < binAvg) {
      System.out.println("LinearSearch is faster by " +
                         timeDiff + " milliseconds.");
    } else if (linAvg == binAvg) {
      System.out.println("LinearSearch and BinarySearch took the same time.");
    } else if (linAvg > binAvg) {
      System.out.println("BinarySearch is faster by " +
                         timeDiff + " milliseconds.");
    }

  }


  public static void main(String[] args){

    //test case with 0.75 million numbers
    Comparable[] test1 = new Comparable[750_000];
    populate(test1);
    compareAvg(test1);

    System.out.println();
    System.out.println();

    //test case with 100 million numbers
    Comparable[] test2 = new Comparable[100_000_000];
    populate(test2);
    compareAvg(test2);

  } //end of main
} //end of class
