// Team Incredibly Cohesive (David Chen, Orion Roven, Jaylen Zeng)
// APCS pd7
// HW51 -- implementing bubblesort
// 2022-01-03
// time spent: .5hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 0)Initialize variable that keeps track of how many swaps have occurred. 
 1)Starting at the right, compare elements adjacent to one another and swap them if necessary for sortedness. Add to swap counter accordingly.
 2)Continue this process until you reach the leftmost element
 3)If number stored in swap counter is greater than zero, restart the process from the beginning. Swap counter is also reset if this is the case.
 * DISCO
 * N/A
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: That the list is sorted
 * q1: After pass p, what do you know?
 * a1: We know that the first p elements are sorted and in the right place
 * q2: How many passes are necessary to completely sort?
 * a2: The length of the array - 1 for the worst case (elements were in descending order)
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    int swapCtr = 1;
    while (swapCtr > 0) {
      swapCtr = 0;
      for (int i = data.size() - 1 ; i > 0 ; i--) {
        if (data.get(i).compareTo(data.get(i-1)) < 0) {
          Comparable t = data.get(i);
          data.set(i, data.get(i-1));
          data.set(i-1, t);
          swapCtr += 1;
        }
      }
    }
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    ArrayList<Comparable> arrayCopy = new ArrayList<Comparable>();
    //copies contents of ArrayList input into a separate ArrayList
    for (int i = 0; i < input.size(); i++) {
        arrayCopy.add(input.get(i));
    }
    bubbleSortV(arrayCopy); //reusing void method to save time. I would've just reused the same code either way.
    return arrayCopy;

  }


  public static void main( String [] args )
  {

      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      /*===============for VOID methods=============
      ============================================*/
      System.out.println("\n--------------------------\n");
      ArrayList glen2 = new ArrayList<Integer>();
      glen2.add(7);
      glen2.add(1);
      glen2.add(5);
      glen2.add(12);
      glen2.add(3);
      System.out.println( "ArrayList glen2 before sorting:\n" + glen2 );
      ArrayList glen2Sorted = bubbleSort( glen2 );
      System.out.println( "sorted version of ArrayList glen2:\n"
      + glen2Sorted );
      System.out.println( "ArrayList glen2 after sorting:\n" + glen2 );
      ArrayList coco2 = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco2 before sorting:\n" + coco2 );
      ArrayList coco2Sorted = bubbleSort( coco2 );
      System.out.println( "sorted version of ArrayList coco2:\n"
      + coco2Sorted );
      System.out.println( "ArrayList coco2 after sorting:\n" + coco2 );
      //System.out.println( coco );
      /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class BubbleSort

