import java.util.Scanner;


class ArmstrongNumberCheck{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the value of x "); 
		int i = sc.nextInt();

		if (i < 15)
			System.out.println("Inside If block"); 
			System.out.println("10 is less than 15"); 
		    System.out.println("I am Not in if");
	}
}