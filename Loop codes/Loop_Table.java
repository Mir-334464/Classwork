/*WAP input a number and print the Table of it.
      2  x 1= 2
      2  x  2 = 2*/

import java.util.*;

class Loop_Table

  {

   public static void main(String[]arg)

     {

      Scanner sc=new Scanner(System.in);

   System.out.print("\n\t\t\tEnter any number to print table: ");
    int n=sc.nextInt();

    int i=1;

while(i<=10)

  {
   
   int T=n*i;
  System.out.println("\n\t\t\t" +n+"*" +i+" = "+T);
i++;

      }
  }
}
    