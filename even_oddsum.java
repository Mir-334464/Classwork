
//in the above Question find the sum of Even and Odd Numbers
 
class even_oddsum
     {

         public static void main(String args[])
          {
           
             int n=34567834, i, rem, sum=0, s=0;

               i=n;
              while(i!=0)
                {
                 rem=i%10;
              if(rem%2==0)
                 sum=sum+rem;
 
               else
                 s=s+rem;

                i=i/10;
             
               }
          System.out.println("Sum of Even Number is: "+sum);
System.out.println("Sum of odd Number is: "+s);
 		         }
  }