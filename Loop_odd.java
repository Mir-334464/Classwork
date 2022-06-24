/*2: WAP find the difference between even and odd number  from 201 to 400;
    Total Even Number :
    Total Odd Number :
     Difference 
    Count of Even Number  :
    Count of Odd Number:*/

class Loop_odd
 
  {

    public static void main(String[]args)

        {

     int i=201;
     int sum=0;
     int count=0;
     int sum1=0;
     int count1=0;
while(i<=400)
  
   {

     if(i%2==0)
      
  {
        sum=sum+i;
        count++;
        }
 else 
     {
    sum1=sum1+i;
     count1++;
      }
i++;

  }

int Diff=sum-sum1;

System.out.println("\n\t\t\tSum of Even Numbers: "+sum);
System.out.println("\n\t\t\tSum of odd Numbers: "+sum1);   
System.out.println("\n\t\t\tDiffrence between even and odd numbers: "+Diff); 
System.out.println("\n\t\t\tCount of Even numbers: "+count);    
System.out.println("\n\t\t\tCount of odd numbers: "+count1);           
        
       }

    }


      