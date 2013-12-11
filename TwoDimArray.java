// BENEDICT BOLTON
// HW#41
// PD08
// 2013-12-10

// skeleton file for
// class TwoDimArray
// ...practice working with 2D arrays


public class TwoDimArray {

    //postcond: prints each row of 2D integer array a on its own line
    // uses a FOR loop
    public static void print1( int[][] a ) { //same as was demonstrated in class
        for (int r = 0; r < a.length; r++) {
	    for (int c = 0; c < a[r].length; c++) {
		System.out.print(a[r][c]);
		if ( c + 1 != a[r].length) { //used to make sure commas dont go on last element
		    System.out.print(", ");
		}
	    }
	    System.out.println(";"); //line breaking
        }
    }

    //postcond: prints each row of 2D integer array a on its own line
    // uses a FOREACH loop
    public static void print2( int[][] a ) {
        for(int[] r: a) {
	    int posi = 0; //used to keep track of location in each row
	    for(int c: r) {
		posi++;
		System.out.print(c); //dont have to use [] b/c of forEach nature
		if (posi != r.length) { //prevents commas on last element
		    System.out.print(", ");
		}
	    }
	    System.out.println(";"); //line breaking
        }
    }

    //postcond: returns sum of all items in 2D integer array a
    public static int sum1( int[][] a ) {
        int ans = 0;
        for(int[] r: a) {
	    for(int c: r) {
		ans += c; //just add each element to a variable
	    }
        }
        return ans; //return the variable HYNAH
    }

    //postcond: returns sum of all items in 2D integer array a
    // * uses helper fxn sumRow
    public static int sum2( int [][] m ) {
        int ans = 0;
        for (int r = 0; r < m.length; r++) { //uses for to enable easy use of index
	    //uncomment exactly one of these, or face my AUTHORITAH
	    //ans += sumRow2(r, m); //uses forEach
	    ans += sumRow(r, m); // uses For
        }
        return ans;
    }

    //postcond: returns sum of all items on row r of 2D integer array a
    // uses a FOR loop
    public static int sumRow( int r, int[][] a ) {
        int ans = 0;
        for (int c = 0; c < a[r].length; c++) {
	    ans += a[r][c]; //same as print just adding instead of printing
        }
        return ans;
    }

    //these two are just pieces of teh prior functions broken into helpers

    //postcond: returns sum of all items on row r of 2D integer array a
    // uses a FOREACH loop
    public static int sumRow2(int r, int[][] m){
        int ans = 0;
        for (int c:m[r]) { //cycles through all the elements of one row
	    ans += c; //just add all of those element into a variable
        }
        return ans;
    }

    //Good 'ole main method
    public static void main(String [] args) {
  
	  int [][] m1 = new int[4][2];
	  int [][] m2 = { {2,4,6}, {3,5,7} };
	  int [][] m3 = { {2}, {4,6}, {1,3,5} };
	  print1(m1);
	  System.out.println("\n }=============={ \n");
	  print1(m2);
	  System.out.println("\n }=============={ \n");
	  print1(m3);
	  System.out.println("\n }=============={ \n");
	  print2(m1);
	  System.out.println("\n }=============={ \n");
	  print2(m2);
	  System.out.println("\n }=============={ \n");
	  print2(m3);
	  System.out.println("\n }=============={ \n");
	  System.out.print("testing sum1...\n");
	  System.out.println("sum m1 : " + sum1(m1));
	  System.out.println("sum m2 : " + sum1(m2));
	  System.out.println("sum m3 : " + sum1(m3));
	  System.out.print("testing sum2...\n");
	  System.out.println("sum m1 : " + sum2(m1));
	  System.out.println("sum m2 : " + sum2(m2));
	  System.out.println("sum m3 : " + sum2(m3));

      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main

}//end class TwoDimArray
