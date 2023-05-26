import java.util.Scanner;
class prime_no
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int i=2;
while(i<=n/2)
{
if(n%i==0)
break;
i++;
}
if(i>n/2)
{
System.out.println("Number is a prime number");
}
else
{
System.out.println("Number is not a prime number");
}
}
}
