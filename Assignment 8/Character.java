
/*(6) Using conditional operators determine:
(1) Whether the character entered through the keyboard is a
lower case alphabet or not.
(2) Whether a character entered through the keyboard is a special
symbol or not.*/

import java.util.*;

class Character

{

 public static void main(String[]args)

    {

     Scanner sc=new Scanner(System.in);

  System.out.print("\n\t\t\tEnter Any Character: ");

char C=sc.next().charAt(0);

if(C>=97 && C<=122)

System.out.println("\n\t\t\tEntered Character is Lower Case Alphabet");

else if(C>=65 && C<=90)

System.out.println("\n\t\t\tEntered Character is not Lower Case Alphabet");

else if(C>=58 && C<=64 || C>=0 && C<=47 || C>=91 && C<=96 || C>=123 && C<=127)

System.out.println("\n\t\t\tEntered Character is Special Symbol");

else

System.out.println("\n\t\t\tEntered Character is neither Special Symbol nor Lower Case Alphabet");

           }
}
