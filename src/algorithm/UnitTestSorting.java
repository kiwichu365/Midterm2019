package algorithm;

import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.List;


public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {

        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        int[] selectSort=sort.selectionSort(unSortedArray);
        int[] insertion=sort.insertionSort(unSortedArray);
        int[] bubbleSort=sort.bubbleSort(unSortedArray);
        int[] MergeSort=sort.bubbleSort(unSortedArray);
        //Selection sort
        System.out.print("Test Selection Sort: ");
        printValue(selectSort);

        System.out.println("\n"+"Test Insertion Sort: ");
        printValue(insertion);

        System.out.println("\n"+"Test bubbleSort Sort: ");
        printValue(bubbleSort);

        System.out.println("\n"+"Test MergeSort Sort: ");
        printValue(bubbleSort);

        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below

    }
    public static void printValue(int[] array){
        for(Integer st:array){
            System.out.print(st+",");
        }
    }
}
