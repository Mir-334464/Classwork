//WAP Input a number and separate it.
 
import java.util.*;
class separate
     {

         public static void main(String args[])
          {
            Scanner sc=new Scanner(System.in);

             System.out.println("Enter any number");
            int i=sc.nextInt();
              
                while(i!=0)
                {
                 
                int rem=i%10;
                 
                System.out.println(rem+" ");
                
                i=i/10;
               }
 
          }
  }