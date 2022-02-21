import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab6Exercise5  {
    public static int getSecondSmallest(Integer[] arr)
      {
    	
    	List<Integer> al=Arrays.asList(arr); // array to list
    	Collections.sort(al);
    	int smallest= al.get(1);
    	return smallest;
    	  
      }

    public static void main(String[] args) {



    Integer[] arr= {20,15,5,80};
    int smallest=getSecondSmallest(arr);
    System.out.println("Second Smallest element:"+smallest);
    }
}