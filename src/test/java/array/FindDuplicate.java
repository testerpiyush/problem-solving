package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

  /*public static void main(String[] args) {
    int[] str = {1,2,3,1,2};
   *//* Set<Integer> set = new HashSet<Integer>();

    for(int s:str){
      if(set.contains(s)){
        System.out.println("Duplicate element is "+s);
      }else{
        set.add(s);
      }
    }*//*
   find(str);
  }*/


  public static int removeDuplicateElements(int arr[], int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int[] temp = new int[n];
    int j = 0;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] != arr[i + 1]) {
        temp[j++] = arr[i];
      }
    }
    temp[j++] = arr[n - 1];
    // Changing original array
    for (int i = 0; i < j; i++) {
      arr[i] = temp[i];
    }
    return j;
  }

  public static void main(String[] args) {
    int arr[] = {10, 20, 20, 30, 30, 40, 50, 50};
    int length = arr.length;
    length = removeDuplicateElements(arr, length);
    //printing array elements
    for (int i = 0; i < length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

}
