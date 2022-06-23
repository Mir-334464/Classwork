
//8 Write a Java program to calculate profit or loss.

import java.util.*;

class Profit

   {

       public static void main(String[]args)

             {
               
              Scanner sc=new Scanner(System.in);

System.out.print("\n\t\t\tEnter the Cost Price of An Item: ");

int Cost=sc.nextInt();

System.out.print("\n\t\t\tEnter the Selling Price of An Item: ");

int Sell=sc.nextInt();

int Profit=(Sell-Cost);
int Loss=(Cost-Sell);

if(Sell>Cost)
{
System.out.println("\n\t\t\tSeller has made Profit");
System.out.println("\n\t\t\tProfit= " +Profit);
}

else
{
System.out.println("\n\t\t\tSeller has incurred loss");
System.out.println("\n\t\t\tLoss= " +Loss);
}

              }

}
