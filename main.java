/*print hello world
public class myclass
{
    public static void main(String args[])
    {
       
        System.out.println("hello world");
        
    }
}*/


//operators (+,-,/,*,%)
/*addition 
public class myclass
{
    public static void main(String args[])
    {
        int a1=4 , b1=5 , sum;
        sum=a1+b1;
        System.out.println(sum);
        
    }
}*/


/*subtraction 
public class myclass
{
    public static void main(String args[])
    {
        int a1=56 , b1=34 , sub;
        sub=a1-b1;
        System.out.println(sub);
        
    }
}*/

/*multiply
public class myclass
{
    public static void main(String args[])
    {
        int a1=4 , b1=5 , mul;
        mul=a1*b1;
        System.out.println(mul);
        
    }
}*/

/*division
public class myclass
{
    public static void main(String args[])
    {
        int a1=35 , b1=5 , div;
        div=a1/b1;
        System.out.println(div);
        
    }
}*/

/*modolo
public class myclass
{
    public static void main(String args[])
    {
        int a1=34 , b1=5 , mod;
        mod=a1%b1;
        System.out.println(mod);
        
    }
}*/

/*write a program to factorial a number using resursion 
public class myclass
{
    public static void main(String args[])
    {
         int res=1;  int n= 5;
         for( int i=1;i<=5;i++)
         {
            res*=i;
            System.out.println(res);
         }
    }
}*/



// write a program tp print first 15 numbers in fibbonaci series
/*public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 15; // Number of terms to print
        int a = 0, b = 1;

        System.out.print("First " + n + " Fibonacci numbers: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}*/



//WAP to check weather a given number and string is palindrome or not. 
// class PalindromeExample{  
//     public static void main(String args[]){  
//      int r,sum=0,temp;    
//      int n=454;//It is the number variable to be checked for palindrome  
     
//      temp=n;    
//      while(n>0){    
//       r=n%10;  //getting remainder  
//       sum=(sum*10)+r;    
//       n=n/10;    
//      }    
//      if(temp==sum)    
//       System.out.println("palindrome number ");    
//      else    
//       System.out.println("not palindrome");    
//    }  
//    }


//WAP to check weather a given number is armstrong or not
   /*import java.util.Scanner;

   public class ArmstrongNumberCheck {
   
       // Method to check if a number is an Armstrong number
       public static boolean isArmstrong(int number) {
           int originalNumber = number;
           int result = 0;
           int n = 0;
   
           // Calculate the number of digits in the number
           int temp = number;
           while (temp != 0) {
               temp /= 10;
               n++;
           }
   
           // Calculate the sum of the nth power of each digit
           temp = number;
           while (temp != 0) {
               int digit = temp % 10;
               result += Math.pow(digit, n);
               temp /= 10;
           }
   
           // Check if the original number is equal to the sum
           return originalNumber == result;
       }
   
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
   
           // Input a number from the user
           System.out.print("Enter a number: ");
           int number = scanner.nextInt();
   
           // Check if the number is an Armstrong number
           if (isArmstrong(number)) {
               System.out.println(number + " is an Armstrong number.");
           } else {
               System.out.println(number + " is not an Armstrong number.");
           }
   
           scanner.close();
       }
   }
   











// Java program to illustrate nested-if statement
import java.util.*;

class NestedIfDemo {
	public static void main(String args[])
	{
		int i = 10;

		if (i == 10 || i<15) {
			// First if statement
			if (i < 15)
				System.out.println("i is smaller than 15");

			// Nested - if statement
			// Will only be executed if statement above
			// it is true
			if (i < 12)
				System.out.println(
					"i is smaller than 12 too");
		} else{
				System.out.println("i is greater than 15");
		}
	}
}




// Java program to illustrate if-else-if ladder
import java.util.*;

class ifelseifDemo {
	public static void main(String args[])
	{
		int i = 20;

		if (i == 10)
			System.out.println("i is 10");
		else if (i == 15)
			System.out.println("i is 15");
		else if (i == 20)
			System.out.println("i is 20");
		else
			System.out.println("i is not present");
	}
}





/*package whatever //do not write package name here 

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int num=20;
		switch(num){
		case 5 : System.out.println("It is 5");
					break;
		case 10 : System.out.println("It is 10");
					break;
		case 15 : System.out.println("It is 15");
					break;
		case 20 : System.out.println("It is 20");
					break;
		default: System.out.println("Not present");
			
		}
	}
}*/


public class main{
    public static void main(String[] args)
    {
        System.out.print("the sum of these no. is ");
        int a = 3;
        int b = 6;
        int c = 10;
        int sum= a+b+c;
        System.out.println(sum);
    }
}