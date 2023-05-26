import java.util.Scanner;
class Multiple
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
		if(c>0)
		{
		System.out.println("positive");
		}
		else
		{
		System.out.println("negative");
		}
	}
}