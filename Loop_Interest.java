/*3:WAP  calculate simple interest for 3 years , Amount rate and time inputted by user.
       Year :1 
                     
                     Amount=
                    Rate=
                   Interest:
                 Total Payable Amount=( Amunt+ Interest)
         Year : 2
                     
                     Amount=
                    Rate=
                   Interest:
                 Total Payable Amount=( Amunt+ Interest)
            Year :3 
                     
                     Amount=
                    Rate=
                   Interest:
                 Total Payable Amount=( Amunt+ Interest) */

import java.util.*;

class Loop_Interest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);


System.out.print("\n\t\t\tEnter Principle Amount : ");
			double p = sc.nextDouble();
		System.out.print("\t\t\tEnter Rate of Interest : ");
			double r = sc.nextDouble();
			double t = 3.0d;
		System.out.println("\t\t\t===========================================");
		 int i = 1;
		System.out.println("\t\t\t===========================================");

		while(i<=3)
		{
			if(i==1)
			{
				System.out.println("\t\t\tYear 1 :");
				double SI = (p*r*1)/100;
				System.out.println("\t\t\tPrinciple Amount is = " +p);
				System.out.println("\t\t\tRate of Interest is = " +r);
				System.out.println("\t\t\tTime Duration is = " +t);
				System.out.println("\t\t\tInterest Amount is = " +SI);
				double pa = p+SI;
				System.out.println("\t\t\t Total payable amount = " +pa);
				System.out.println("\t\t\t===========================================");
				System.out.println("\t\t\t===========================================");
				
			}

			else if(i==2)
			{
				System.out.println("\t\t\tYear 2 :");
				double SI = (p*r*2)/100;
				System.out.println("\t\t\tPrinciple Amount is = " +p);
				System.out.println("\t\t\tRate of Interest is = " +r);
				System.out.println("\t\t\tTime Duration is = " +t);
				System.out.println("\t\t\tInterest Amount is = " +SI);
				double pa = p+SI;
				System.out.println("\t\t\t Total payable amount = " +pa);
				System.out.println("\t\t\t===========================================");
				System.out.println("\t\t\t===========================================");


			}	
	
			else if(i==3 )
			{
				System.out.println("\t\t\tYear 3 :");
				double SI = (p*r*3)/100;
				System.out.println("\t\t\tPrinciple Amount is = " +p);
				System.out.println("\t\t\tRate of Interest is = " +r);
				System.out.println("\t\t\tTime Duration is = " +t);
				System.out.println("\t\t\tInterest Amount is = " +SI);
				double pa = p+SI;
				System.out.println("\t\t\t Total payable amount = " +pa);
				System.out.println("\t\t\t===========================================");
				System.out.println("\t\t\t===========================================");
			}
			i++;
		}
	}
}