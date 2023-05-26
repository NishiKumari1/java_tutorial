import java.util.Scanner;
class palindrome
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
int rev=0;
int temp=num;
while(num>0)
{
int ld=num%10;
rev=rev*10+ld;
num=num/10;
}
if(temp==rev)
{
System.out.print("no is palindrome");
}
else
{
System.out.print("not");
}
}
}
