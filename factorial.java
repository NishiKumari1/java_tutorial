import java.util.Scanner;
class factorial
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
int fac=1;
while(num!=0)
{
fac=num*fac;
num--;
}
System.out.println(fac);
}
}
