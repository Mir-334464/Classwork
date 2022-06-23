import java.util.*;

class Boxer
{
  public static void main(String[]args)
{

 Scanner sc=new Scanner(System.in);
 
 System.out.print("\n\t\t\tEnter Weight of The Boxer: ");

 int Weight=sc.nextInt();

if(Weight<115)

 System.out.println("\n\t\t\tFlyweight");

else if(Weight>=115 && Weight<=121)
 
 System.out.println("\n\t\t\tBantaweight");

else if(Weight>=122 && Weight<=153)
 
 System.out.println("\n\t\t\tFeatherweight");

else if(Weight>=154 && Weight<=189)

 System.out.println("\n\t\t\tMiddleweight");

else if(Weight>=190)

 System.out.println("\n\t\t\tHeavyweight");

          }

}
   