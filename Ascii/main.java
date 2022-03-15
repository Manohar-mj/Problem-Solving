
import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char c=sc.next().charAt(0);	
		int i = c;
		System.out.println("ASCII value of "+c+" is "+i);
		sc.close();
	}
}
