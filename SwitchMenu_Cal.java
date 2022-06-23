import java.util.*;

class SwitchMenu_Cal

{
 
 public static void main(String[]args)

     {

 Scanner sc=new Scanner(System.in);

System.out.print("\n\t\t\tCalculator");

System.out.println("\n\t\t\t============");

       System.out.println("\n\t\t\t+:Addition");
       System.out.println("\n\t\t\t-:Substraction");
       System.out.println("\n\t\t\t*:Multiplication");
       System.out.print("\n\t\t\t/:Divison");

       System.out.println ("\n\t\t\t============");

      System.out.print("\n\t\t\tEnter your choice: ");
      char C=sc.next().charAt(0);

switch(C)
{

 case '+':
  {
       System.out.println("\n\t\t\tEnter Two Numbers ");
        System.out.print("\n\t\t\tEnter First Number: ");
       int A=sc.nextInt();
       System.out.print("\n\t\t\tEnter Second Number: ");
       int B=sc.nextInt();
       
      int Add=A+B;
      System.out.println ("\n\t\t\t============");
      System.out.println("\n\t\t\tResult:" +Add);
break;
}

case '-':
{

        System.out.println("\n\t\t\tEnter Two Numbers ");
        System.out.print("\n\t\t\tEnter First Number: ");
       int A=sc.nextInt();
       System.out.print("\n\t\t\tEnter Second Number: ");
       int B=sc.nextInt();
       
       int Sub=A-B;
       System.out.println ("\n\t\t\t============");
       System.out.println("\n\t\t\tResult:" +Sub);
break;
}

case '*':
{
       System.out.println("\n\t\t\tEnter Two Numbers ");

       System.out.print("\n\t\t\tEnter First Number: ");
       double A=sc.nextDouble();
       System.out.print("\n\t\t\tEnter Second Number: ");
       double B=sc.nextDouble();
       
       double Multi=A*B;
       System.out.println ("\n\t\t\t============");
       System.out.println("\n\t\t\tResult:" +Multi);
break;
}

case '/':
{

        System.out.println("\n\t\t\tEnter Two Numbers ");
        System.out.print("\n\t\t\tEnter First Number: ");
       double A=sc.nextDouble();
       System.out.print("\n\t\t\tEnter Second Number: ");
       double B=sc.nextDouble();
       
       double Div=A/B;
             System.out.println ("\n\t\t\t============");
       System.out.println("\n\t\t\tResult:" +Div);
break;
}

default:
System.out.println("\n\t\t\tEnter Valid Choice");

    }
  }
}



