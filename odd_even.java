import java.util.Scanner;
class odd_even
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
odd_digit=0;
even_digit=0;
int i=1;
while(i<=n)
{
if(n%2==0)
{
even_digit++;
i++;
}
else
{
odd_digit++;
i++;
}
}
System.out.println(even_digit);
System.out.println(odd_digit);
}
}