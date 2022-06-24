//find the sum of a number 34567834;
 
class sum_sep
     {

         public static void main(String args[])
          {
           
             int n=34567834, i, rem, sum=0;

               i=n;
              while(i!=0)
                {
                 rem=i%10;
                System.out.println(rem+" ");
                 sum=sum+rem;
                i=i/10;
               }
          System.out.println("Sum of given Number is: "+sum);
          }
  }