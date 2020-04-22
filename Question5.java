import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Number of integers: "); //prompt user for number of integers
    int numOfInt = in.nextInt(); //read user input
    ArrayList<Integer> numList = new ArrayList<Integer>(); //create empty list
    while (numList.size() != numOfInt){ //condition: no. of elements in list not the same as no. of integers 
      String input = String.format("Number #%: ", numList.size()+1); //format for prompt
      System.out.print(input); //prompt user for integers
      int integer = in.nextInt(); //read user inputs
      numList.add(integer); //add user inputs to list
    }
    integer[] array = numList.toArray(new Integer[0]); //create array from list
    HashMap<integer, integer> hash = new HashMap<integer, integer>(); //create hashmap object
    int highestCount = 1;
    int highestValue = 0;
    for (int i = 0; i < numList.size(); i++){
      if (hash.get(array[i]) != null){
        int count = hash.get(array[i]); //get value of key
        count++; //increase by 1
        hash.put(array[i].count); //put key+value into hashmap
        if (count > max){
          highestCount = count;
          highestValue = array[i]; //set new value
        }
      }
    }
    System.out.print("Number with the highest occurrence: " + max);
  }
}
