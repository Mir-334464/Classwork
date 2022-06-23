/*(1) Any year is entered through the keyboard, write a program to
determine whether the year is leap or not. Use the logical operators
&& and ||.*/

import java.util.*;

class Leap

{
 
 public static void main(String[]args)

    {

     Scanner sc=new Scanner(System.in);

System.out.print("\n\t\t\tEnter Any Year: ");

int Year=sc.nextInt();

if((Year%4==0 || Year%400==0) && Year%100!=0)

System.out.println("\n\t\t\tEntered Year is Leap Year");

else
System.out.println("\n\t\t\tEntered Year is not Leap Year");

           }
}

