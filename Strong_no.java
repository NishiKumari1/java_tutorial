import java.util.Scanner;
class Strong_no
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int Number=sc.nextInt();
int temp,reminder,sum=0,i,factorial;
temp=Number;
while(temp>0)
{
factorial=1;
i=1;
reminder=temp%10;
while(i<=reminder)
{
factorial=i*factorial;
i++;
}
System.out.println(" The Factorial of " + reminder + "  =  " + factorial);
sum=sum+factorial;
temp=temp/10;
}
System.out.println(" The Sum of the Factorials of a Given Number " + Number + " =  " + sum);
if ( Number == sum )
{
System.out.println("\n " + Number + " is a Strong Number");
}
else
{
System.out.println("\n " + Number + " is Not a Strong Number");
}
}
}
