/*1: WAP  print the total sum of square  from 1 to 20;
  Number   Square


Total            Value */

class Sum_Square

  {

      public static void main(String[]args)

        {

     int i=1; 
      int sum=0;

System.out.println("\n\t\t\tNumber          Square");


while(i<=20)

  {
   
 int Sq=i*i;

System.out.println("\n\t\t\t" +i+"              "+Sq);
 
 sum=sum+Sq;

i++;

}

System.out.println("\n\t\t\tTotal           "+sum);

         }

}

       
