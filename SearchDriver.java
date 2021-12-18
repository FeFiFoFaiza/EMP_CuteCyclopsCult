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
  public static void compare(Comparable[] a, int target){
    long linT, binT;

  }
  */

  //store multiple test cases?
  /*
  public static linResults();

  public static binResults();
  */


  public static void main(String[] args){
    long beforeS, afterS;

    //test case with 10000
    Comparable[] test1 = new Comparable[11474833];
    populate(test1);

    System.out.println(binTime(test1, 999999));
    System.out.println(binTime(test1, -5));
    System.out.println("------------------------");
    System.out.println(linTime(test1, 999999));
    System.out.println(linTime(test1, -5));



    /*
    long init, aft;
    init = System.currentTimeMillis();
    int index = BinSearch.binSearch(test1, -90);
    aft = System.currentTimeMillis();
    System.out.println(index);


    long difference = aft - init;
    System.out.println(init);
    System.out.println(aft);
    System.out.println(difference);
    */
  }
}
