// Team JZ Gang: Jason Zhou, Jaylen Zeng, Jomin Zhang
// APCS pd7
// HW71 -- Whut Dis.
// 2022-03-07m
// time spent: 0.5 hrs

/***
 * class Mysterion
 * tests preliminary hypotheses re: utility of mystery algo
 * 
 * <h1>It's a Bird, It's a Plane! It's.... MYSTERION</h1>
 * The Mysterion method ... Splits a given array into two parts with index c being the center. 
 * Afterwards, it sorts every element based on how their value compares to the value at index c. 
 * Smaller elements go on the left of c while bigger elements go on the right.
 * 
 * @author Trey Parker, Matt Stone
 * @version 3.1415926535897932384626433
 * @since 2022-03-07m
 *
 *        algo as pseudocode:
 *        ------------------------------
 *        v = arr[c]
 *        swap arr[c], arr[b]
 *        s = a
 *        for i in [a..b-1]
 *        if arr[i] < v
 *        swap arr[s], arr[i]
 *        s+=1
 *        swap arr[b], arr[s]
 * 
 *        DISCO: When a = 0, b = length -1, c= 0, all the arrays had the first
 *        two items sorted in ascending order, when c increases the number or
 *        sorted elements also increases
 *        after calling the function a function that it has previously finished
 *        working with, it would eventually sort the array.
 * 
 *        QCC: what is the best a, b, c for each array?
 * 
 *        q0: What does it do?
 *        a0: It takes a value which then makes it the center and splits the
 *        array into two. If it's greater, to the right, if less, to the left.
 * 
 *        q1: O(?)
 *        a1: We believe it is O(n) since it only traverses the array through b-
 *        1 - a which is linear.
 * 
 ***/

public class Mysterion {
    // --------------v HELPER METHODS v--------------
    // swap values at indices x, y in array o
    public static void swap(int x, int y, int[] o) {
        int tmp = o[x];
        o[x] = o[y];
        o[y] = tmp;
    }

    // print input array
    public static void printArr(int[] a) {
        for (int o : a)
            System.out.print(o + " ");
        System.out.println();
    }

    // shuffle elements of input array
    public static void shuffle(int[] d) {
        int tmp;
        int swapPos;
        for (int i = 0; i < d.length; i++) {
            tmp = d[i];
            swapPos = i + (int) ((d.length - i) * Math.random());
            swap(i, swapPos, d);
        }
    }

    // return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray(int s, int maxVal) {
        int[] retArr = new int[s];
        for (int i = 0; i < retArr.length; i++)
            retArr[i] = (int) (maxVal * Math.random());
        return retArr;
    }
    // --------------^ HELPER METHODS ^--------------

    /**
     * int mysterion(int[],int,int,int) --> splitSort
     * This method takes an array and splits the data into two sections. 
     * It does this by choosing a specified value (c/middle) to compare with all the other elements in the array.
     * All elements less than this chosen value go on the left of it while all the elements greater than it go on the right. 
     * NOTE: elements greater than this special value are not necessarily sorted. 
     * 
     * @param arr
     * @param a --> index of start --> @param start
     * @param b --> index of end  --> @param end
     * @param c --> index of splitting value.  --> @param center
     * @return int
     *
     */
    public static int splitSort(int arr[], int start, int end, int center) {
        var v = arr[center];
        swap(center, end, arr);
        var s = start;
        for (int i = start; i < (end - 1); i++) {
            if (arr[i] < v) {
                swap(s, i, arr);
                s += 1;
            }
        }
        swap(end, s, arr);
        return arr[s];
    }// end mysterion

    // main method for testing
    public static void main(String[] args) {

        // init test arrays of magic numbers
        int[] arr1 = { 8, 21, 17, 69, 343 };
        int[] arr3 = { 1, 28, 33, 4982, 37 };
        int[] arr4 = { 5, 4, 17, 9000, 6 };
        int[] arr5 = { 3, 0, 16, 599, 1024 };

        //setting a and b...
        int testA = 0;
        int testB = 4;

        // run mysterion on each array,
        // holding a & b fixed, varying c...
        for (int testC = 0; testC < 5; testC++) {
            System.out.println("arr1: ");
            printArr(arr1);
            splitSort(arr1, testA, testB, testC);
            System.out.println("after mysterion w/ a=0,b=4,c="
                    + testC + "...");
            printArr(arr1);
            System.out.println("-----------------------");

            System.out.println("arr3:");
            printArr(arr3);
            splitSort(arr3, testA, testB, testC);
            System.out.println("after mysterion w/ a=0,b=4,c="
                    + testC + "...");
            printArr(arr3);
            System.out.println("-----------------------");

            System.out.println("arr4:");
            printArr(arr4);
            splitSort(arr4, testA, testB, testC);
            System.out.println("after mysterion w/ a=0,b=4,c="
                    + testC + "...");
            printArr(arr4);
            System.out.println("-----------------------");

            System.out.println("arr5:");
            printArr(arr5);
            splitSort(arr5, testA, testB, testC);
            System.out.println("after mysterion w/ a=0,b=4,c="
                    + testC + "...");
            printArr(arr5);
            System.out.println("-----------------------");

        } // end main
    }
}// end class Mysterion