/*9 Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/

import java.util.*;

class Grade
{
  public static void main(String[]args)
{

 Scanner sc=new Scanner(System.in);

 System.out.println("\n\t\t\tEnter Marks in Below Subjects");
System.out.print("\n\t\t\t*****************************");

 System.out.print("\n\t\t\tEnter Marks Of Physics: ");

 int Physics=sc.nextInt();

System.out.print("\n\t\t\tEnter Marks Of Chemistry: ");

 int Chem=sc.nextInt();

System.out.print("\n\t\t\tEnter Marks Of Biology: ");

 int Bio=sc.nextInt();

System.out.print("\n\t\t\tEnter Marks Of Mathematics: ");

 int Maths=sc.nextInt();

System.out.print("\n\t\t\tEnter Marks Of Computer: ");

 int Comp=sc.nextInt();
System.out.print("\n\t\t\t*****************************");

int Marks=(Physics+Chem+Bio+Maths+Comp);
int Percent=((Marks*100)/500);

if(Percent>=90)

 System.out.println("\n\t\t\tGrade A");

else if(Percent>=80)

 System.out.println("\n\t\t\tGrade B");

else if(Percent>=70)

 System.out.println("\n\t\t\tGrade C");

else if(Percent>=60)

 System.out.println("\n\t\t\tGrade D");

else if(Percent>=40)

 System.out.println("\n\t\t\tGrade E");

else if(Percent<40)

 System.out.println("\n\t\t\tGrade F");

          }

}
   