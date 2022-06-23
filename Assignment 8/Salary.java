/*10 Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%*/

import java.util.*;

class Salary
{
  public static void main(String[]args)
{

 Scanner sc=new Scanner(System.in);
 
 System.out.print("\n\t\t\tEnter Basic Salary: ");

double Sal=sc.nextDouble();
double Gross,Gross1,Gross2;
double DA,HRA;

if(Sal<=10000)
{
 DA=(Sal*0.8);
HRA=(Sal*0.2);
Gross=(Sal+DA+HRA);
 System.out.println("\n\t\t\tGross Salary= " +Gross);
}

else if(Sal<=20000)
 {
DA=(Sal*0.9);
HRA=(Sal*0.25);
Gross1=(Sal+DA+HRA);
 System.out.println("\n\t\t\tGross Salary= " +Gross1);
}

else if(Sal>20000)
 {
DA=(Sal*0.95);
HRA=(Sal*0.3);
Gross2=(Sal+DA+HRA);
 System.out.println("\n\t\t\tGross Salary= " +Gross2);
}


          }

}
   