/*(2) Any character is entered through the keyboard, write a program to
determine whether the character entered is a capital letter, a small
case letter, a digit or a special symbol.
The following table shows the range of ASCII values for various
characters:
Characters   ASCII Values
A – Z      65 – 90
a – z      97 – 122
0 – 9     58 - 64
special symbols
48 – 57
0 - 47, 58 - 64, 91 - 96, 123 - 127(2) Any character is entered through the keyboard, write a program to
determine whether the character entered is a capital letter, a small
case letter, a digit or a special symbol.
The following table shows the range of ASCII values for various
characters:
Characters   ASCII Values
A – Z      65 – 90
a – z      97 – 122
0 – 9     58 - 64
special symbols
48 – 57
0 - 47, 58 - 64, 91 - 96, 123 - 127*/

import java.util.*;

class Ascii

{

 public static void main(String[]args)

    {

     Scanner sc=new Scanner(System.in);

  System.out.print("\n\t\t\tEnter Any Character: ");

char CH=sc.next().charAt(0);

if(CH>=65 && CH<=90)

System.out.println("\n\t\t\tEntered Character is Capital Letter");

else if(CH>=97 && CH<=122)

System.out.println("\n\t\t\tEntered Character is Small Letter");

else if(CH>=48 && CH<=57)

System.out.println("\n\t\t\tEntered Character is a Number");

else if(CH>=58 && CH<=64 || CH>=0 && CH<=47 || CH>=91 && CH<=96 || CH>=123 && CH<=127)

System.out.println("\n\t\t\tEntered Character is Special Symbol");

           }
}
