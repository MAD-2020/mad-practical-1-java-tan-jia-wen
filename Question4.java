import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Integer for triangle base: "); /*prompts user to give a number for base*/
    int base = in.nextInt(); /*reads user input*/
    for (int i = 0; i < base; i++) /*first loop for sentence number */
    {
      for (int j = base; j > i; j--) /*second loop for star position */
      {
        System.out.print("*"); /*prints out corresponding number of stars */
      }
      System.out.print("\n"); /*prints next row on a new line*/
  }
}
